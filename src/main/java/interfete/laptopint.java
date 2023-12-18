package interfete;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mycompany.magazinelectronice.*;
import java.awt.*;
import newpackage.*;

public class laptopint extends javax.swing.JFrame {
    Instances inst = new Instances();
    
    Device[] lapt = inst.getInstancesArray("laptopuri");
    Laptop[] laptopuri = (Laptop[]) lapt;

    public laptopint() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        initializareComboBox();
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
                .addGap(137, 137, 137)
                .addComponent(titlu, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titlu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(102, Short.MAX_VALUE))
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

        JFrame popup = new JFrame("Detalii Telefon");
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

    private void addLabelAndTextField(JPanel panel, String labelText, JTextField textField) {
        JLabel label = new JLabel(labelText);
        panel.add(label);
        panel.add(textField);
}
    
    private void initializareComboBox() {
        String[] numeLap = new String[laptopuri.length];
        
        for(int i = 0; i < laptopuri.length; i++) {
            String marca = laptopuri[i].getMarca();
            String model = laptopuri[i].getModel();
            numeLap[i] = marca + " " + model;
        }

        jComboBox1.setModel(new DefaultComboBoxModel<>(numeLap));
        jTextArea1.setText(laptopuri[0].toString());
    }
    
    private void adaugaActionListenerComboBox() {
        jComboBox1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = jComboBox1.getSelectedIndex();
                
                if(selectedIndex >= 0) {
                    Object obiectSelectat = laptopuri[selectedIndex];
                    String textAfisat = obiectSelectat.toString();
                    jTextArea1.setText(textAfisat);
                    jButton1.setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu menu;
    private javax.swing.JLabel titlu;
    // End of variables declaration//GEN-END:variables
}
