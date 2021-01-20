/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Persistencia.ConexionOracle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author borja
 */
public class VentanaInicioSesion extends javax.swing.JFrame {

    private VentanaPrincipal padre;
    /**
     * Creates new form VentanaInicioSesion
     */
    public VentanaInicioSesion(VentanaPrincipal padre) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Iniciar sesión");
        setResizable(false);
        
        this.padre = padre;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Usuario = new javax.swing.JTextField();
        Conectar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        contrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Conectar.setText("Conectar");
        Conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConectarActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(Conectar)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(contrasena))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Conectar)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConectarActionPerformed
        try {
            padre.setConexion(new ConexionOracle(Usuario.getText(), new String(contrasena.getPassword())));
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error al iniciar sesión", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ConectarActionPerformed

    private void contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Conectar;
    private javax.swing.JTextField Usuario;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
