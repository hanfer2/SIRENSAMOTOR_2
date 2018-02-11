package co.com.sirensaMotor.Vista;

import co.com.sirensaMotor.dao.DAOCliente;
import co.com.sirensaMotor.dao.DAOException;
import co.com.sirensaMotor.objetos.interno.Cliente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class VistaCRUDCliente extends javax.swing.JFrame {
    public Cliente micliente;
    public boolean editable;
    private final DAOCliente cliente;
    public ClienteTableModel modelo;
 //   public final Cliente clie;
    

    public VistaCRUDCliente(DAOCliente cliente) throws DAOException {
        initComponents();
            this.cliente = cliente;
            this.modelo = new ClienteTableModel(cliente);
            this.modelo.updateModel();
            this.tablaCliente.setModel(modelo);
            this.tablaCliente.getSelectionModel().addListSelectionListener(e ->{
            boolean seleccionValida = (tablaCliente.getSelectedRow() != -1);
            btnEditar.setEnabled(seleccionValida);
            btnEliminar.setEnabled(seleccionValida);
        });
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        detalleCliente = new co.com.sirensaMotor.Vista.ClientePanel();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        textId = new javax.swing.JTextField();

        jPanel1.setLayout(new java.awt.BorderLayout());

        btnNuevo.setText("jButton1");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaCliente);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnEditar.setText("jButton2");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnGuardar.setText("jButton3");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("jButton4");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setText("jButton2");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        textId.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(671, 671, 671))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(30, 30, 30)
                .addComponent(btnEliminar)
                .addGap(47, 47, 47)
                .addComponent(btnGuardar)
                .addGap(26, 26, 26)
                .addComponent(btnEditar)
                .addGap(42, 42, 42)
                .addComponent(btnNuevo)
                .addGap(19, 19, 19))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detalleCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(detalleCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnNuevo)
                                    .addComponent(btnEditar))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnGuardar)
                                .addComponent(btnEliminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    public Cliente getClienteSeleccionado() throws DAOException{
        
        int id = (int) tablaCliente.getValueAt(tablaCliente.getSelectedRow(), 0);
        return cliente.obtenerCLiente(id);  
    }
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try{
        Cliente cliente = getClienteSeleccionado();
        detalleCliente.setCliente(cliente);
        detalleCliente.setEditable(true);
        detalleCliente.cargarDatos();
        btnEditar.setEnabled(true);
        btnCancelar.setEnabled(true);
        }catch (DAOException ex){
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        detalleCliente.setCliente(null);
        detalleCliente.setEditable(false);
        detalleCliente.cargarDatos();
        tablaCliente.clearSelection();
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        detalleCliente.setCliente(null);
        detalleCliente.cargarDatos();
        detalleCliente.setEditable(true);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Cliente c = detalleCliente.getCliente();
        //        if(c.getId() == null){
//            cliente.insertar();
//        }
        detalleCliente.setCliente(null);
        detalleCliente.setEditable(false);
        detalleCliente.cargarDatos();
        tablaCliente.clearSelection();
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        try {
            modelo.updateModel();//Actualiza la tablaCLiente
            modelo.fireTableDataChanged();
        } catch (DAOException ex) {
            Logger.getLogger(VistaCRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(JOptionPane.showConfirmDialog(rootPane, "¿Seguro que quieres eliminar este cliente?",
                "Eliminar cliente", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)== JOptionPane.YES_OPTION){
            try {
                Cliente c = getClienteSeleccionado();
            } catch (DAOException ex) {
                Logger.getLogger(VistaCRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                cliente.eliminar(micliente);
                modelo.updateModel();//Actualiza la tablaCLiente
                modelo.fireTableDataChanged();
            } catch (DAOException ex) {
                Logger.getLogger(VistaCRUDCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private co.com.sirensaMotor.Vista.ClientePanel detalleCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTextField textId;
    // End of variables declaration//GEN-END:variables

   
}
