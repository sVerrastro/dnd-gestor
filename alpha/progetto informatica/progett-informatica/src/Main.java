package src;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Main {

    static Personaggio character = new Personaggio();
    static JComboBox<String> sottorazze;

    static JFrame frame;
    static JPanel panel;
    static GridBagConstraints gbc;
    private static String username;

    public static void setUsername(String user){
        username = user;
    }
    public static void main(String[] args) {
        character.razza = new Razza("Elfo");
        character.razza.subrace = "Elfo Alto";
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    public static void createAndShowGUI() {
        frame = new JFrame("Character Creator");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setLayout(new GridBagLayout());

        gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Character Name
        JLabel nameLabel = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(nameLabel, gbc);

        JTextField nameField = new JTextField(15);
        gbc.gridx = 1;
        panel.add(nameField, gbc);

        // Character Alignment
        JLabel alignmentLabel = new JLabel("Alignment:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(alignmentLabel, gbc);

        // JComboBox per l'allineamento
        String[] alignmentOptions = {"Legale Buono", "Neutrale Buono", "Caotico Buono", "Legale Neutrale", "Neutrale", "Caotico Neutrale", "Legale Malvagio", "Neutrale Malvagio", "Caotico Malvagio"};
        JComboBox<String> alignmentComboBox = new JComboBox<>(alignmentOptions);
        gbc.gridx = 1;
        panel.add(alignmentComboBox, gbc);

        // Race Selection
        JLabel raceLabel = new JLabel("Race:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(raceLabel, gbc);

        String[] lista_razze = {"Elfo", "Halfling", "Nano", "Dragonide", "Gnomo", "Tiefling"};
        JComboBox<String> razze = new JComboBox<>(lista_razze);
        razze.setSelectedItem("Elfo");
        gbc.gridx = 1;
        panel.add(razze, gbc);

        razze.addItemListener(ActionEvent -> trovaSottoRazza(String.valueOf(razze.getSelectedItem())));

        // Subrace Selection (initially hidden)
        JLabel subraceLabel = new JLabel("Subrace:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(subraceLabel, gbc);

        String[] emptyArray = {"Elfo Alto", "Elfo dei Boschi", "Elfo Oscuro"};
        sottorazze = new JComboBox<>(emptyArray);
        sottorazze.setSelectedItem("Elfo Alto");
        gbc.gridx = 1;
        panel.add(sottorazze, gbc);

        // Class Selection
        JLabel classLabel = new JLabel("Class:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(classLabel, gbc);

        String[] lista_classi = {"Barbaro", "Bardo", "Chierico", "Druido", "Guerriero", "Ladro", "Mago", "Monaco", "Paladino", "Ranger", "Stregone", "Warlock"};
        JComboBox<String> classi = new JComboBox<>(lista_classi);
        classi.setSelectedItem("Barbaro");
        gbc.gridx = 1;
        panel.add(classi, gbc);

        // Selection Button
        JButton bottone = new JButton("SELEZIONA");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.CENTER;
        panel.add(bottone, gbc);

        bottone.addActionListener(ActionEvent -> clicca(classi, nameField, alignmentComboBox));

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void trovaSottoRazza(String razza) {
        try {
            panel.remove(sottorazze);
        } catch (Exception e) {}

        Razza race = new Razza(razza);
        character.razza = race;

        if (race.hasSubRace) {
            sottorazze = new JComboBox<>(race.sottorazze);
            gbc.gridx = 1;
            gbc.gridy = 3;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            panel.add(sottorazze, gbc);
            sottorazze.setVisible(true);
        } else {
            sottorazze = new JComboBox<>();
            sottorazze.setVisible(false);
        }

        panel.validate();
        panel.repaint();
    }

    private static Classe scegliClasse(String string) {
        return new Classe(string);
    }
    public static void clicca(JComboBox<String> classi, JTextField nameField, JComboBox<String> alignmentComboBox) {
        character.nome = nameField.getText();
        character.allineamento = String.valueOf(alignmentComboBox.getSelectedItem());
    
        try {
            String sottorazza = (String.valueOf(sottorazze.getSelectedItem()));
            character.razza.subrace = sottorazza;
            character.razza.addTraits(sottorazza);
        } catch (Exception e) {
            String sottorazza = ("nessuna");
            character.razza.subrace = sottorazza;
            character.razza.addTraits(character.razza.name);
        }
    
        character.classe = scegliClasse(String.valueOf(classi.getSelectedItem()));
        try {
            String directoryPath = "progett-informatica\\src\\UserData";
            String nomeFile = directoryPath + File.separator + username + ".txt";
    
            // Crea la directory se non esiste
            File directory = new File(directoryPath);
            if (!directory.exists()) {
                directory.mkdirs();
            }
    
            PrintWriter writer = new PrintWriter(new FileWriter(new File(nomeFile)));
    
            //#region debug
            writer.println("DEBUG----------");
            writer.println("Name: " + character.nome);
            writer.println("Alignment: " + character.allineamento);
            writer.println("Razza: " + character.razza.name);
            writer.println("Sottorazza: " + character.razza.subrace);
            writer.println("Classe: " + character.classe.name);
    
            writer.println("PV: " + character.classe.punti_ferita);
    
            writer.print("Tiri salvezza: ");
            for (String saves : character.classe.save_throws) {
                writer.print(saves + "; ");
            }
    
            writer.println("");
            writer.print("Languages: ");
            for (String lingua : character.razza.languages) {
                writer.print(lingua + "; ");
            }
            for (String lingua : character.classe.languages) {
                writer.print(lingua + "; ");
            }
    
            writer.println("");
            int count = 0;
            for (Privilege privilegio : character.razza.privilegi) {
                count++;
                writer.println("Priv" + count + ") Nome: " + privilegio.nome + "| Descrizione: " + privilegio.descrizione);
            }
            for (Privilege privilegio : character.classe.privilegi) {
                count++;
                writer.println("Priv" + count + ") Nome: " + privilegio.nome + "| Descrizione: " + privilegio.descrizione);
            }
    
            count = 0;
            for (Competence competenza : character.razza.competences) {
                count++;
                writer.println("Comp" + count + ") Nome: " + competenza.nome + "| Tipo: " + competenza.type);
            }
            for (Competence competenza : character.classe.competenze) {
                count++;
                writer.println("Comp" + count + ") Nome: " + competenza.nome + "| Tipo: " + competenza.type);
            }
    
            count = 0;
            for (Bonus bonus : character.razza.bonuses) {
                int index = 0;
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
    
            writer.println("\nSTATS)");
            for (Stats statistica : character.classe.stats) {
                writer.println(statistica.name + ": " + statistica.final_value + ", (mod" + statistica.modifier + ")");
            }
    
            writer.println("\nCANTRIPS)");
            for (Cantrip trucchetto : character.razza.cantrips) {
                writer.println(trucchetto.name);
            }
            for (Cantrip trucchetto : character.classe.cantrips) {
                writer.println(trucchetto.name);
            }
    
            writer.println("\nSPELLS)");
            for (Spell incantesimo : character.classe.spells) {
                writer.println(incantesimo.name);
            }
            //#endregion debug
    
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        JFrame finestra = new NewJFrame();
        finestra.setVisible(true);
    
        // Chiudi la finestra di creazione
        frame.dispose();
    }
}
