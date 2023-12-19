package interfete;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mycompany.magazinelectronice.*;
import java.awt.GridLayout;
import newpackage.*;

public class desktopint extends javax.swing.JFrame {
    Instances inst = new Instances();
    
    Device[] desk = inst.getInstancesArray("desktopuri");
    Desktopuri[] desktopuri = (Desktopuri[]) desk;

    public desktopint() {
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        home = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back.setBackground(new java.awt.Color(255, 51, 102));
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        back.setLabel("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        titlu.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        titlu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlu.setText("Desktop");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apasati pentru a vedea desktopuri" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Editare detalii Desktop");
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
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(titlu, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 300, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
                .addGap(74, 74, 74))
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
        Desktopuri selectedDesktop = desktopuri[selectedIndex];
    
    if (selectedIndex >= 0 && selectedIndex < desktopuri.length) {
        JTextField textFieldMarca = new JTextField(selectedDesktop.getMarca());
        JTextField textFieldModel = new JTextField(selectedDesktop.getModel());
        JTextField textFieldCantitate = new JTextField(String.valueOf(selectedDesktop.getCantitate()));
        JTextField textFieldAnAparitie = new JTextField(String.valueOf(selectedDesktop.getAnAparitie()));
        JTextField textFieldPret = new JTextField(String.valueOf(selectedDesktop.getPret()));
        JTextField textFieldProcesor = new JTextField(selectedDesktop.getProcesor());
        JTextField textFieldCuloare = new JTextField(selectedDesktop.getCuloare());
        JTextField textFieldFrecventaRam = new JTextField(selectedDesktop.getFrecventaRam());
        JTextField textFieldSistemDeOperare = new JTextField(selectedDesktop.getSistemDeOperare());
        JTextField textFieldTipPlacaVideo = new JTextField(selectedDesktop.getTipPlacaVideo());
        JTextField textFieldModelPlacaVideo = new JTextField(selectedDesktop.getModelPlacaVideo());
        JTextField textFieldTipPorturi = new JTextField(selectedDesktop.getTipPorturi());
        JTextField textFieldNrPorturi = new JTextField(String.valueOf(selectedDesktop.getNrPorturi()));
        JTextField textFieldMemorieRam = new JTextField(String.valueOf(selectedDesktop.getMemorieRam()));
        JTextField textFieldGreutate = new JTextField(String.valueOf(selectedDesktop.getGreutate()));
    
        addLabelAndTextField(panel, "Marca:", textFieldMarca);
        addLabelAndTextField(panel, "Model:", textFieldModel);
        addLabelAndTextField(panel, "Cantitate:", textFieldCantitate);
        addLabelAndTextField(panel, "An aparitie:", textFieldAnAparitie);
        addLabelAndTextField(panel, "Pret:", textFieldPret);
        addLabelAndTextField(panel, "Procesor:", textFieldProcesor);
        addLabelAndTextField(panel, "Culoare:", textFieldCuloare);
        addLabelAndTextField(panel, "Frecventa ram:", textFieldFrecventaRam);
        addLabelAndTextField(panel, "Sistem de operare:", textFieldSistemDeOperare);
        addLabelAndTextField(panel, "Tip placa video:", textFieldTipPlacaVideo);
        addLabelAndTextField(panel, "Model placa video:", textFieldModelPlacaVideo);
        addLabelAndTextField(panel, "Tip porturi:", textFieldTipPorturi);
        addLabelAndTextField(panel, "Nr porturi:", textFieldNrPorturi);
        addLabelAndTextField(panel, "Memorie RAM:", textFieldMemorieRam); 
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
              String valoareCuloare = textFieldCuloare.getText();
              String valoareFrecventaRam = textFieldFrecventaRam.getText();
              String valoareSistemDeOperare = textFieldSistemDeOperare.getText();
              String valoareTipPlacaVideo = textFieldTipPlacaVideo.getText();
              String valoareModelPlacaVideo = textFieldModelPlacaVideo.getText();
              String valoareTipPorturi = textFieldTipPorturi.getText();
              int valoareNrPorturi = Integer.parseInt(textFieldNrPorturi.getText());
              int valoareMemorieRAM = Integer.parseInt(textFieldMemorieRam.getText());
              float greutate = Float.parseFloat(textFieldGreutate.getText());
              
              selectedDesktop.setMarca(valoareMarca);
              selectedDesktop.setModel(valoareModel);
              selectedDesktop.setCantitate(valoareCantitate);
              selectedDesktop.setAnAparitie(valoareAnAparitie);
              selectedDesktop.setPret(valoarePret);              
              selectedDesktop.setProcesor(valoareProcesor);
              selectedDesktop.setCuloare(valoareCuloare);
              selectedDesktop.setFrecventaRam(valoareFrecventaRam);
              selectedDesktop.setSistemDeOperare(valoareSistemDeOperare);
              selectedDesktop.setTipPlacaVideo(valoareTipPlacaVideo);
              selectedDesktop.setModelPlacaVideo(valoareModelPlacaVideo);
              selectedDesktop.setTipPorturi(valoareTipPorturi);
              selectedDesktop.setNrPorturi(valoareNrPorturi);
              selectedDesktop.setMemorieRam(valoareMemorieRAM);
              selectedDesktop.setGreutate(greutate);
              desktopuri[selectedIndex].setMarca(selectedDesktop.getMarca());
              JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(saveButton);
              frame.dispose();
              updateTextAreaWithSelectedLaptop(selectedDesktop);
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
        String[] numeDesk = new String[desktopuri.length];
        
        for(int i = 0; i < desktopuri.length; i++) {
            String marca = desktopuri[i].getMarca();
            String model = desktopuri[i].getModel();
            
            numeDesk[i] = marca + " " + model;
        }
        
        jComboBox1.setModel(new DefaultComboBoxModel<>(numeDesk));
        jTextArea1.setText(desktopuri[0].toString());
    }
    
    private void adaugaActionListenerComboBox() {
        jComboBox1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = jComboBox1.getSelectedIndex();
                
                if(selectedIndex >= 0) {
                    Object obiectSelectat = desktopuri[selectedIndex];
                    String textAfisat = obiectSelectat.toString();
                    jTextArea1.setText(textAfisat);
                    jButton1.setVisible(true);
                }
            }
        });
    }
    
    private void updateTextAreaWithSelectedLaptop(Desktopuri selectedDesktop) {
        jTextArea1.setText(selectedDesktop.toString());
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new desktopint().setVisible(true);
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
