/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfete;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mycompany.magazinelectronice.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import newpackage.*;

/**
 *
 * @author Razvan
 */
public class tabletaint extends javax.swing.JFrame {
    Instances inst = new Instances();
    
    Device[] tab = inst.getInstancesArray("teblete");
    Tableta[] tablete = (Tableta[]) tab;

    /**
     * Creates new form tabletaint
     */
    public tabletaint() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        initializareComboBox(); 
        jButton1.setVisible(false);
        adaugaActionListenerComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new java.awt.Button();
        titlu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        home = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back.setBackground(new java.awt.Color(255, 51, 51));
        back.setLabel("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        titlu.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        titlu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlu.setText("Tablete");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Editare detalii Tableta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                .addGap(105, 105, 105)
                .addComponent(titlu, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE))
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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selectedIndex = jComboBox1.getSelectedIndex();

        Tableta selectedTablet = tablete[selectedIndex];
        JFrame popup = new JFrame("Detalii Telefon");
    popup.setSize(1000, 900);
    popup.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(0, 2)); 
       
    if (selectedIndex >= 0 && selectedIndex < tablete.length) {
        JTextField textFieldMarca = new JTextField(selectedTablet.getMarca());
        JTextField textFieldModel = new JTextField(selectedTablet.getModel());
        JTextField textFieldCantitate = new JTextField(String.valueOf(selectedTablet.getCantitate()));
        JTextField textFieldAnAparitie = new JTextField(String.valueOf(selectedTablet.getAnAparitie()));
        JTextField textFieldPret = new JTextField(String.valueOf(selectedTablet.getPret()));        
        JTextField textFieldProcesor = new JTextField(selectedTablet.getProcesor());
        JTextField textFieldTipEcran = new JTextField(selectedTablet.getTipEcran());
        JTextField textFieldCuloare = new JTextField(selectedTablet.getCuloare());
        JTextField textFieldFrecventaAntena = new JTextField(selectedTablet.getFrecventaAntena());
        JTextField textFieldSisOpTel = new JTextField(selectedTablet.getSisOpTab());
        JTextField textFieldTipIncarcare = new JTextField(selectedTablet.getTipIncarcare());
        JTextField textFieldTipSim = new JTextField(selectedTablet.getTipSim());
        JTextField textFieldRezEcran = new JTextField(selectedTablet.getRezEcran());
        JTextField textFieldRezCamere = new JTextField(selectedTablet.getRezCamere());
        JTextField textFieldMemorieROM = new JTextField(String.valueOf(selectedTablet.getMemorieROM()));
        JTextField textFieldMemorieRAM = new JTextField(String.valueOf(selectedTablet.getMemorieRAM()));
        JTextField textFieldNrCamere = new JTextField(String.valueOf(selectedTablet.getNrCamere()));
        JTextField textFieldMarimeBat = new JTextField(String.valueOf(selectedTablet.getMarimeBat()));
        JTextField textFieldDiagonalaEcran = new JTextField(String.valueOf(selectedTablet.getDiagonalaEcran()));
    
        addLabelAndTextField(panel, "Marca:", textFieldMarca);
        addLabelAndTextField(panel, "Model:", textFieldModel);
        addLabelAndTextField(panel, "Cantitate:", textFieldCantitate);
        addLabelAndTextField(panel, "An aparitie:", textFieldAnAparitie);
        addLabelAndTextField(panel, "Pret:", textFieldPret);
        addLabelAndTextField(panel, "Procesor:", textFieldProcesor);
        addLabelAndTextField(panel, "Tip ecran:", textFieldTipEcran);
        addLabelAndTextField(panel, "Culoare:", textFieldCuloare);
        addLabelAndTextField(panel, "Frecventa antena:", textFieldFrecventaAntena);
        addLabelAndTextField(panel, "Sistem de operare:", textFieldSisOpTel);
        addLabelAndTextField(panel, "Tip încărcare:", textFieldTipIncarcare);
        addLabelAndTextField(panel, "Tip SIM:", textFieldTipSim);
        addLabelAndTextField(panel, "Rezoluție ecran:", textFieldRezEcran);
        addLabelAndTextField(panel, "Rezoluție camere:", textFieldRezCamere);
        addLabelAndTextField(panel, "Memorie ROM:", textFieldMemorieROM);
        addLabelAndTextField(panel, "Memorie RAM:", textFieldMemorieRAM);
        addLabelAndTextField(panel, "Număr camere:", textFieldNrCamere);
        addLabelAndTextField(panel, "Mărime baterie:", textFieldMarimeBat);
        addLabelAndTextField(panel, "Diagonala ecran:", textFieldDiagonalaEcran);    
        JButton saveButton = new JButton("Salvează");

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              String valoareMarca = textFieldMarca.getText();
              String valoareModel = textFieldModel.getText();
              int valoareCantitate =Integer.parseInt (textFieldCantitate.getText());
              int valoareAnAparitie = Integer.parseInt (textFieldAnAparitie.getText());
              float valoarePret = Float.parseFloat(textFieldPret.getText());
              String valoareProcesor = textFieldProcesor.getText();
              String valoareTipEcran = textFieldTipEcran.getText();
              String valoareCuloare = textFieldCuloare.getText();
              String valoareFrecventaAntena = textFieldFrecventaAntena.getText();
              String valoareSisOpTel = textFieldSisOpTel.getText();
              String valoareTipIncarcare = textFieldTipIncarcare.getText();
              String valoareTipSim = textFieldTipSim.getText();
              String valoareRezEcran = textFieldRezEcran.getText();
              String valoareRezCamere = textFieldRezCamere.getText();
              int valoareMemorieROM = Integer.parseInt(textFieldMemorieROM.getText());
              int valoareMemorieRAM = Integer.parseInt(textFieldMemorieRAM.getText());
              int valoareNrCamere = Integer.parseInt(textFieldNrCamere.getText());
              int valoareMarimeBat = Integer.parseInt(textFieldMarimeBat.getText());
              float valoareDiagonalaEcran = Float.parseFloat(textFieldDiagonalaEcran.getText());
              
              selectedTablet.setMarca(valoareMarca);
              selectedTablet.setModel(valoareModel);
              selectedTablet.setCantitate(valoareCantitate);
              selectedTablet.setAnAparitie(valoareAnAparitie);
              selectedTablet.setPret(valoarePret);              
              selectedTablet.setProcesor(valoareProcesor);
              selectedTablet.setTipEcran(valoareTipEcran);
              selectedTablet.setCuloare(valoareCuloare);
              selectedTablet.setFrecventaAntena(valoareFrecventaAntena);
              selectedTablet.setSisOpTab(valoareSisOpTel);
              selectedTablet.setTipIncarcare(valoareTipIncarcare);
              selectedTablet.setTipSim(valoareTipSim);
              selectedTablet.setRezCamere(valoareRezCamere);
              selectedTablet.setMemorieROM(valoareMemorieROM);
              selectedTablet.setRezEcran(valoareRezEcran);
              selectedTablet.setmemorieRAM(valoareMemorieRAM);
              selectedTablet.setNrCamere(valoareNrCamere);
              selectedTablet.setMarimeBat(valoareMarimeBat);
              selectedTablet.setDiagonalaEcran(Float.parseFloat(textFieldDiagonalaEcran.getText()));
              tablete[selectedIndex].setMarca(selectedTablet.getMarca());
              JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(saveButton);
              frame.dispose();
              updateTextAreaWithSelectedTablet(selectedTablet);
            }
        });
        panel.add(saveButton);
    }
        
        popup.add(panel);
        popup.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JDialog dialog = new JDialog(this, "Cautare", true);
        dialog.setLayout(new GridLayout(25, 0, 30, 5));
        jComboBox1.setSelectedIndex(0);

        JTextField textFieldMarca = new JTextField();
        JTextField textFieldModel = new JTextField();
        JTextField textFieldCantitate = new JTextField();
        JTextField textFieldAnAparitie = new JTextField();
        JTextField textFieldPret = new JTextField();
        JTextField textFieldProcesor = new JTextField();
        JTextField textFieldTipEcran = new JTextField();
        JTextField textFieldCuloare = new JTextField();
        JTextField textFieldFrecventaAntena = new JTextField();
        JTextField textFieldSisOpTab = new JTextField();
        JTextField textFieldTipIncarcare = new JTextField();
        JTextField textFieldTipSim = new JTextField();
        JTextField textFieldRezEcran = new JTextField();
        JTextField textFieldRezCamere = new JTextField();
        JTextField textFieldMemorieROM = new JTextField();
        JTextField textFieldMemorieRAM = new JTextField();
        JTextField textFieldNrCamere = new JTextField();
        JTextField textFieldMarimeBat = new JTextField();
        JTextField textFieldDiagonalaEcran = new JTextField();

        addLabelAndTextField(dialog, "Marca:", textFieldMarca);
        addLabelAndTextField(dialog, "Model:", textFieldModel);
        addLabelAndTextField(dialog, "Cantitate:", textFieldCantitate);
        addLabelAndTextField(dialog, "An aparitie:", textFieldAnAparitie);
        addLabelAndTextField(dialog, "Pret:", textFieldPret);
        addLabelAndTextField(dialog, "Procesor:", textFieldProcesor);
        addLabelAndTextField(dialog, "Tip ecran:", textFieldTipEcran);
        addLabelAndTextField(dialog, "Culoare:", textFieldCuloare);
        addLabelAndTextField(dialog, "Frecventa antena:", textFieldFrecventaAntena);
        addLabelAndTextField(dialog, "Sistem de operare:", textFieldSisOpTab);
        addLabelAndTextField(dialog, "Tip încărcare:", textFieldTipIncarcare);
        addLabelAndTextField(dialog, "Tip SIM:", textFieldTipSim);
        addLabelAndTextField(dialog, "Rezoluție ecran:", textFieldRezEcran);
        addLabelAndTextField(dialog, "Rezoluție camere:", textFieldRezCamere);
        addLabelAndTextField(dialog, "Memorie ROM:", textFieldMemorieROM);
        addLabelAndTextField(dialog, "Memorie RAM:", textFieldMemorieRAM);
        addLabelAndTextField(dialog, "Număr camere:", textFieldNrCamere);
        addLabelAndTextField(dialog, "Mărime baterie:", textFieldMarimeBat);
        addLabelAndTextField(dialog, "Diagonala ecran:", textFieldDiagonalaEcran);

        StringBuilder resultBuilder = new StringBuilder();

        JButton searchButton = new JButton("Cauta");
        searchButton.addActionListener(event -> {
            String marca = textFieldMarca.getText().trim();
            String model = textFieldModel.getText().trim();
            String cantitateText = textFieldCantitate.getText().trim();
            String anAparitieText = textFieldAnAparitie.getText().trim();
            String pretText = textFieldPret.getText().trim();
            String procesor = textFieldProcesor.getText().trim();
            String tipEcran = textFieldTipEcran.getText().trim();
            String culoare = textFieldCuloare.getText().trim();
            String frecventaAntena = textFieldFrecventaAntena.getText().trim();
            String sisOpTab = textFieldSisOpTab.getText().trim();
            String tipIncarcare = textFieldTipIncarcare.getText().trim();
            String tipSim = textFieldTipSim.getText().trim();
            String rezEcran = textFieldRezEcran.getText().trim();
            String rezCamere = textFieldRezCamere.getText().trim();
            String memorieROM = textFieldMemorieROM.getText().trim();
            String memorieRAM = textFieldMemorieRAM.getText().trim();
            String nrCamere = textFieldNrCamere.getText().trim();
            String marimeBat = textFieldMarimeBat.getText().trim();
            String diagonalaEcran = textFieldDiagonalaEcran.getText().trim();

            java.util.List<Tableta> foundDevices = new ArrayList<>();
            boolean emptyTextFields = false;

            if (marca.isEmpty() && model.isEmpty()
                    && cantitateText.isEmpty() && anAparitieText.isEmpty()
                    && pretText.isEmpty() && procesor.isEmpty()
                    && tipEcran.isEmpty() && culoare.isEmpty()
                    && frecventaAntena.isEmpty() && sisOpTab.isEmpty()
                    && tipIncarcare.isEmpty() && tipSim.isEmpty()
                    && memorieROM.isEmpty() && rezEcran.isEmpty()
                    && rezCamere.isEmpty() && memorieRAM.isEmpty()
                    && nrCamere.isEmpty() && marimeBat.isEmpty()
                    && diagonalaEcran.isEmpty()) {
                emptyTextFields = true;
            }

            if (emptyTextFields) {
                foundDevices.addAll(Arrays.asList(tablete));
            } else {
                for (Tableta instance : tablete) {
                    boolean match = true;

                    if (!marca.isEmpty() && !instance.getMarca().equals(marca)
                            || !model.isEmpty() && !instance.getModel().equals(model)
                            || !cantitateText.isEmpty() && instance.getCantitate() != Integer.parseInt(cantitateText)
                            || !anAparitieText.isEmpty() && instance.getAnAparitie() != Integer.parseInt(anAparitieText)
                            || !pretText.isEmpty() && instance.getPret() != Float.parseFloat(pretText)
                            || !procesor.isEmpty() && !instance.getProcesor().equals(procesor)
                            || !tipEcran.isEmpty() && !instance.getTipEcran().equals(tipEcran)
                            || !culoare.isEmpty() && !instance.getCuloare().equals(culoare)
                            || !frecventaAntena.isEmpty() && !instance.getFrecventaAntena().equals(frecventaAntena)
                            || !sisOpTab.isEmpty() && !instance.getSisOpTab().equals(sisOpTab)
                            || !tipIncarcare.isEmpty() && !instance.getTipIncarcare().equals(tipIncarcare)
                            || !tipSim.isEmpty() && !instance.getTipSim().equals(tipSim)
                            || !rezEcran.isEmpty() && !instance.getRezEcran().equals(rezEcran)
                            || !rezCamere.isEmpty() && instance.getRezCamere().equals(rezCamere)
                            || !memorieROM.isEmpty() && instance.getMemorieROM() != Integer.parseInt(memorieROM)
                            || !memorieRAM.isEmpty() && instance.getMemorieRAM() != Integer.parseInt(memorieRAM)
                            || !nrCamere.isEmpty() && instance.getNrCamere() != Integer.parseInt(nrCamere)
                            || !marimeBat.isEmpty() && instance.getMarimeBat() != Integer.parseInt(marimeBat)
                            || !diagonalaEcran.isEmpty() && instance.getDiagonalaEcran() != Float.parseFloat(diagonalaEcran)) {
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
                for (Tableta tableta : foundDevices) {
                    resultBuilder.append(tableta).append("\n\n");
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
    
    private void addLabelAndTextField(JDialog panel, String labelText, JTextField textField) {
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
        String[] numeLap = new String[tablete.length + 1];
        numeLap[0] = "Alege Tableta";
        
        for(int i = 0; i < tablete.length; i++) {
            String marca = tablete[i].getMarca();
            String model = tablete[i].getModel();
            numeLap[i + 1] = marca + " " + model;
        }

        jComboBox1.setModel(new DefaultComboBoxModel<>(numeLap));
    }
    
    private void adaugaActionListenerComboBox() {
        jComboBox1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = jComboBox1.getSelectedIndex();
                
                if(selectedIndex >= 1 && selectedIndex - 1 < tablete.length) {
                    Object obiectSelectat = tablete[selectedIndex - 1];
                    String textAfisat = obiectSelectat.toString();
                    jTextArea1.setText(textAfisat);
                    jButton1.setVisible(true);
                }  else {
                    jTextArea1.setText("");
                    jButton1.setVisible(false);
                }
            }
        });
    }
    
    private void updateTextAreaWithSelectedTablet(Tableta selectedTablet) {
        jTextArea1.setText(selectedTablet.toString());
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
            java.util.logging.Logger.getLogger(tabletaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabletaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabletaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabletaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabletaint().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu menu;
    private javax.swing.JLabel titlu;
    // End of variables declaration//GEN-END:variables
}
