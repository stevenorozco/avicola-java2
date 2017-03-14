/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.*;
import Control.*;
import javax.swing.JOptionPane;
import java.util.HashSet;

/**
 *
 * @author luissalamanca
 */
public class CargoVista extends BaseVista {
     
    /** 
     * Creates new form AreaVista
     */
    public CargoVista(Controlador c) {
        this.miControl = new Controlador();
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
        jCbbArea = new javax.swing.JComboBox<>();
        jBtnGuardar = new javax.swing.JButton();

        jLabel1.setText("ID");

        jTxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIdActionPerformed(evt);
            }
        });

        jLabel2.setText("Area");

        jLabel3.setText("Nombre");

        jCbbArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
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
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBtnGuardar)
                                .addComponent(jTxtId, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCbbArea, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(jCbbArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jBtnGuardar)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdActionPerformed

    
    private void iniciarFormulario(){
        System.out.println("hollaa.......");
        System.out.println(this.miControl.getEmpresa().getNombre());
        HashSet<Area> as = this.miControl.getEmpresa().getAreas();
        for (Area obj : as) {
            System.out.println(obj.getNombre());
        } 
        //jCbbArea.setModel();
    }
    
    private void asociarDatosAFormulario(){}
    
    private boolean validarCampos(){
        if (jTxtNombre.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Debe ingresar un nombre");
            return false;
        }
        
        return true;
    }
    //Guardar
    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
        // TODO add your handling code here:
        try{
            if (validarCampos()){
                int id = Integer.parseInt(jTxtId.getText());
                String tipo = (String)jCbbArea.getSelectedItem();
                String nombre = jTxtNombre.getText();
                boolean beneficio_cooperativa = false; //jChbBeneficioCooperativa.isSelected();

                miControl.adicionarArea(id, tipo, nombre, beneficio_cooperativa, miControl.getEmpresa());
                JOptionPane.showMessageDialog(this, "El empleado ya existe ");
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Posibles razones del error: \n-Faltan datos \n-Excediste el limete de 10 digitos en los valores numericos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JComboBox<String> jCbbArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTxtId;
    private javax.swing.JTextField jTxtNombre;
    // End of variables declaration//GEN-END:variables
}