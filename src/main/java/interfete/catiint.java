package interfete;

import newpackage.InterfataGraficaMagazinElectronice;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mycompany.magazinelectronice.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import newpackage.*;

public class catiint extends javax.swing.JFrame {

    Instances inst = new Instances();

    Device[] casca = inst.getInstancesArray("casti");
    Casti[] casti = (Casti[]) casca;

    public catiint() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        initializareComboBox();
        jButton1.setVisible(false);
        adaugaActionListenerComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new java.awt.Button();
        titlu = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        home = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(13, 143, 194));

        back.setBackground(new java.awt.Color(255, 51, 51));
        back.setLabel("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        titlu.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        titlu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlu.setText("Casti");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apasa pentru a vedea castile" }));

        jButton1.setText("Editeaza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        menu.setText("Home");

        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        menu.add(home);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titlu, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titlu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);

        InterfataGraficaMagazinElectronice home = new InterfataGraficaMagazinElectronice();
        home.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        this.setVisible(false);

        InterfataGraficaMagazinElectronice home = new InterfataGraficaMagazinElectronice();
        home.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedIndex = jComboBox1.getSelectedIndex();

        if (selectedIndex >= 0) {
            Casti selectedCasti = casti[selectedIndex];
            JFrame popup = new JFrame("Detalii Casti");
            popup.setSize(1000, 900);
            popup.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(0, 2)); // Layout pentru a afișa perechi etichetă-câmp text

            if (selectedIndex >= 0 && selectedIndex < casti.length) {
                JTextField textFieldMarca = new JTextField(selectedCasti.getMarca());
                JTextField textFieldModel = new JTextField(selectedCasti.getModel());
                JTextField textFieldCantitate = new JTextField(String.valueOf(selectedCasti.getCantitate()));
                JTextField textFieldAnAparitie = new JTextField(String.valueOf(selectedCasti.getAnAparitie()));
                JTextField textFieldPret = new JTextField(String.valueOf(selectedCasti.getPret()));
                JTextField textFieldCuloare = new JTextField(selectedCasti.getCuloare());
                JTextField textFieldContactCuUrechea = new JTextField(selectedCasti.getContactCuUrechea());
                JTextField textFieldPrincipiuDeFunctionare = new JTextField(selectedCasti.getPrincipiuDeFunctionare());
                JTextField textFieldTipConectivitate = new JTextField(selectedCasti.getTipConectivitate());
                JTextField textFieldLungimeCablu = new JTextField(String.valueOf(selectedCasti.getLungimeCablu()));
                JTextField textFieldRaspunsInFrecventa = new JTextField(String.valueOf(selectedCasti.getRaspunsInFrecventa()));
                JTextField textFieldAutonomie = new JTextField(String.valueOf(selectedCasti.getAutonomie()));
                JTextField textFieldImpedanta = new JTextField(String.valueOf(selectedCasti.getImpedanta()));
                JTextField textFieldGreutate = new JTextField(String.valueOf(selectedCasti.getGreutate()));
                JTextField textFieldSpl = new JTextField(String.valueOf(selectedCasti.getSpl()));

                addLabelAndTextField(panel, "Marca:", textFieldMarca);
                addLabelAndTextField(panel, "Model:", textFieldModel);
                addLabelAndTextField(panel, "Cantitate:", textFieldCantitate);
                addLabelAndTextField(panel, "An aparitie:", textFieldAnAparitie);
                addLabelAndTextField(panel, "Pret:", textFieldPret);
                addLabelAndTextField(panel, "Culoarea:", textFieldCuloare);
                addLabelAndTextField(panel, "Contactul cu urechea:", textFieldContactCuUrechea);
                addLabelAndTextField(panel, "Principiul de functionare:", textFieldPrincipiuDeFunctionare);
                addLabelAndTextField(panel, "Tip conectivitate:", textFieldTipConectivitate);
                addLabelAndTextField(panel, "Lungimea cablului", textFieldLungimeCablu);
                addLabelAndTextField(panel, "Raspuns in frecventa :", textFieldRaspunsInFrecventa);
                addLabelAndTextField(panel, "Autonomie:", textFieldAutonomie);
                addLabelAndTextField(panel, "Impedanta:", textFieldImpedanta);
                addLabelAndTextField(panel, "Greutate:", textFieldGreutate);
                addLabelAndTextField(panel, "Spl:", textFieldSpl);

                jButton1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String valoareMarca = textFieldMarca.getText();
                        String valoareModel = textFieldModel.getText();
                        int valoareCantitate = Integer.parseInt(textFieldCantitate.getText());
                        int valoareAnAparitie = Integer.parseInt(textFieldAnAparitie.getText());
                        float valoarePret = Float.parseFloat(textFieldPret.getText());
                        String valoareCuloare = textFieldCuloare.getText();
                        String valoareContactCuUrechea = textFieldContactCuUrechea.getText();
                        String valoarePrincipiuDeFunctionare = textFieldPrincipiuDeFunctionare.getText();
                        String valoareTipConectivitate = textFieldMarca.getText();
                        float valoareLungimeCablu = Float.parseFloat(textFieldLungimeCablu.getText());
                        float valoareRaspunsInFrecventa = Float.parseFloat(textFieldRaspunsInFrecventa.getText());
                        int valoareAutonomie = Integer.parseInt(textFieldAutonomie.getText());
                        int valoareImpedanta = Integer.parseInt(textFieldImpedanta.getText());
                        int valoareGreutate = Integer.parseInt(textFieldGreutate.getText());
                        int valoareSpl = Integer.parseInt(textFieldSpl.getText());

                        selectedCasti.setMarca(valoareMarca);
                        selectedCasti.setModel(valoareModel);
                        selectedCasti.setCantitate(valoareCantitate);
                        selectedCasti.setAnAparitie(valoareAnAparitie);
                        selectedCasti.setPret(valoarePret);
                        selectedCasti.setCuloare(valoareCuloare);
                        selectedCasti.setContactCuUrechea(valoareContactCuUrechea);
                        selectedCasti.setPrincipiuDeFunctionare(valoarePrincipiuDeFunctionare);
                        selectedCasti.setTipConectivitate(valoareTipConectivitate);
                        selectedCasti.setLungimeCablu(valoareLungimeCablu);
                        selectedCasti.setRaspunsInFrecventa(valoareRaspunsInFrecventa);
                        selectedCasti.setAutonomie(valoareAutonomie);
                        selectedCasti.setImpedanta(valoareImpedanta);
                        selectedCasti.setGreutate(valoareGreutate);
                        selectedCasti.setSpl(valoareSpl);
                        casti[selectedIndex].setMarca(selectedCasti.getMarca());
                        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(jButton1);
                        frame.dispose();
                        updateTextAreaWithSelectedCasti(selectedCasti);
                    }
                });
                panel.add(jButton1);
            }

            popup.add(panel);
            popup.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JDialog dialog = new JDialog(this, "Cautare", true);
        dialog.setLayout(new GridLayout(25, 0, 25, 5));
        jComboBox1.setSelectedIndex(0);
        JTextField textFieldMarca = new JTextField();
        JTextField textFieldModel = new JTextField();
        JTextField textFieldCantitate = new JTextField();
        JTextField textFieldAnAparitie = new JTextField();
        JTextField textFieldPret = new JTextField();
        JTextField textFieldCuloare = new JTextField();
        JTextField textFieldContactCuUrechea = new JTextField();
        JTextField textFieldPrincipiuDeFunctionare = new JTextField();
        JTextField textFieldTipConectivitate = new JTextField();
        JTextField textFieldLungimeCablu = new JTextField();
        JTextField textFieldRaspunsInFrecventa = new JTextField();
        JTextField textFieldAutonomie = new JTextField();
        JTextField textFieldImpedanta = new JTextField();
        JTextField textFieldGreutate = new JTextField();
        JTextField textFieldSpl = new JTextField();

        addLabelAndTextField1(dialog, "Marca:", textFieldMarca);
        addLabelAndTextField1(dialog, "Model:", textFieldModel);
        addLabelAndTextField1(dialog, "Cantitate:", textFieldCantitate);
        addLabelAndTextField1(dialog, "An aparitie:", textFieldAnAparitie);
        addLabelAndTextField1(dialog, "Pret:", textFieldPret);
        addLabelAndTextField1(dialog, "Culoare:", textFieldCuloare);
        addLabelAndTextField1(dialog, "Contact cu urechea:", textFieldContactCuUrechea);
        addLabelAndTextField1(dialog, "Princpiu de functionare:", textFieldPrincipiuDeFunctionare);
        addLabelAndTextField1(dialog, "Tip conectivitate:", textFieldTipConectivitate);
        addLabelAndTextField1(dialog, "Lungime cablu:", textFieldLungimeCablu);
        addLabelAndTextField1(dialog, "raspuns in frecventa:", textFieldRaspunsInFrecventa);
        addLabelAndTextField1(dialog, "Autonomie:", textFieldAutonomie);
        addLabelAndTextField1(dialog, "Impedanta:", textFieldImpedanta);
        addLabelAndTextField1(dialog, "Greutate:", textFieldGreutate);
        addLabelAndTextField1(dialog, "Spl:", textFieldSpl);

        StringBuilder resultBuilder = new StringBuilder();

        JButton searchButton = new JButton("Cauta");
        searchButton.addActionListener(event -> {
            String marca = textFieldMarca.getText().trim();
            String model = textFieldModel.getText().trim();
            String cantitateText = textFieldCantitate.getText().trim();
            String anAparitieText = textFieldAnAparitie.getText().trim();
            String pretText = textFieldPret.getText().trim();
            String culoare = textFieldCuloare.getText().trim();
            String contactCuUrechea = textFieldContactCuUrechea.getText().trim();
            String principiuDeFunctionare = textFieldPrincipiuDeFunctionare.getText().trim();
            String tipConectivitate = textFieldTipConectivitate.getText().trim();
            String lungimeCablu = textFieldLungimeCablu.getText().trim();
            String raspunsInFrecventa = textFieldRaspunsInFrecventa.getText().trim();
            String autonomie = textFieldAutonomie.getText().trim();
            String impedanta = textFieldImpedanta.getText().trim();
            String greutate = textFieldGreutate.getText().trim();
            String spl = textFieldSpl.getText().trim();

            java.util.List< Casti> foundDevices = new ArrayList<>();
            boolean emptyTextFields = false;

            if (marca.isEmpty() && model.isEmpty()
                    && cantitateText.isEmpty() && anAparitieText.isEmpty()
                    && pretText.isEmpty() && culoare.isEmpty()
                    && contactCuUrechea.isEmpty() && principiuDeFunctionare.isEmpty()
                    && tipConectivitate.isEmpty() && lungimeCablu.isEmpty()
                    && raspunsInFrecventa.isEmpty() && autonomie.isEmpty()
                    && impedanta.isEmpty() && greutate.isEmpty() && spl.isEmpty()) {
                emptyTextFields = true;
            }
            if (emptyTextFields) {
                foundDevices.addAll(Arrays.asList(casti));
            } else {
                for (Casti instance : casti) {
                    boolean match = true;
                    if (!marca.isEmpty() && !instance.getMarca().equals(marca)
                            || !model.isEmpty() && !instance.getModel().equals(model)
                            || !cantitateText.isEmpty() && instance.getCantitate() != Integer.parseInt(cantitateText)
                            || !anAparitieText.isEmpty() && instance.getAnAparitie() != Integer.parseInt(anAparitieText)
                            || !pretText.isEmpty() && instance.getPret() != Float.parseFloat(pretText)
                            || !culoare.isEmpty() && instance.getCuloare().equals(culoare)
                            || !contactCuUrechea.isEmpty() && !instance.getContactCuUrechea().equals(contactCuUrechea)
                            || !principiuDeFunctionare.isEmpty() && !instance.getPrincipiuDeFunctionare().equals(principiuDeFunctionare)
                            || !tipConectivitate.isEmpty() && !instance.getTipConectivitate().equals(tipConectivitate)
                            || !lungimeCablu.isEmpty() && instance.getLungimeCablu() != Float.parseFloat(lungimeCablu)
                            || !raspunsInFrecventa.isEmpty() && instance.getRaspunsInFrecventa() != Float.parseFloat(raspunsInFrecventa)
                            || !autonomie.isEmpty() && instance.getAutonomie() != Integer.parseInt(autonomie)
                            || !impedanta.isEmpty() && instance.getImpedanta() != Integer.parseInt(impedanta)
                            || !greutate.isEmpty() && instance.getGreutate() != Integer.parseInt(greutate)
                            || !spl.isEmpty() && instance.getSpl() != Integer.parseInt(spl)) {
                        match = false;
                    }

                    if (match) {
                        foundDevices.add(instance);
                    }
                }
            }
            if (foundDevices.isEmpty()) {
                if (!emptyTextFields) {
                    jTextArea1.setText("NU S-A GASIT NICIUN PRODUS");
                    dialog.dispose();
                }
            } else {
                for (Casti casti : foundDevices) {
                    resultBuilder.append(casti).append("\n\n");
                }

                jTextArea1.setText(resultBuilder.toString());
                dialog.dispose();
            }
        });

        dialog.add(searchButton);
        dialog.setSize(600, 800);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void updateTextAreaWithSelectedCasti(Casti selectedCasti) {
        jTextArea1.setText(selectedCasti.toString());
    }

    private void addLabelAndTextField1(JDialog panel, String labelText, JTextField textField) {
        JLabel label = new JLabel(labelText);
        panel.add(label);
        panel.add(textField);

    }

    private void addLabelAndTextField(JPanel panel, String labelText, JTextField textField) {
        JLabel label = new JLabel(labelText);
        panel.add(label);
        panel.add(textField);
    }

    private void initializareComboBox() {
        String[] nume = new String[casti.length + 1];
        nume[0] = "Alege Casti";

        for (int i = 0; i < casti.length; i++) {
            String marca = casti[i].getMarca();
            String model = casti[i].getModel();
            nume[i + 1] = marca + " " + model;
        }
        jComboBox1.setModel(new DefaultComboBoxModel<>(nume));
    }

    private void adaugaActionListenerComboBox() {
        jComboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = jComboBox1.getSelectedIndex();
                if (selectedIndex >= 1 && selectedIndex - 1 < casti.length) {
                    Object obiectSelectat = casti[selectedIndex - 1];
                    String textAfisat = obiectSelectat.toString();
                    jTextArea1.setText(textAfisat);
                    jButton1.setVisible(true); 
                } else {
                    jTextArea1.setText("");
                    jButton1.setVisible(false);
                }
            }
        });
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
            java.util.logging.Logger.getLogger(catiint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(catiint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(catiint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(catiint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new catiint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button back;
    private javax.swing.JMenuItem home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu menu;
    private javax.swing.JLabel titlu;
    // End of variables declaration//GEN-END:variables
}
