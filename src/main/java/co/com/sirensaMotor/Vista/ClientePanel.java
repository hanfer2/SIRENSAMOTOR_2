
package co.com.sirensaMotor.Vista;

import co.com.sirensaMotor.objetos.interno.Cliente;

/**
 *
 * @author nicol
 */
public class ClientePanel extends javax.swing.JPanel {
    
    public Cliente cliente;
    public boolean editable;


    public ClientePanel() {
        initComponents();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
        textNombre.setEditable(editable);
        textIdentificacion.setEditable(editable);
        tipoDocumento.setEditable(editable);
        textCelular.setEditable(editable);
        textTelefono.setEditable(editable);
        textCiudad.setEditable(editable);
        textDireccion.setEditable(editable);
    }
    
    public void cargarDatos(){
        if(cliente != null){
            textNombre.setText(cliente.getNombre());
            textIdentificacion.setText(cliente.getIdentificacion());
            textCelular.setText(cliente.getCelular());
            textTelefono.setText(cliente.getTelefono());
            textCiudad.setText(cliente.getCiudad());
            textDireccion.setText(cliente.getDireccion());
            //tipoIdentificacion.(cliente.getTipoIdentificacion());
        }else{
            textNombre.setText("");
            textIdentificacion.setText("");
            textCelular.setText("");
            textTelefono.setText("");
            textCiudad.setText("");
            textDireccion.setText("");
            //tipoDocumento.setText("");
        }
        textNombre.requestFocus();
    }
    
    public void guardarDatos(){
        if(cliente == null){
            cliente = new Cliente(); 
        }
        cliente.setNombre(textNombre.getText());
        cliente.setIdentificacion (textIdentificacion.getText());
        cliente.setCelular(textCelular.getText());
        cliente.setTelefono(textTelefono.getText());
        cliente.setCiudad(textCiudad.getText());
        cliente.setDireccion(textDireccion.getText());
        //cliente./tipoIdentificacion
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textIdentificacion = new javax.swing.JTextField();
        textCelular = new javax.swing.JTextField();
        textTelefono = new javax.swing.JTextField();
        textDireccion = new javax.swing.JTextField();
        textCiudad = new javax.swing.JTextField();
        tipoDocumento = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N

        jLabel1.setText("Nombre completo:");

        jLabel2.setText("Tipo de documento:");

        jLabel3.setText("Número de identificación:");

        jLabel4.setText("Número de celular:");

        jLabel5.setText("Número de telefono fijo:");

        jLabel6.setText("Dirección:");

        jLabel7.setText("Ciudad:");

        textNombre.setText("jTextField1");

        textIdentificacion.setText("jTextField3");

        textCelular.setText("jTextField4");

        textTelefono.setText("jTextField5");

        textDireccion.setText("jTextField6");

        textCiudad.setText("jTextField7");

        tipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(textDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(textTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCelular, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textIdentificacion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoDocumento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCiudad))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addComponent(textCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textCelular;
    private javax.swing.JTextField textCiudad;
    private javax.swing.JTextField textDireccion;
    private javax.swing.JTextField textIdentificacion;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textTelefono;
    private javax.swing.JComboBox<String> tipoDocumento;
    // End of variables declaration//GEN-END:variables
}
