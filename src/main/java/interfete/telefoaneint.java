package interfete;
/**
 *
 * @author Razvan
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mycompany.magazinelectronice.*;
import java.awt.*;
import newpackage.*;

public class telefoaneint extends javax.swing.JFrame {
    Instances inst = new Instances();
    
    Device[] tel = inst.getInstancesArray("telefoane");
    Telefon[] telefoane = (Telefon[]) tel;

    /**
     * Creates new form telefoaneint
     */
       
    public telefoaneint() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        initializareComboBox(); // Inițializează combobox-ul
        adaugaActionListenerComboBox();
        editBut.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backtest = new java.awt.Button();
        titlu = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        editBut = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        home = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backtest.setBackground(new java.awt.Color(255, 51, 51));
        backtest.setLabel("Back");
        backtest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtestActionPerformed(evt);
            }
        });

        titlu.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        titlu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlu.setText("Telefoane");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apasati pentru a vedea telefoanele" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
                ActionListener(evt);
                ActionEvent(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        editBut.setText("Editare detalii telefon");
        editBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButActionPerformed(evt);
            }
        });

        menu.setText("Home");
        menu.setToolTipText("");

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
                .addGap(95, 95, 95)
                .addComponent(backtest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, 304, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backtest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titlu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(editBut)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backtestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtestActionPerformed
        this.setVisible(false);
   
        InterfataGraficaMagazinElectronice home = new InterfataGraficaMagazinElectronice();
        home.setVisible(true);
    }//GEN-LAST:event_backtestActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        this.setVisible(false);
   
        InterfataGraficaMagazinElectronice home = new InterfataGraficaMagazinElectronice();
        home.setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed
 
    private void updateTextAreaWithSelectedPhone(Telefon selectedPhone) {
        jTextArea1.setText(selectedPhone.toString());
    }
    
    private void ActionListener(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionListener
        // TODO add your handling code here:
    }//GEN-LAST:event_ActionListener

    private void ActionEvent(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionEvent
       
    }//GEN-LAST:event_ActionEvent

    private void editButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButActionPerformed
       int selectedIndex = jComboBox1.getSelectedIndex();
        if (selectedIndex >= 0) {
        Telefon selectedPhone = telefoane[selectedIndex];
        JFrame popup = new JFrame("Detalii Telefon");
    popup.setSize(1000, 900);
    popup.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(0, 2)); // Layout pentru a afișa perechi etichetă-câmp text
       
    if (selectedIndex >= 0 && selectedIndex < telefoane.length) {
        JTextField textFieldMarca = new JTextField(selectedPhone.getMarca());
        JTextField textFieldModel = new JTextField(selectedPhone.getModel());
        JTextField textFieldCantitate = new JTextField(String.valueOf(selectedPhone.getCantitate()));
        JTextField textFieldAnAparitie = new JTextField(String.valueOf(selectedPhone.getAnAparitie()));
        JTextField textFieldPret = new JTextField(String.valueOf(selectedPhone.getPret()));
        JTextField textFieldProcesor = new JTextField(selectedPhone.getProcesor());
        JTextField textFieldTipEcran = new JTextField(selectedPhone.getTipEcran());
        JTextField textFieldCuloare = new JTextField(selectedPhone.getCuloare());
        JTextField textFieldFrecventaAntena = new JTextField(selectedPhone.getFrecventaAntena());
        JTextField textFieldSisOpTel = new JTextField(selectedPhone.getSisOpTel());
        JTextField textFieldTipIncarcare = new JTextField(selectedPhone.getTipIncarcare());
        JTextField textFieldTipSim = new JTextField(selectedPhone.getTipSim());
        JTextField textFieldRezEcran = new JTextField(selectedPhone.getRezEcran());
        JTextField textFieldRezCamere = new JTextField(selectedPhone.getRezCamere());
        JTextField textFieldMemorieROM = new JTextField(String.valueOf(selectedPhone.getMemorieROM()));
        JTextField textFieldMemorieRAM = new JTextField(String.valueOf(selectedPhone.getMemorieRAM()));
        JTextField textFieldNrCamere = new JTextField(String.valueOf(selectedPhone.getNrCamere()));
        JTextField textFieldMarimeBat = new JTextField(String.valueOf(selectedPhone.getMarimeBat()));
        JTextField textFieldDiagonalaEcran = new JTextField(String.valueOf(selectedPhone.getDiagonalaEcran()));
    
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
              
              selectedPhone.setMarca(valoareMarca);
              selectedPhone.setModel(valoareModel);
              selectedPhone.setCantitate(valoareCantitate);
              selectedPhone.setAnAparitie(valoareAnAparitie);
              selectedPhone.setPret(valoarePret);              
              selectedPhone.setProcesor(valoareProcesor);
              selectedPhone.setTipEcran(valoareTipEcran);
              selectedPhone.setCuloare(valoareCuloare);
              selectedPhone.setFrecventaAntena(valoareFrecventaAntena);
              selectedPhone.setSisOpTel(valoareSisOpTel);
              selectedPhone.setTipIncarcare(valoareTipIncarcare);
              selectedPhone.setTipSim(valoareTipSim);
              selectedPhone.setRezCamere(valoareRezCamere);
              selectedPhone.setMemorieROM(valoareMemorieROM);
              selectedPhone.setRezEcran(valoareRezEcran);
              selectedPhone.setmemorieRAM(valoareMemorieRAM);
              selectedPhone.setNrCamere(valoareNrCamere);
              selectedPhone.setMarimeBat(valoareMarimeBat);
              selectedPhone.setDiagonalaEcran(Float.parseFloat(textFieldDiagonalaEcran.getText()));
              telefoane[selectedIndex].setMarca(selectedPhone.getMarca());
              JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(saveButton);
              frame.dispose();
              updateTextAreaWithSelectedPhone(selectedPhone);
            }
        });
        panel.add(saveButton);
    }
        
        popup.add(panel);
        popup.setVisible(true);
    }//GEN-LAST:event_editButActionPerformed
    }
    private void addLabelAndTextField(JPanel panel, String labelText, JTextField textField) {
        JLabel label = new JLabel(labelText);
        panel.add(label);
        panel.add(textField);
    }
    
    private void initializareComboBox() {
        String[] numeTel = new String[telefoane.length];
        for(int i = 0; i < telefoane.length; i++) {
            String marca = telefoane[i].getMarca();
            String model = telefoane[i].getModel();
            numeTel[i] = marca + " " + model;
        }
        jComboBox1.setModel(new DefaultComboBoxModel<>(numeTel));
        jTextArea1.setText(telefoane[0].toString());
    }
    
    // Metoda pentru a adăuga ActionListener la combobox
    private void adaugaActionListenerComboBox() {
        jComboBox1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int selectedIndex = jComboBox1.getSelectedIndex();
            if (selectedIndex >= 0) {
                Object obiectSelectat = telefoane[selectedIndex];
                String textAfisat = obiectSelectat.toString();
                jTextArea1.setText(textAfisat);
                editBut.setVisible(true); // Facem butonul de editare vizibil
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
            java.util.logging.Logger.getLogger(telefoaneint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telefoaneint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telefoaneint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telefoaneint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telefoaneint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button backtest;
    private javax.swing.JButton editBut;
    private javax.swing.JMenuItem home;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu menu;
    private javax.swing.JLabel titlu;
    // End of variables declaration//GEN-END:variables
}
