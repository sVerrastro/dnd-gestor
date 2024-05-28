package src;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sergio
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        super("Character Sheet");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        LabelNome = new javax.swing.JLabel();
        FieldNome = new javax.swing.JTextField();
        LabelAllineamento = new javax.swing.JLabel();
        FieldAllineamento = new javax.swing.JTextField();
        LabelLivello = new javax.swing.JLabel();
        FieldLivello = new javax.swing.JTextField("1");
        LabelPV = new javax.swing.JLabel();
        FieldPV = new javax.swing.JTextField();
        LabelRazza = new javax.swing.JLabel();
        FieldRazza = new javax.swing.JTextField();
        LabelClasse = new javax.swing.JLabel();
        FieldClasse = new javax.swing.JTextField();
        FieldSottorazza = new javax.swing.JTextField();
        LabelStatistiche = new javax.swing.JLabel();
        FieldStrVal = new javax.swing.JTextField();
        LabelStr = new javax.swing.JLabel();
        FieldDexVal = new javax.swing.JTextField();
        LabelDex = new javax.swing.JLabel();
        FieldIntVal = new javax.swing.JTextField();
        LabelInt = new javax.swing.JLabel();
        FieldCosVal = new javax.swing.JTextField();
        LabelCos = new javax.swing.JLabel();
        FieldCarVal = new javax.swing.JTextField();
        LabelCar = new javax.swing.JLabel();
        FieldSagVal = new javax.swing.JTextField();
        LabelSag = new javax.swing.JLabel();
        FieldStrMod = new javax.swing.JTextField();
        FieldDexMod = new javax.swing.JTextField();
        FieldCosMod = new javax.swing.JTextField();
        FieldIntMod = new javax.swing.JTextField();
        FieldSagMod = new javax.swing.JTextField();
        FieldCarMod = new javax.swing.JTextField();
        LabelTiriSalvezza = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaTiriSalvezza = new javax.swing.JTextArea();
        LabelLingue = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaLingue = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableCompetenze = new javax.swing.JTable();
        LabelCompetenze = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablePrivilegi = new javax.swing.JTable();
        LabelPrivilegi = new javax.swing.JLabel();
        LabelTrucchetti = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableTrucchetti = new javax.swing.JTable();
        LabelIncantesimi = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TableIncantesimi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelNome.setText("Nome:");

        FieldNome.setText(Main.character.nome);
        FieldNome.setEditable(false);
        FieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNomeActionPerformed(evt);
            }
        });

        LabelAllineamento.setText("Allineamento");

        FieldAllineamento.setText(Main.character.allineamento);
        FieldAllineamento.setEditable(false);
        FieldAllineamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldAllineamentoActionPerformed(evt);
            }
        });

        LabelLivello.setText("Livello");

        FieldLivello.setText("1");
        FieldLivello.setEditable(false);
        FieldLivello.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldLivelloActionPerformed(evt);
            }
        });

        LabelPV.setText("PV");

        FieldPV.setText(String.valueOf(Main.character.classe.punti_ferita));
        FieldPV.setEditable(false);
        FieldPV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPVActionPerformed(evt);
            }
        });

        LabelRazza.setText("Razza");

        FieldRazza.setText(Main.character.razza.name);
        FieldRazza.setEditable(false);
        FieldRazza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldRazzaActionPerformed(evt);
            }
        });

        LabelClasse.setText("Classe");

        FieldClasse.setText(Main.character.classe.name);
        FieldClasse.setEditable(false);
        FieldClasse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldClasseActionPerformed(evt);
            }
        });

        FieldSottorazza.setText(Main.character.razza.subrace);
        FieldSottorazza.setEditable(false);
        FieldSottorazza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldSottorazzaActionPerformed(evt);
            }
        });

        LabelStatistiche.setText("Statistiche");

        FieldStrVal.setText(String.valueOf(Main.character.classe.stats.elementAt(0).final_value));
        FieldStrVal.setEditable(false);

        LabelStr.setText("STR");

        FieldDexVal.setText(String.valueOf(Main.character.classe.stats.elementAt(1).final_value));
        FieldDexVal.setEditable(false);

        LabelDex.setText("DEX");

        FieldIntVal.setText(String.valueOf(Main.character.classe.stats.elementAt(3).final_value));
        FieldIntVal.setEditable(false);

        LabelInt.setText("INT");

        FieldCosVal.setText(String.valueOf(Main.character.classe.stats.elementAt(2).final_value));
        FieldCosVal.setEditable(false);

        LabelCos.setText("COS");

        FieldCarVal.setText(String.valueOf(Main.character.classe.stats.elementAt(5).final_value));
        FieldCarVal.setEditable(false);

        LabelCar.setText("CAR");

        FieldSagVal.setText(String.valueOf(Main.character.classe.stats.elementAt(4).final_value));
        FieldSagVal.setEditable(false);

        LabelSag.setText("SAG");

        FieldStrMod.setText(String.valueOf(Main.character.classe.stats.elementAt(0).modifier));
        FieldStrMod.setEditable(false);
        FieldStrMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldStrModActionPerformed(evt);
            }
        });

        FieldDexMod.setText(String.valueOf(Main.character.classe.stats.elementAt(1).modifier));
        FieldDexMod.setEditable(false);
        FieldDexMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldDexModActionPerformed(evt);
            }
        });

        FieldCosMod.setText(String.valueOf(Main.character.classe.stats.elementAt(2).modifier));
        FieldCosMod.setEditable(false);
        FieldCosMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCosModActionPerformed(evt);
            }
        });

        FieldIntMod.setText(String.valueOf(Main.character.classe.stats.elementAt(3).modifier));
        FieldIntMod.setEditable(false);
        FieldIntMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldIntModActionPerformed(evt);
            }
        });

        FieldSagMod.setText(String.valueOf(Main.character.classe.stats.elementAt(4).modifier));
        FieldSagMod.setEditable(false);
        FieldSagMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldSagModActionPerformed(evt);
            }
        });

        FieldCarMod.setText(String.valueOf(Main.character.classe.stats.elementAt(5).modifier));
        FieldCarMod.setEditable(false);
        FieldCarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldCarModActionPerformed(evt);
            }
        });

        LabelTiriSalvezza.setText("Tiri Salvezza");

        AreaTiriSalvezza.setColumns(20);
        AreaTiriSalvezza.setRows(5);
        AreaTiriSalvezza.setEditable(false);

        for (String tiro : Main.character.classe.save_throws) {
            AreaTiriSalvezza.append(tiro + ";\n");
        }

        jScrollPane1.setViewportView(AreaTiriSalvezza);

        LabelLingue.setText("Lingue");

        AreaLingue.setColumns(20);
        AreaLingue.setRows(5);
        AreaLingue.setEditable(false);

        for (String lingua : Main.character.razza.languages) {
            AreaLingue.append(lingua + ";\n");
        }
        for (String lingua : Main.character.classe.languages) {
            AreaLingue.append(lingua + ";\n");
        }

        jScrollPane2.setViewportView(AreaLingue);

        TableCompetenze.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Tipo", "Nome"
            }
        ));

        DefaultTableModel CompModel = (DefaultTableModel) TableCompetenze.getModel();
        for (Competence competenza : Main.character.razza.competences) {
            String[] comp = {competenza.type, competenza.nome};
            CompModel.addRow(comp);
        }
        for (Competence competenza : Main.character.classe.competenze) {
            String[] comp = {competenza.type, competenza.nome};
            CompModel.addRow(comp);
        }

        jScrollPane3.setViewportView(TableCompetenze);

        LabelCompetenze.setText("Competenze");

        TablePrivilegi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Tipo", "Nome"
            }
        ));

        DefaultTableModel PrivModel = (DefaultTableModel) TablePrivilegi.getModel();
        for (Privilege privilegio : Main.character.razza.privilegi) {
            String[] priv = {privilegio.tipo, privilegio.nome};
            PrivModel.addRow(priv);
        }
        for (Privilege privilegio : Main.character.classe.privilegi) {
            String[] priv = {privilegio.tipo, privilegio.nome};
            PrivModel.addRow(priv);
        }

        jScrollPane4.setViewportView(TablePrivilegi);

        LabelPrivilegi.setText("Privilegi");

        LabelTrucchetti.setText("Trucchetti");

        TableTrucchetti.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Nome"}
        ));

        DefaultTableModel CantripModel = (DefaultTableModel) TableTrucchetti.getModel();
        for (Cantrip trucchetto : Main.character.razza.cantrips) {
            String[] cantrip = {trucchetto.name};
            CantripModel.addRow(cantrip);
        }
        for (Cantrip trucchetto : Main.character.classe.cantrips) {
            String[] cantrip = {trucchetto.name};
            CantripModel.addRow(cantrip);
        }

        jScrollPane5.setViewportView(TableTrucchetti);

        LabelIncantesimi.setText("Incantesimi");

        TableIncantesimi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Nome"}
        ));

        DefaultTableModel SpellModel = (DefaultTableModel) TableIncantesimi.getModel();
        for (Spell incantesimo : Main.character.classe.spells) {
            String[] spell = {incantesimo.name};
            SpellModel.addRow(spell);
        }

        jScrollPane6.setViewportView(TableIncantesimi); // 

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelLivello)
                            .addComponent(LabelPV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FieldPV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldLivello, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelStatistiche)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelAllineamento)
                                            .addComponent(LabelNome))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(FieldAllineamento)
                                            .addComponent(FieldNome))
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LabelRazza)
                                            .addComponent(LabelClasse))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(FieldClasse)
                                            .addComponent(FieldRazza, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FieldSottorazza, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelTrucchetti)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelIncantesimi)
                                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(LabelCar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FieldCarVal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(LabelSag)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FieldSagVal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(LabelInt)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FieldIntVal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(LabelCos)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FieldCosVal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(LabelDex)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FieldDexVal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(LabelStr)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FieldStrVal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FieldIntMod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FieldSagMod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FieldCarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FieldStrMod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FieldDexMod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FieldCosMod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelTiriSalvezza)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelLingue)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelPrivilegi)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelCompetenze)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNome)
                    .addComponent(FieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelLivello)
                    .addComponent(FieldLivello, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelRazza)
                    .addComponent(FieldRazza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldSottorazza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelAllineamento)
                    .addComponent(FieldAllineamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPV)
                    .addComponent(FieldPV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelClasse)
                    .addComponent(FieldClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelPrivilegi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelStatistiche)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(FieldStrVal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelStr)
                                            .addComponent(FieldStrMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(FieldDexVal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelDex)
                                            .addComponent(FieldDexMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(FieldCosVal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelCos)
                                            .addComponent(FieldCosMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelLingue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelTiriSalvezza)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(FieldIntVal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelInt)
                                            .addComponent(FieldIntMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(FieldSagVal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelSag)
                                            .addComponent(FieldSagMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(FieldCarVal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelCar)
                                            .addComponent(FieldCarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelCompetenze)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelTrucchetti)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelIncantesimi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void FieldNomeActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void FieldAllineamentoActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void FieldLivelloActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void FieldPVActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void FieldRazzaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void FieldClasseActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void FieldSottorazzaActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void FieldStrModActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void FieldDexModActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void FieldCosModActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void FieldIntModActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void FieldSagModActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void FieldCarModActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextArea AreaLingue;
    private javax.swing.JTextArea AreaTiriSalvezza;
    private javax.swing.JTextField FieldAllineamento;
    private javax.swing.JTextField FieldCarMod;
    private javax.swing.JTextField FieldCarVal;
    private javax.swing.JTextField FieldClasse;
    private javax.swing.JTextField FieldCosMod;
    private javax.swing.JTextField FieldCosVal;
    private javax.swing.JTextField FieldDexMod;
    private javax.swing.JTextField FieldDexVal;
    private javax.swing.JTextField FieldIntMod;
    private javax.swing.JTextField FieldIntVal;
    private javax.swing.JTextField FieldLivello;
    private javax.swing.JTextField FieldNome;
    private javax.swing.JTextField FieldPV;
    private javax.swing.JTextField FieldRazza;
    private javax.swing.JTextField FieldSagMod;
    private javax.swing.JTextField FieldSagVal;
    private javax.swing.JTextField FieldSottorazza;
    private javax.swing.JTextField FieldStrMod;
    private javax.swing.JTextField FieldStrVal;
    private javax.swing.JLabel LabelAllineamento;
    private javax.swing.JLabel LabelCar;
    private javax.swing.JLabel LabelClasse;
    private javax.swing.JLabel LabelCompetenze;
    private javax.swing.JLabel LabelCos;
    private javax.swing.JLabel LabelDex;
    private javax.swing.JLabel LabelIncantesimi;
    private javax.swing.JLabel LabelInt;
    private javax.swing.JLabel LabelLingue;
    private javax.swing.JLabel LabelLivello;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelPV;
    private javax.swing.JLabel LabelPrivilegi;
    private javax.swing.JLabel LabelRazza;
    private javax.swing.JLabel LabelSag;
    private javax.swing.JLabel LabelStatistiche;
    private javax.swing.JLabel LabelStr;
    private javax.swing.JLabel LabelTiriSalvezza;
    private javax.swing.JLabel LabelTrucchetti;
    private javax.swing.JTable TableCompetenze;
    private javax.swing.JTable TableIncantesimi;
    private javax.swing.JTable TablePrivilegi;
    private javax.swing.JTable TableTrucchetti;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    // End of variables declaration                   
}
