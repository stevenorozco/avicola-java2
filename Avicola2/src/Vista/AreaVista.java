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
public class AreaVista extends BaseVista {
     
    /** 
     * Creates new form AreaVista
     */
    public AreaVista(Controlador c) {
        this.miControl = c;
        initComponents();
        iniciarFormulario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCbbTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jCbbEmpresa = new javax.swing.JComboBox<>();
        jBtnGuardar = new javax.swing.JButton();
        jChbBeneficioCooperativa = new javax.swing.JCheckBox();

        jLabel1.setText("ID");

        jTxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIdActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo");

        jLabel3.setText("Nombre");

        jCbbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Empresa");

        jCbbEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbbEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbbEmpresaActionPerformed(evt);
            }
        });

        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jChbBeneficioCooperativa.setText("Beneficio Cooperativa");
        jChbBeneficioCooperativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChbBeneficioCooperativaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jBtnGuardar)
                                .addComponent(jCbbEmpresa, 0, 239, Short.MAX_VALUE)
                                .addComponent(jTxtId))
                            .addComponent(jCbbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jChbBeneficioCooperativa, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCbbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jChbBeneficioCooperativa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jBtnGuardar)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdActionPerformed

    private void jCbbEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbbEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbbEmpresaActionPerformed

    
    private boolean validarCampos(){
        if (jTxtNombre.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Debe ingresar un nombre");
            return false;
        }
        
         if (jTxtId.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Debe ingresar un ID");
            return false;
        }
        

        return true;
    }
    
    private void iniciarFormulario(){
        System.out.println("hollaa.......");
        System.out.println(this.miControl.getEmpresa().getNombre());
        HashSet<Area> as = this.miControl.getEmpresa().getAreas();
        for (Area obj : as) {
            System.out.println(obj.getNombre());
        } 
        //jCbbArea.setModel();
    }
    //Guardar
    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        // TODO add your handling code here:
        try{
            if (validarCampos()){
                int id = Integer.parseInt(jTxtId.getText());
                String tipo = (String)jCbbTipo.getSelectedItem();
                String nombre = jTxtNombre.getText();
                boolean beneficio_cooperativa = jChbBeneficioCooperativa.isSelected();

                miControl.adicionarArea(id, tipo, nombre, beneficio_cooperativa, miControl.getEmpresa());
                JOptionPane.showMessageDialog(this, "El empleado ya existe ");
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Posibles razones del error: \n-Faltan datos \n-Excediste el limete de 10 digitos en los valores numericos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private void jChbBeneficioCooperativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChbBeneficioCooperativaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChbBeneficioCooperativaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JComboBox<String> jCbbEmpresa;
    private javax.swing.JComboBox<String> jCbbTipo;
    private javax.swing.JCheckBox jChbBeneficioCooperativa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtNombre;
    // End of variables declaration//GEN-END:variables
}
