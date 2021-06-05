package patroniteratorpractica.interfaz;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import patroniteratorpractica.Contenedor;
import patroniteratorpractica.ContenedorAsociativo;
import patroniteratorpractica.Factoria;
import patroniteratorpractica.FactoriaIteradores;
import patroniteratorpractica.IIterable;

public class MenuPrincipal extends javax.swing.JFrame {

    private final DefaultListModel<IIterable> mLista;
    private final Factoria factoria;

    public MenuPrincipal() {
        mLista = new DefaultListModel<>();
        factoria = new FactoriaIteradores();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        comboContenedor = new javax.swing.JComboBox<>();
        comboIterador = new javax.swing.JComboBox<>();
        btnVisualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iterator Borja López");

        lista.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lista.setModel(mLista);
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Contenedores");

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        comboContenedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contenedor", "Contenedor asociativo" }));

        comboIterador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lista", "Pila", "Cola" }));

        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboIterador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboContenedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrear))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboIterador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String tipo = ((String) comboContenedor.getSelectedItem()).toLowerCase();
        if (tipo.equals("contenedor asociativo")) {
            mLista.addElement(new ContenedorAsociativo());
        } else if (tipo.equals("contenedor")) {
            mLista.addElement(new Contenedor());
        }

    }//GEN-LAST:event_btnCrearActionPerformed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        JList list = (JList) evt.getSource();
        if (evt.getClickCount() == 2) {
            int index = list.locationToIndex(evt.getPoint());
            IIterable contenedor = mLista.get(index);
            if (contenedor instanceof Contenedor) {
                navegar(new EditorContenedor((Contenedor) contenedor));
            } else if (contenedor instanceof ContenedorAsociativo) {
                navegar(new EditorContenedorAsociativo((ContenedorAsociativo) contenedor));
            }
        }
    }//GEN-LAST:event_listaMouseClicked

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        int indice = lista.getSelectedIndex();
        if (indice != -1) {
            navegar(new VisualizadorIterador(factoria.crearIterador(mLista.get(indice), (String) comboIterador.getSelectedItem())));
        }
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void navegar(JFrame f) {
        f.pack();
        f.setLocationRelativeTo(this);
        f.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JComboBox<String> comboContenedor;
    private javax.swing.JComboBox<String> comboIterador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<patroniteratorpractica.IIterable> lista;
    // End of variables declaration//GEN-END:variables
}