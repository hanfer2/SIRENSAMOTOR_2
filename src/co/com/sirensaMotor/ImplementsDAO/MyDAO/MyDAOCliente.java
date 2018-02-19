
package co.com.sirensaMotor.ImplementsDAO.MyDAO;

import co.com.sirensaMotor.dao.DAOCliente;
import co.com.sirensaMotor.dao.DAOException;
import co.com.sirensaMotor.objetos.interno.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyDAOCliente implements DAOCliente {
    
    final String INSERT = "INSERT INTO tblCliente (tipoIdentificacion, identificacion, direccion, nombreCliente,telefono, celular, ciudad, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    final String UPDATE = "UPDATE tblCliente SET tipoIdentificacion = ?, identificacion = ?, direccion = ?, nombreCliente = ?, telefono = ?, celular = ?, ciudad = ?, email = ? WHERE id = ?";
    final String DELETE = "DELETE FROM tblCliente WHERE id = ?";
    final String OBTENERCLIENTE = "SELECT id, idUsuario, tipoIdentificacion, identificacion, direccion, nombreCliente,telefono, celular, ciudad, email FROM tblCliente";
    final String OBTENER = "SELECT id, identificacion, tipoIdentificacion, direccion, nombreCliente, telefono, celular, ciudad, email FROM tblCliente WHERE identificacion = ?";
    
    public Connection conex;
    public MyDAOCliente (Connection conex){
        this.conex = conex;
    }

    @Override
    public void insertar(Cliente c) throws DAOException {
        PreparedStatement cliente = null;
        try{
            cliente = conex.prepareStatement(INSERT);
            cliente.setInt(1, c.getTipoIdentificacion());
            cliente.setString(2, c.getIdentificacion());
            cliente.setString(3, c.getDireccion());
            cliente.setString(4, c.getNombre());
            cliente.setString(5, c.getTelefono());
            cliente.setString(6, c.getCelular());
            cliente.setString(7, c.getCiudad());
            cliente.setString(8, c.getEmail());
            if (cliente.executeUpdate() == 0){
                throw new DAOException("No se ha guardado el cliente");
            }
            ResultSet rs = cliente.getGeneratedKeys();
            if(rs.next()){
                c.setId(rs.getInt(1));
            }else{
                throw new DAOException("No se puede asignar id a este cliente");
            }
        }catch(SQLException ex)  {
            throw new DAOException ("Error en sql", ex);
        }finally{
            if(cliente != null){
                try{
                    cliente.close();
                }catch (SQLException ex){
                    throw new DAOException("Error en sql", ex);
                }
            }
        }
    }
    
    @Override
    public void modificar(Cliente c) throws DAOException {
        PreparedStatement cliente = null;
        try{
            cliente = conex.prepareStatement(UPDATE);
            cliente.setInt(1, c.getTipoIdentificacion());
            cliente.setString(2, c.getIdentificacion());
            cliente.setString(3, c.getDireccion());
            cliente.setString(4, c.getNombre());
            cliente.setString(5, c.getTelefono());
            cliente.setString(6, c.getCelular());
            cliente.setString(7, c.getCiudad());
            cliente.setString(8, c.getEmail());
            cliente.setInt(9, c.getId());
            if (cliente.executeUpdate() == 0){
                throw new DAOException("No se ha modificado el cliente");
            }
           }catch (SQLException ex){
            throw new  DAOException ("Error de SQL", ex);
        }finally{
            if (cliente != null){
                try{
                    cliente.close();
                }catch (SQLException ex){
                    throw new DAOException ("Error de SQL", ex);
                }
            }
        }
    }

    @Override
    public void eliminar(Cliente c) throws DAOException {
        PreparedStatement cliente = null;
        try{
            cliente = conex.prepareStatement(DELETE);
            cliente.setInt(1, c.getId());
            if(cliente.executeUpdate() == 0){
                throw new DAOException("No se ha borrado");
            }
        }catch (SQLException ex){
            throw new DAOException("Error en SQL", ex);
        }finally{
            if (cliente != null){
                try{
                    cliente.close();
                }catch (SQLException ex){
                   throw new DAOException("Error en SQL", ex); 
                }
            }
        }
    }
    
    public Cliente convertir(ResultSet rs)throws SQLException{
        int id = rs.getInt("id");
        int tipoIdentificacion = rs.getInt("tipoIdentificacion");
        String identificacion = rs.getString("identificacion");
        String nombre = rs.getString("nombreCliente");
        String direccion = rs.getString("direccion");
        String telefono = rs.getString("telefono");
        String celular = rs.getString("celular");
        String email = rs.getString("email");
        String ciudad = rs.getString("ciudad");
        Cliente cliente = new Cliente(id, tipoIdentificacion, identificacion, nombre, telefono, celular, direccion, email, ciudad);
        cliente.setId(rs.getInt("id"));
        return cliente;
    }

    @Override
    public List<Cliente> listaClientes() throws DAOException {
        PreparedStatement pr = null;
        ResultSet rs = null;
        List<Cliente> clientes = new ArrayList<>();
        try{
            pr = conex.prepareStatement(OBTENERCLIENTE);
            rs = pr.executeQuery();
            while(rs.next()){
                clientes.add(convertir(rs));
            }
        }catch (SQLException ex){
            throw new DAOException ("Error en sql", ex);
        }finally{
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MyDAOCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(pr != null){
                
                try {
                    pr.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MyDAOCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        }
        return clientes;
    }
    

    @Override
    public Cliente obtener(int id) throws DAOException {
        PreparedStatement pr = null;
        ResultSet rs = null;
        Cliente c = null;
        try{
            pr = conex.prepareStatement(OBTENER);
            pr.setInt(1, id);
            rs = pr.executeQuery();
            if(rs.next()){
                c = convertir(rs);
            }else{
                throw new DAOException("No se ha encontrado un cliente.");
            }
        }catch (SQLException ex){
            throw new DAOException("Error en sql", ex);
        }finally{
            if(rs != null){
                
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MyDAOCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(pr != null){
                try {
                    pr.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MyDAOCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        }
        return c;
    }
    
}
