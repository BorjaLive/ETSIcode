package patronsingletronpractica.interfaz;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import patronsingletronpractica.Agencia;
import patronsingletronpractica.Avion;
import patronsingletronpractica.Usuario;

public class MenuPrincipal extends javax.swing.JFrame {

    private final List<Usuario> usuarios;
    private final List<Agencia> agencias;
    private final Avion avion;
    private final DefaultListModel lmUsuarios, lmAgencias;

    public MenuPrincipal() {
        usuarios = new ArrayList<>();
        agencias = new ArrayList<>();
        avion = Avion.getAvion();
        initComponents();
        lmUsuarios = new DefaultListModel();
        lmAgencias = new DefaultListModel();
        listUsuarios.setModel(lmUsuarios);
        listAgencias.setModel(lmAgencias);
        actualizarTablaReservas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listUsuarios = new javax.swing.JList<>();
        inputDNI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCrearUsuario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        btnCrearAgencia = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAgencias = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableReservas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patrón Singletron Borja López");

        listUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listUsuarios);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuarios");

        btnCrearUsuario.setText("Crear usuario");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agencias");

        btnCrearAgencia.setText("Crear agencia");
        btnCrearAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAgenciaActionPerformed(evt);
            }
        });

        listAgencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listAgenciasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listAgencias);

        tableReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Asiento", "Pasajero"
            }
        ));
        jScrollPane3.setViewportView(tableReservas);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Reservas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(inputDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrearUsuario))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrearAgencia)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCrearAgencia))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        String dni = inputDNI.getText().trim();
        if(!dni.isEmpty()){
            usuarios.add(new Usuario(dni));
            actualizarListaUsuarios();
        }
        inputDNI.setText("");
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void listUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listUsuariosMouseClicked
        JList list = (JList) evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = list.locationToIndex(evt.getPoint());
            Usuario usuario = (Usuario) lmUsuarios.get(index);
            
            ComprarBilletes comprarBilletes = new ComprarBilletes(usuario, avion, this);
            comprarBilletes.setLocationRelativeTo(this);
            comprarBilletes.setVisible(true);
        }
    }//GEN-LAST:event_listUsuariosMouseClicked

    private void btnCrearAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAgenciaActionPerformed
        String nombre = inputNombre.getText().trim();
        if(!nombre.isEmpty()){
            agencias.add(new Agencia(nombre));
            actualizarListaAgencias();
        }
        inputNombre.setText("");
    }//GEN-LAST:event_btnCrearAgenciaActionPerformed

    private void listAgenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listAgenciasMouseClicked
        JList list = (JList) evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = list.locationToIndex(evt.getPoint());
            Agencia agencia = (Agencia) lmAgencias.get(index);
            
            DevolverBilletes devolverBilletes = new DevolverBilletes(agencia, avion, this);
            devolverBilletes.setLocationRelativeTo(this);
            devolverBilletes.setVisible(true);
        }
    }//GEN-LAST:event_listAgenciasMouseClicked

    private void actualizarListaUsuarios() {
        lmUsuarios.removeAllElements();
        for (Usuario usuario : usuarios) {
            lmUsuarios.addElement(usuario);
        }
    }
    
    private void actualizarListaAgencias() {
        lmAgencias.removeAllElements();
        for (Agencia agencia : agencias) {
            lmAgencias.addElement(agencia);
        }
    }
    
    public void actualizarTablaReservas() {
        DefaultTableModel tmReservas = (DefaultTableModel) tableReservas.getModel();
        while(tmReservas.getRowCount() > 0)
            tmReservas.removeRow(0);
        Usuario[] reservas = avion.obtenerReservas();
        for(int i = 0; i < reservas.length; i++){
            tmReservas.addRow(new String[]{Integer.toString(i+1), reservas[i]==null?"":reservas[i].toString()});
        }
    }
    
    public List<Usuario> obtenerUsuarios(){
        return usuarios;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearAgencia;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JTextField inputDNI;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<patronsingletronpractica.Agencia> listAgencias;
    private javax.swing.JList<Usuario> listUsuarios;
    private javax.swing.JTable tableReservas;
    // End of variables declaration//GEN-END:variables
}