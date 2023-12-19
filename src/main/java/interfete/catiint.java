/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfete;

import newpackage.InterfataGraficaMagazinElectronice;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mycompany.magazinelectronice.*;
import java.awt.*;
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
                .addGap(137, 137, 137)
                .addComponent(titlu, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 224, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titlu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(52, Short.MAX_VALUE))))
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
              int valoareCantitate =Integer.parseInt (textFieldCantitate.getText());
              int valoareAnAparitie = Integer.parseInt (textFieldAnAparitie.getText());
              float valoarePret = Float.parseFloat(textFieldPret.getText());
              String valoareCuloare = textFieldCuloare.getText();
              String valoareContactCuUrechea = textFieldContactCuUrechea.getText();
              String valoarePrincipiuDeFunctionare = textFieldPrincipiuDeFunctionare.getText();
              String valoareTipConectivitate = textFieldMarca.getText();
              float valoareLungimeCablu = Float.parseFloat(textFieldLungimeCablu.getText());
              float valoareRaspunsInFrecventa = Float.parseFloat(textFieldRaspunsInFrecventa.getText()); 
              int valoareAutonomie =Integer.parseInt (textFieldAutonomie.getText());
              int valoareImpedanta =Integer.parseInt (textFieldImpedanta.getText());
              int valoareGreutate =Integer.parseInt (textFieldGreutate.getText());
              int valoareSpl =Integer.parseInt (textFieldSpl.getText());
              
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

    private void updateTextAreaWithSelectedCasti(Casti selectedCasti) {
        jTextArea1.setText(selectedCasti.toString());
    }                          

     private void addLabelAndTextField(JPanel panel, String labelText, JTextField textField) {
        JLabel label = new JLabel(labelText);
        panel.add(label);
        panel.add(textField);
    }
     
    private void initializareComboBox() {
        String[] nume = new String[casti.length];
        for(int i = 0; i < casti.length; i++) {
            String marca = casti[i].getMarca();
            String model = casti[i].getModel();
            nume[i] = marca + " " + model;
        }
        jComboBox1.setModel(new DefaultComboBoxModel<>(nume));
        jTextArea1.setText(casti[0].toString());
    }   
    
    
    private void adaugaActionListenerComboBox() {
        jComboBox1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = jComboBox1.getSelectedIndex();
            if (selectedIndex >= 0) {
                Object obiectSelectat = casti[selectedIndex];
                String textAfisat = obiectSelectat.toString();
                jTextArea1.setText(textAfisat);
                jButton1.setVisible(true); // Facem butonul de editare vizibil
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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu menu;
    private javax.swing.JLabel titlu;
    // End of variables declaration//GEN-END:variables
}
