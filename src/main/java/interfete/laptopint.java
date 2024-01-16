package interfete;

import javax.swing.*;
import java.awt.event.*;
import com.mycompany.magazinelectronice.*;
import fileactions.LaptopFileActions;
import java.awt.*;
import java.util.*;
import java.util.List;
import newpackage.*;

public class laptopint extends javax.swing.JFrame {
    Instances inst = new Instances();
    LaptopFileActions laptopFileActions = new LaptopFileActions();
    
    Device[] lapt = inst.getInstancesArray("laptopuri");
    Laptop[] laptopuri = (Laptop[]) lapt;

    public laptopint() {
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
        titlu.setText("Laptopuri");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apasati pentru a vedea laptopuri" }));

        jButton1.setText("Editare detalii Laptop");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(titlu, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 323, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titlu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
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

        JFrame popup = new JFrame("Detalii Laptop");
        popup.setSize(1000, 900);
        popup.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2));
        Laptop selectedLaptop = laptopuri[selectedIndex];
    
    if (selectedIndex >= 0 && selectedIndex < laptopuri.length) {
        JTextField textFieldMarca = new JTextField(selectedLaptop.getMarca());
        JTextField textFieldModel = new JTextField(selectedLaptop.getModel());
        JTextField textFieldCantitate = new JTextField(String.valueOf(selectedLaptop.getCantitate()));
        JTextField textFieldAnAparitie = new JTextField(String.valueOf(selectedLaptop.getAnAparitie()));
        JTextField textFieldPret = new JTextField(String.valueOf(selectedLaptop.getPret()));
        JTextField textFieldRezEcran = new JTextField(selectedLaptop.getRezEcran());
        JTextField textFieldProcesor = new JTextField(selectedLaptop.getProcesor());
        JTextField textFieldTipEcran = new JTextField(selectedLaptop.getTipEcran());
        JTextField textFieldCuloare = new JTextField(selectedLaptop.getCuloare());
        JTextField textFieldFrecventaRam = new JTextField(selectedLaptop.getFrecventaRam());
        JTextField textFieldSistemDeOperare = new JTextField(selectedLaptop.getSistemDeOperare());
        JTextField textFieldTipPlacaVideo = new JTextField(selectedLaptop.getTipPlacaVideo());
        JTextField textFieldModelPlacaVideo = new JTextField(selectedLaptop.getModelPlacaVideo());
        JTextField textFieldTipPorturi = new JTextField(selectedLaptop.getTipPorturi());
        JTextField textFieldAutonomieBat = new JTextField(String.valueOf(selectedLaptop.getAutonomieBat()));
        JTextField textFieldRezCamere = new JTextField(String.valueOf(selectedLaptop.getRezCamere()));
        JTextField textFieldNrPorturi = new JTextField(String.valueOf(selectedLaptop.getNrPorturi()));
        JTextField textFieldMemorieRam = new JTextField(String.valueOf(selectedLaptop.getMemorieRam()));
        JTextField textFieldNrCamere = new JTextField(String.valueOf(selectedLaptop.getNrCamere()));
        JTextField textFieldMarimeBat = new JTextField(String.valueOf(selectedLaptop.getMarimeBat()));
        JTextField textFieldDiagonalaEcran = new JTextField(String.valueOf(selectedLaptop.getDiagonalaEcran()));
        JTextField textFieldGreutate = new JTextField(String.valueOf(selectedLaptop.getGreutate()));
    
        addLabelAndTextField(panel, "Marca:", textFieldMarca);
        addLabelAndTextField(panel, "Model:", textFieldModel);
        addLabelAndTextField(panel, "Cantitate:", textFieldCantitate);
        addLabelAndTextField(panel, "An aparitie:", textFieldAnAparitie);
        addLabelAndTextField(panel, "Pret:", textFieldPret);
        addLabelAndTextField(panel, "Procesor:", textFieldProcesor);
        addLabelAndTextField(panel, "Tip ecran:", textFieldTipEcran);
        addLabelAndTextField(panel, "Culoare:", textFieldCuloare);
        
        addLabelAndTextField(panel, "Frecventa ram:", textFieldFrecventaRam);
        addLabelAndTextField(panel, "Sistem de operare:", textFieldSistemDeOperare);
        addLabelAndTextField(panel, "Tip placa video:", textFieldTipPlacaVideo);
        addLabelAndTextField(panel, "Model placa video:", textFieldModelPlacaVideo);
        addLabelAndTextField(panel, "Tip porturi:", textFieldTipPorturi);
        addLabelAndTextField(panel, "Autonomie baterie:", textFieldAutonomieBat);
        addLabelAndTextField(panel, "Rezoluție ecran:", textFieldRezEcran);
        addLabelAndTextField(panel, "Rezoluție camere:", textFieldRezCamere);
        addLabelAndTextField(panel, "Nr porturi:", textFieldNrPorturi);
        addLabelAndTextField(panel, "Memorie RAM:", textFieldMemorieRam);
        addLabelAndTextField(panel, "Număr camere:", textFieldNrCamere);
        addLabelAndTextField(panel, "Mărime baterie:", textFieldMarimeBat);
        addLabelAndTextField(panel, "Diagonala ecran:", textFieldDiagonalaEcran);    
        addLabelAndTextField(panel, "Diagonala ecran:", textFieldGreutate);    

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
              
              String valoareFrecventaRam = textFieldFrecventaRam.getText();
              String valoareSistemDeOperare = textFieldSistemDeOperare.getText();
              String valoareTipPlacaVideo = textFieldTipPlacaVideo.getText();
              String valoareModelPlacaVideo = textFieldModelPlacaVideo.getText();
              String valoareTipPorturi = textFieldTipPorturi.getText();
              String valoareAutonomieBat = textFieldAutonomieBat.getText();
              
              String valoareRezEcran = textFieldRezEcran.getText();
              int valoareRezCamere = Integer.parseInt(textFieldRezCamere.getText());
              int valoareNrPorturi = Integer.parseInt(textFieldNrPorturi.getText());
              int valoareMemorieRAM = Integer.parseInt(textFieldMemorieRam.getText());
              int valoareNrCamere = Integer.parseInt(textFieldNrCamere.getText());
              int valoareMarimeBat = Integer.parseInt(textFieldMarimeBat.getText());
              float valoareDiagonalaEcran = Float.parseFloat(textFieldDiagonalaEcran.getText());
              float greutate = Float.parseFloat(textFieldGreutate.getText());
              
              selectedLaptop.setMarca(valoareMarca);
              selectedLaptop.setModel(valoareModel);
              selectedLaptop.setCantitate(valoareCantitate);
              selectedLaptop.setAnAparitie(valoareAnAparitie);
              selectedLaptop.setPret(valoarePret);              
              selectedLaptop.setProcesor(valoareProcesor);
              selectedLaptop.setTipEcran(valoareTipEcran);
              selectedLaptop.setCuloare(valoareCuloare);
              selectedLaptop.setFrecventaRam(valoareFrecventaRam);
              selectedLaptop.setSistemDeOperare(valoareSistemDeOperare);
              selectedLaptop.setTipPlacaVideo(valoareTipPlacaVideo);
              selectedLaptop.setModelPlacaVideo(valoareModelPlacaVideo);
              selectedLaptop.setTipPorturi(valoareTipPorturi);
              selectedLaptop.setAutonomieBat(valoareAutonomieBat);
              selectedLaptop.setRezCamere(valoareRezCamere);
              selectedLaptop.setNrPorturi(valoareNrPorturi);
              selectedLaptop.setRezEcran(valoareRezEcran);
              selectedLaptop.setMemorieRam(valoareMemorieRAM);
              selectedLaptop.setNrCamere(valoareNrCamere);
              selectedLaptop.setMarimeBat(valoareMarimeBat);
              selectedLaptop.setDiagonalaEcran(valoareDiagonalaEcran);
              selectedLaptop.setGreutate(greutate);
              laptopuri[selectedIndex].setMarca(selectedLaptop.getMarca());
              JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(saveButton);
              frame.dispose();
              updateTextAreaWithSelectedLaptop(selectedLaptop);
            }
        });
        panel.add(saveButton);
    }
        
        popup.add(panel);
        popup.setVisible(true);  
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
        JTextField textFieldRezEcran = new JTextField();
        JTextField textFieldProcesor = new JTextField();
        JTextField textFieldTipEcran = new JTextField();
        JTextField textFieldCuloare = new JTextField();
        JTextField textFieldFrecventaRam = new JTextField();
        JTextField textFieldSistemDeOperare = new JTextField();
        JTextField textFieldTipPlacaVideo = new JTextField();
        JTextField textFieldModelPlacaVideo = new JTextField();
        JTextField textFieldTipPorturi = new JTextField();
        JTextField textFieldAutonomieBat = new JTextField();
        JTextField textFieldRezCamere = new JTextField();
        JTextField textFieldNrPorturi = new JTextField();
        JTextField textFieldMemorieRam = new JTextField();
        JTextField textFieldNrCamere = new JTextField();
        JTextField textFieldMarimeBat = new JTextField();
        JTextField textFieldDiagonalaEcran = new JTextField();
        JTextField textFieldGreutate = new JTextField();
    
        addLabelAndTextField(dialog, "Marca:", textFieldMarca);
        addLabelAndTextField(dialog, "Model:", textFieldModel);
        addLabelAndTextField(dialog, "Cantitate:", textFieldCantitate);
        addLabelAndTextField(dialog, "An aparitie:", textFieldAnAparitie);
        addLabelAndTextField(dialog, "Pret:", textFieldPret);
        addLabelAndTextField(dialog, "Procesor:", textFieldProcesor);
        addLabelAndTextField(dialog, "Tip ecran:", textFieldTipEcran);
        addLabelAndTextField(dialog, "Culoare:", textFieldCuloare);
        
        addLabelAndTextField(dialog, "Frecventa ram:", textFieldFrecventaRam);
        addLabelAndTextField(dialog, "Sistem de operare:", textFieldSistemDeOperare);
        addLabelAndTextField(dialog, "Tip placa video:", textFieldTipPlacaVideo);
        addLabelAndTextField(dialog, "Model placa video:", textFieldModelPlacaVideo);
        addLabelAndTextField(dialog, "Tip porturi:", textFieldTipPorturi);
        addLabelAndTextField(dialog, "Autonomie baterie:", textFieldAutonomieBat);
        addLabelAndTextField(dialog, "Rezoluție ecran:", textFieldRezEcran);
        addLabelAndTextField(dialog, "Rezoluție camere:", textFieldRezCamere);
        addLabelAndTextField(dialog, "Nr porturi:", textFieldNrPorturi);
        addLabelAndTextField(dialog, "Memorie RAM:", textFieldMemorieRam);
        addLabelAndTextField(dialog, "Număr camere:", textFieldNrCamere);
        addLabelAndTextField(dialog, "Mărime baterie:", textFieldMarimeBat);
        addLabelAndTextField(dialog, "Diagonala ecran:", textFieldDiagonalaEcran);    
        addLabelAndTextField(dialog, "Diagonala ecran:", textFieldGreutate);

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
            String frecventaRam = textFieldFrecventaRam.getText().trim();
            String sistemDeOperare = textFieldSistemDeOperare.getText().trim();
            String tipPlacaVideo = textFieldTipPlacaVideo.getText().trim();
            String modelPlacaVideo = textFieldModelPlacaVideo.getText().trim();
            String tipPorturi = textFieldTipPorturi.getText().trim();
            String autonomieBat = textFieldAutonomieBat.getText().trim();
            String rezEcran = textFieldRezEcran.getText().trim();
            String rezCamere = textFieldRezCamere.getText().trim();
            String nrPorturi = textFieldNrPorturi.getText().trim();
            String memorieRAM = textFieldMemorieRam.getText().trim();
            String nrCamere = textFieldNrCamere.getText().trim();
            String marimeBat = textFieldMarimeBat.getText().trim();
            String diagonalaEcran = textFieldDiagonalaEcran.getText().trim();
            String greutate = textFieldGreutate.getText().trim();

            List<Laptop> foundDevices = new ArrayList<>();
            boolean emptyTextFields = false;
            
            if (marca.isEmpty() && model.isEmpty() 
                && cantitateText.isEmpty() && anAparitieText.isEmpty() 
                && pretText.isEmpty() && procesor.isEmpty()
                && tipEcran.isEmpty() && culoare.isEmpty()
                && frecventaRam.isEmpty() && sistemDeOperare.isEmpty()
                && tipPlacaVideo.isEmpty() && modelPlacaVideo.isEmpty()
                && tipPorturi.isEmpty() && autonomieBat.isEmpty()
                && rezEcran.isEmpty() && rezCamere.isEmpty()
                && nrPorturi.isEmpty() && memorieRAM.isEmpty()
                && nrCamere.isEmpty() && marimeBat.isEmpty()
                && diagonalaEcran.isEmpty() && greutate.isEmpty()) {
                    emptyTextFields = true;
            }
            
            if(emptyTextFields) {
                foundDevices.addAll(Arrays.asList(laptopuri));
            } else {
                for (Laptop instance : laptopuri) {
                    boolean match = true;
                    
                    if (!marca.isEmpty() && !instance.getMarca().equals(marca)
                        || !model.isEmpty() && !instance.getModel().equals(model)
                        || !cantitateText.isEmpty() && instance.getCantitate() != Integer.parseInt(cantitateText)
                        || !anAparitieText.isEmpty() && instance.getAnAparitie() != Integer.parseInt(anAparitieText)
                        || !pretText.isEmpty() && instance.getPret() != Float.parseFloat(pretText)
                        || !procesor.isEmpty() && !instance.getProcesor().equals(procesor)
                        || !tipEcran.isEmpty() && !instance.getTipEcran().equals(tipEcran)
                        || !culoare.isEmpty() && !instance.getCuloare().equals(culoare)
                        || !frecventaRam.isEmpty() && !instance.getFrecventaRam().equals(frecventaRam)
                        || !sistemDeOperare.isEmpty() && !instance.getSistemDeOperare().equals(sistemDeOperare)
                        || !tipPlacaVideo.isEmpty() && !instance.getTipPlacaVideo().equals(tipPlacaVideo)
                        || !modelPlacaVideo.isEmpty() && !instance.getModelPlacaVideo().equals(modelPlacaVideo)
                        || !tipPorturi.isEmpty() && !instance.getTipPorturi().equals(tipPorturi)
                        || !autonomieBat.isEmpty() && !instance.getAutonomieBat().equals(autonomieBat)
                        || !rezEcran.isEmpty() && !instance.getRezEcran().equals(rezEcran)
                        || !rezCamere.isEmpty() && instance.getRezCamere() != Integer.parseInt(rezCamere)
                        || !nrPorturi.isEmpty() && instance.getNrPorturi() != Integer.parseInt(nrPorturi)
                        || !memorieRAM.isEmpty() && instance.getMemorieRam() != Integer.parseInt(memorieRAM)
                        || !nrCamere.isEmpty() && instance.getNrCamere() != Integer.parseInt(nrCamere)
                        || !marimeBat.isEmpty() && instance.getMarimeBat() != Integer.parseInt(marimeBat)
                        || !diagonalaEcran.isEmpty() && instance.getDiagonalaEcran() != Float.parseFloat(diagonalaEcran)
                        || !greutate.isEmpty() && instance.getGreutate() != Float.parseFloat(greutate)) {
                        match = false;
                    }
                    
                    if (match) foundDevices.add(instance);
                }
            }

            if (foundDevices.isEmpty()) {
                if(!emptyTextFields) {
                    jTextArea1.setText("NU S-A GASIT NICIUN PRODUS");
                    dialog.dispose();
                }
            } else {
                for (Laptop laptop : foundDevices) {
                    resultBuilder.append(laptop).append("\n\n");
                }
                
                laptopFileActions.writeToFile("Assets/WriteLaptops", foundDevices);
                jTextArea1.setText(resultBuilder.toString());
                dialog.dispose();
            }
        });

        dialog.add(searchButton);
        dialog.setSize(600, 800);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
        String[] numeLap = new String[laptopuri.length + 1];
        numeLap[0] = "Alege Laptop";
        
        for(int i = 0; i < laptopuri.length; i++) {
            String marca = laptopuri[i].getMarca();
            String model = laptopuri[i].getModel();
            numeLap[i + 1] = marca + " " + model;
        }

        jComboBox1.setModel(new DefaultComboBoxModel<>(numeLap));
    }
    
    private void adaugaActionListenerComboBox() {
        jComboBox1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = jComboBox1.getSelectedIndex();
                
                if(selectedIndex >= 1 && selectedIndex - 1 < laptopuri.length) {
                    Object obiectSelectat = laptopuri[selectedIndex - 1];
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
    
    private void updateTextAreaWithSelectedLaptop(Laptop selectedLaptop) {
        jTextArea1.setText(selectedLaptop.toString());
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new laptopint().setVisible(true);
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
