/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Control.*;
import Modelo.Area;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author luissalamanca
 */
public class EmpleadoVista extends javax.swing.JInternalFrame {
    
    private Controlador miControl;
    
    /**
     * Creates new form EmpleadoVista
     */
    public EmpleadoVista(Controlador c) {
        this.miControl = c;
        initComponents();
        //iniciarFormulario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTxtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtTelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTxtCargo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtNivelProfesional = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTxtSalario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jChBVeterinario = new javax.swing.JCheckBox();
        jTxtExperiencia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIdActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Cedula");

        jTxCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxCedulaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel4.setText("Telefono");

        jLabel5.setText("Cargo");

        jLabel6.setText("Nivel Profesional");

        jTxtNivelProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNivelProfesionalActionPerformed(evt);
            }
        });

        jLabel7.setText("Salario");

        jTxtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSalarioActionPerformed(evt);
            }
        });

        jButton1.setText("Crear");

        jChBVeterinario.setText("Veterinario");
        jChBVeterinario.setToolTipText("");
        jChBVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChBVeterinarioActionPerformed(evt);
            }
        });

        jTxtExperiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtExperienciaActionPerformed(evt);
            }
        });

        jLabel8.setText("Años de Experiencia");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtId)
                            .addComponent(jTxCedula)
                            .addComponent(jTxtNombre)
                            .addComponent(jTxtTelefono)
                            .addComponent(jTxtCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jChBVeterinario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtExperiencia, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(jTxtNivelProfesional, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtSalario, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTxtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTxtNivelProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jChBVeterinario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTxtExperiencia))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdActionPerformed

    private void jTxtNivelProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNivelProfesionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtNivelProfesionalActionPerformed

    private void jTxCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxCedulaActionPerformed

    private void jTxtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtSalarioActionPerformed

    private void jChBVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChBVeterinarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChBVeterinarioActionPerformed

    private void jTxtExperienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtExperienciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtExperienciaActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jChBVeterinario;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTxCedula;
    private javax.swing.JTextField jTxtCargo;
    private javax.swing.JTextField jTxtExperiencia;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtNivelProfesional;
    private javax.swing.JTextField jTxtNombre;
    private javax.swing.JTextField jTxtSalario;
    private javax.swing.JTextField jTxtTelefono;
    // End of variables declaration//GEN-END:variables
}
