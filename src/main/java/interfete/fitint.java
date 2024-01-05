package interfete;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mycompany.magazinelectronice.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import newpackage.*;

public class fitint extends javax.swing.JFrame {
    Instances inst = new Instances();

    Device[] fitBand = inst.getInstancesArray("fitnessBands");
    FitnessBand[] fitBand1 = (FitnessBand[]) fitBand;
    /**
     * Creates new form fitint
     */
    public fitint() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        initializareComboBox();
        adaugaActionListenerComboBox();
        editButton.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        editButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
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

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bratari Fitness");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apasati aici pentru a vedea Bratarile Fitness" }));

        editButton.setText("Editare date Bratari Fitness");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Cautare");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 300, Short.MAX_VALUE)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
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

    private void updateTextAreaWithSelectedBand(FitnessBand selectedBand) {
        jTextArea1.setText(selectedBand.toString());
    }
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
    int selectedIndex = jComboBox1.getSelectedIndex();
    
    if (selectedIndex >= 0) {
        FitnessBand selectedBand = fitBand1[selectedIndex];
        JFrame popup = new JFrame("Detalii FitnessBand");
        popup.setSize(1000, 900);
        popup.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2)); // Layout pentru a afișa perechi etichetă-câmp text
       
    if (selectedIndex >= 0 && selectedIndex < fitBand1.length) {
        JTextField textFieldMarca = new JTextField(selectedBand.getMarca());
        JTextField textFieldModel = new JTextField(selectedBand.getModel());
        JTextField textFieldCantitate = new JTextField(String.valueOf(selectedBand.getCantitate()));
        JTextField textFieldAnAparitie = new JTextField(String.valueOf(selectedBand.getAnAparitie()));
        JTextField textFieldPret = new JTextField(String.valueOf(selectedBand.getPret()));
        JTextField textFieldProcesor = new JTextField(selectedBand.getProcesor());
        JTextField textFieldTipEcran = new JTextField(selectedBand.getTipEcran());
        JTextField textFieldCuloare = new JTextField(selectedBand.getCuloare());
        JTextField textFieldSisOpTel = new JTextField(selectedBand.getSistemDeOperareFB());
        JTextField textFieldCapabilities = new JTextField(selectedBand.getCapabilities());
        JTextField textFieldTipIncarcare = new JTextField(selectedBand.getTipIncarcare());
        JTextField textFieldTipSim = new JTextField(selectedBand.getTipSim());
        JTextField textFieldRezEcran = new JTextField(String.valueOf(selectedBand.getRezEcran()));
        JTextField textFieldMemorieROM = new JTextField(String.valueOf(selectedBand.getMemorieROM()));
        JTextField textFieldMemorieRAM = new JTextField(String.valueOf(selectedBand.getMemorieRAM()));
        JTextField textFieldMarimeBat = new JTextField(String.valueOf(selectedBand.getMarimeBat()));
        JTextField textFieldDiagonalaEcran = new JTextField(String.valueOf(selectedBand.getDiagonalaEcran()));
    
        addLabelAndTextField(panel, "Marca:", textFieldMarca);
        addLabelAndTextField(panel, "Model:", textFieldModel);
        addLabelAndTextField(panel, "Cantitate:", textFieldCantitate);
        addLabelAndTextField(panel, "An aparitie:", textFieldAnAparitie);
        addLabelAndTextField(panel, "Pret:", textFieldPret);
        addLabelAndTextField(panel, "Procesor:", textFieldProcesor);
        addLabelAndTextField(panel, "Tip ecran:", textFieldTipEcran);
        addLabelAndTextField(panel, "Culoare:", textFieldCuloare);
        addLabelAndTextField(panel, "Sistem de operare:", textFieldSisOpTel);
        addLabelAndTextField(panel, "Caapabilitati:", textFieldCapabilities);
        addLabelAndTextField(panel, "Tip încărcare:", textFieldTipIncarcare);
        addLabelAndTextField(panel, "Tip SIM:", textFieldTipSim);
        addLabelAndTextField(panel, "Rezoluție ecran:", textFieldRezEcran);
        addLabelAndTextField(panel, "Memorie ROM:", textFieldMemorieROM);
        addLabelAndTextField(panel, "Memorie RAM:", textFieldMemorieRAM);
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
              String valoareSisOpTel = textFieldSisOpTel.getText();
              String valoareCapabilities = textFieldCapabilities.getText();
              String valoareTipIncarcare = textFieldTipIncarcare.getText();
              String valoareTipSim = textFieldTipSim.getText();
              int valoareRezEcran = Integer.parseInt(textFieldRezEcran.getText());
              int valoareMemorieROM = Integer.parseInt(textFieldMemorieROM.getText());
              int valoareMemorieRAM = Integer.parseInt(textFieldMemorieRAM.getText());
              int valoareMarimeBat = Integer.parseInt(textFieldMarimeBat.getText());
              float valoareDiagonalaEcran = Float.parseFloat(textFieldDiagonalaEcran.getText());
              
              selectedBand.setMarca(valoareMarca);
              selectedBand.setModel(valoareModel);
              selectedBand.setCantitate(valoareCantitate);
              selectedBand.setAnAparitie(valoareAnAparitie);
              selectedBand.setPret(valoarePret);              
              selectedBand.setProcesor(valoareProcesor);
              selectedBand.setTipEcran(valoareTipEcran);
              selectedBand.setCuloare(valoareCuloare);
              selectedBand.setSistemDeOperareFB(valoareSisOpTel);
              selectedBand.setCapabilities(valoareCapabilities);
              selectedBand.setTipIncarcare(valoareTipIncarcare);
              selectedBand.setTipSim(valoareTipSim);
              selectedBand.setMemorieROM(valoareMemorieROM);
              selectedBand.setRezEcran(valoareRezEcran);
              selectedBand.setMemorieRAM(valoareMemorieRAM);
              selectedBand.setMarimeBat(valoareMarimeBat);
              selectedBand.setDiagonalaEcran(Float.parseFloat(textFieldDiagonalaEcran.getText()));
              fitBand1[selectedIndex].setMarca(selectedBand.getMarca());
              JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(saveButton);
              frame.dispose();
              updateTextAreaWithSelectedBand(selectedBand);
            }
        });
        panel.add(saveButton);
    }
        
        popup.add(panel);
        popup.setVisible(true);
    }
    }//GEN-LAST:event_editButtonActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
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
        JTextField textFieldSisOpTel = new JTextField();
        JTextField textFieldCapabilities = new JTextField();
        JTextField textFieldTipIncarcare = new JTextField();
        JTextField textFieldTipSim = new JTextField();
        JTextField textFieldRezEcran = new JTextField();
        JTextField textFieldMemorieROM = new JTextField();
        JTextField textFieldMemorieRAM = new JTextField();
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
        addLabelAndTextField(dialog, "Sistem de operare:", textFieldSisOpTel);
        addLabelAndTextField(dialog, "Capabilitati:", textFieldCapabilities);
        addLabelAndTextField(dialog, "Tip încărcare:", textFieldTipIncarcare);
        addLabelAndTextField(dialog, "Tip SIM:", textFieldTipSim);
        addLabelAndTextField(dialog, "Memorie ROM:", textFieldMemorieROM);
        addLabelAndTextField(dialog, "Memorie RAM:", textFieldMemorieRAM);
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
            String sisOpTel = textFieldSisOpTel.getText().trim();
            String capab = textFieldCapabilities.getText().trim();
            String tipIncarcare = textFieldTipIncarcare.getText().trim();
            String tipSim = textFieldTipSim.getText().trim();
            String rezEcran = textFieldRezEcran.getText().trim();
            String memorieROM = textFieldMemorieROM.getText().trim();
            String memorieRAM = textFieldMemorieRAM.getText().trim();
            String marimeBat = textFieldMarimeBat.getText().trim();
            String diagonalaEcran = textFieldDiagonalaEcran.getText().trim();

            java.util.List<FitnessBand> foundDevices = new ArrayList<>();
            boolean emptyTextFields = false;

            if (marca.isEmpty() && model.isEmpty()
                    && cantitateText.isEmpty() && anAparitieText.isEmpty()
                    && pretText.isEmpty() && procesor.isEmpty()
                    && tipEcran.isEmpty() && culoare.isEmpty()
                    && tipIncarcare.isEmpty() && tipSim.isEmpty()
                    && memorieROM.isEmpty() && rezEcran.isEmpty()&& marimeBat.isEmpty()
                    && diagonalaEcran.isEmpty()) {
                emptyTextFields = true;
            }

            if (emptyTextFields) {
                foundDevices.addAll(Arrays.asList(fitBand1));
            } else {
                for (FitnessBand instance : fitBand1) {
                    boolean match = true;

                    if (!marca.isEmpty() && !instance.getMarca().equals(marca)
                            || !model.isEmpty() && !instance.getModel().equals(model)
                            || !cantitateText.isEmpty() && instance.getCantitate() != Integer.parseInt(cantitateText)
                            || !anAparitieText.isEmpty() && instance.getAnAparitie() != Integer.parseInt(anAparitieText)
                            || !pretText.isEmpty() && instance.getPret() != Float.parseFloat(pretText)
                            || !procesor.isEmpty() && !instance.getProcesor().equals(procesor)
                            || !tipEcran.isEmpty() && !instance.getTipEcran().equals(tipEcran)
                            || !culoare.isEmpty() && !instance.getCuloare().equals(culoare)
                            || !sisOpTel.isEmpty() && !instance.getSistemDeOperareFB().equals(sisOpTel)
                            || !capab.isEmpty() && !instance.getCapabilities().equals(capab)
                            || !tipIncarcare.isEmpty() && !instance.getTipIncarcare().equals(tipIncarcare)
                            || !tipSim.isEmpty() && !instance.getTipSim().equals(tipSim)
                            || !rezEcran.isEmpty() && instance.getRezEcran() != Integer.parseInt(rezEcran)
                            || !memorieROM.isEmpty() && instance.getMemorieROM() != Integer.parseInt(memorieROM)
                            || !memorieRAM.isEmpty() && instance.getMemorieRAM() != Integer.parseInt(memorieRAM)
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
                for (FitnessBand fitBand2 : foundDevices) {
                    resultBuilder.append(fitBand2).append("\n\n");
                }

                jTextArea1.setText(resultBuilder.toString());
                dialog.dispose();
            }
        });

        dialog.add(searchButton);
        dialog.setSize(600, 800);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }
                                         
    private void addLabelAndTextField(JPanel panel, String labelText, JTextField textField) {
        JLabel label = new JLabel(labelText);
        panel.add(label);
        panel.add(textField);
    }
    private void addLabelAndTextField(JDialog panel, String labelText, JTextField textField) {
        JLabel label = new JLabel(labelText);
        panel.add(label);
        panel.add(textField);
    }
    
    private void initializareComboBox() {
        String[] numeWatch = new String[fitBand1.length + 1];
        numeWatch[0] = "Alege FitBand";
        
        for(int i = 0; i < fitBand1.length; i++) {
            String marca = fitBand1[i].getMarca();
            String model = fitBand1[i].getModel();
            numeWatch[i + 1] = marca + " " + model;
        }
        jComboBox1.setModel(new DefaultComboBoxModel<>(numeWatch));
    }
    
    private void adaugaActionListenerComboBox() {
        jComboBox1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = jComboBox1.getSelectedIndex();
           
            if (selectedIndex >= 1 && selectedIndex - 1 < fitBand1.length) {
                Object obiectSelectat = fitBand1[selectedIndex - 1];
                String textAfisat = obiectSelectat.toString();
                jTextArea1.setText(textAfisat);
                editButton.setVisible(true); 
            } else {
                    jTextArea1.setText("");
                    editButton.setVisible(false);
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
            java.util.logging.Logger.getLogger(fitint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fitint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fitint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fitint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fitint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button back;
    private javax.swing.JButton editButton;
    private javax.swing.JMenuItem home;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu menu;
    // End of variables declaration//GEN-END:variables
}
