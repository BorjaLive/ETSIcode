package patronadapterpractica.interfaces;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import patronadapterpractica.CocheAutomatico;
import patronadapterpractica.CocheManual;
import patronadapterpractica.Estado;
import patronadapterpractica.IMandos;

public class ConducirAdaptado extends javax.swing.JFrame {

    private IMandos vehiculo;

    public ConducirAdaptado(Class tipo, String nombre) {
        try {
            vehiculo = (IMandos) tipo.getDeclaredConstructor().newInstance();
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(ConducirAdaptado.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        labelTitulo.setText("Conducir un " + nombre + " adaptado");
        actualizarSalpicadero();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelVelocidad = new javax.swing.JLabel();
        labelRevoluciones = new javax.swing.JLabel();
        labelEncendido = new javax.swing.JLabel();
        labelAveria = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adaptacioón");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelVelocidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelVelocidad.setText("Velocidad");

        labelRevoluciones.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelRevoluciones.setText("Revoluciones");

        labelEncendido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelEncendido.setText("Encendido");

        labelAveria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelAveria.setText("Averia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelVelocidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelRevoluciones, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(labelEncendido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelAveria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelVelocidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelRevoluciones)
                .addGap(18, 18, 18)
                .addComponent(labelEncendido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelAveria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Conducir un vehículo adaptado");

        jButton1.setText("Acelerar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Frenar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        vehiculo.Acelerar();
        actualizarSalpicadero();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        vehiculo.Frenar();
        actualizarSalpicadero();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void actualizarSalpicadero() {
        Estado estado = vehiculo.getEstado();
        labelVelocidad.setText("<html><span style=\"font-weight:bold;\">Velocidad: </span><span>" + estado.getVelocidad() + " km/h</span></html>");
        labelRevoluciones.setText("<html><span style=\"font-weight:bold;\">Revoluciones: </span><span>" + estado.getRevoluciones() + " rpm</span></html>");
        labelEncendido.setText("<html><span style=\"font-weight:bold;\">Motor: </span>" + (estado.isEncendido() ? "<span style=\"color:green;\">Encendido</span>" : "<span>Apagado</span>") + "</html>");
        labelAveria.setText("<html><span style=\"font-weight:bold;\">Estado: </span><span>" + (estado.isAveria() ? "<span style=\"color:red;\">Averiado</span>" : "<span style=\"color:green;\">Bueno</span>") + "</span></html>");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAveria;
    private javax.swing.JLabel labelEncendido;
    private javax.swing.JLabel labelRevoluciones;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelVelocidad;
    // End of variables declaration//GEN-END:variables
}