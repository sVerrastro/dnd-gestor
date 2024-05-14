import javax.swing.*;
import java.awt.*;

public class Main {
    
    static Personaggio character = new Personaggio();
    static JComboBox<String> sottorazze;

    static JFrame frame;
    static JPanel panel;
    static GridBagConstraints gbc;
    public static void main(String[] args) {

        //razze
        String[] lista_razze = {"Elfo", "Halfling", "Nano", "Dragonide", "Gnomo", "Tiefling"};
        JComboBox<String> razze = new JComboBox<>(lista_razze);
        razze.addItemListener(ActionEvent -> scegliRazza(String.valueOf(razze.getSelectedItem())));

        //classi
        String[] lista_classi = {"Barbaro", "Bardo", "Chierico", "Druido", "Guerriero", "Ladro", "Mago", "Monaco", "Paladino", "Ranger", "Stregone", "Warlock"};
        JComboBox<String> classi = new JComboBox<>(lista_classi);

        //bottone
        JButton bottone = new JButton("SELEZIONA");
        bottone.addActionListener(ActionEvent -> clicca(classi));

        //frame
        frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //panel
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        //gbc
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        //row 0
        gbc.gridy = 0;

            //col 0
            gbc.gridx = 0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            panel.add(razze, gbc);

        //row 1
        gbc.gridy = 1;

            //col 0
            gbc.gridx = 0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            panel.add(classi, gbc);

        //row 2
        gbc.gridy = 2;

            //col 0
            gbc.gridx = 0;
            gbc.gridwidth = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            panel.add(bottone, gbc);
        
        frame.add(panel);
        frame.setVisible(true);
    }

    private static void scegliRazza(String razza) {

        try {
            panel.remove(sottorazze);
        } catch (Exception e) {}
        
        Razza race = new Razza(razza);
        character.razza = race;

        if (race.hasSubRace) {
            
            sottorazze = new JComboBox<>(race.sottorazze);

            //row 0
            gbc.gridy = 0;

            //col 1
            gbc.gridx = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            panel.add(sottorazze, gbc);

        } else {
            //row 0
            gbc.gridy = 0;

            //col 1
            gbc.gridx = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            panel.add(new JLabel(""), gbc);
        }

        panel.validate();
        panel.repaint();
    }

    private static Classe scegliClasse(String string) {
        return new Classe(string);
    }

    public static void clicca(JComboBox<String> classi) {
        try {
            String sottorazza = (String.valueOf(sottorazze.getSelectedItem()));
            character.razza.subrace = sottorazza;
            character.razza.addTraits(sottorazza);
        } catch (Exception e) {
            character.razza.addTraits(character.razza.name);
        }

        character.classe = scegliClasse(String.valueOf(classi.getSelectedItem()));

        System.out.println("DEBUG----------");
        System.out.println("Razza) " + character.razza.name);
        System.out.println("Sottorazza) " + character.razza.subrace);
        System.out.println("Classe) " + character.classe.name);

        System.out.println("PV) " + character.classe.punti_ferita);

        System.out.print("Tiri salvezza) ");
        for (String saves : character.classe.save_throws) {
            System.out.print(saves + "; ");
        }

        System.out.println("");
        System.out.print("Languages) ");
        for (String lingua : character.razza.languages) {
            System.out.print(lingua + "; ");
        }
        for (String lingua : character.classe.languages) {
            System.out.print(lingua + "; ");
        }

        System.out.println("");
        int count = 0;
        for (Privilege privilegio : character.razza.privilegi) {
            count++;
            System.out.println("Priv" + count + ") Nome: " + privilegio.nome + "| Descrizione: " + privilegio.descrizione);
        }
        for (Privilege privilegio : character.classe.privilegi) {
            count++;
            System.out.println("Priv" + count + ") Nome: " + privilegio.nome + "| Descrizione: " + privilegio.descrizione);
        }

        count = 0;
        for (Competence competenza : character.razza.competences) {
            count++;
            System.out.println("Comp" + count + ") Nome: " + competenza.nome + "| Tipo: " + competenza.type);
        }
        for (Competence competenza : character.classe.competenze) {
            count++;
            System.out.println("Comp" + count + ") Nome: " + competenza.nome + "| Tipo: " + competenza.type);
        }

        count = 0;
        for (Bonus bonus : character.razza.bonuses) {

            int index = 0;
            System.out.println("\nDEBUG>> bonus: " + bonus.value);
            switch (bonus.nome) {
                case "Forza": index = 0; break;
                case "Destrezza": index = 1; break;
                case "Costituzione": index = 2; break;
                case "Intelligenza": index = 3; break;
                case "Saggezza": index = 4; break;
                case "Carisma": index = 5; break;
            }

            character.classe.stats.elementAt(index).addBonus(bonus.value);
        }

        System.out.println("\nSTATS)");
        for (Stats statistica : character.classe.stats) {
            System.out.println(statistica.name + ": " + statistica.final_value + ", (mod" + statistica.modifier + ")");
        }

        System.out.println("\nCANTRIPS)");
        for (Cantrip trucchetto : character.razza.cantrips) {
            System.out.println(trucchetto.name);
        }
        for (Cantrip trucchetto : character.classe.cantrips) {
            System.out.println(trucchetto.name);
        }

        System.out.println("\nSPELLS)");
        for (Spell incantesimo : character.classe.spells) {
            System.out.println(incantesimo.name);
        }

    }
}
