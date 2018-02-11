package co.com.sirensaMotor.dao;

import co.com.sirensaMotor.conexion.ConexionOracle;
import co.com.sirensaMotor.objetos.interno.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DAOCliente  {

    
    final String INSERT = "INSERT INTO tblCliente (tipoIdentificacion, identificacion, direccion, nombreCliente,telefono, celular, email) VALUES (?, ?, ?, ?, ?, ?, ?)";
    final String UPDATE = "UPDATE tblCliente SET id Usuario = ?, tipoIdentificacion = ?, identificacion = ?, direccion = ?, nombreCliente = ?, telefono = ?, celular = ?, email = ? WHERE id = ?";
    final String DELETE = "DELETE FROM tblCliente WHERE id = ?";
    final String OBTENERCLIENTE = "SELECT id, idUsuario, tipoIdentificacion, identificacion, direccion, nombreCliente,teleono, celular, email FROM tblCliente";
    final String OBTENER = "SELECT id, idUsuario, identificacion, tipoIdentificacion, direccion, nombreCliente,telefono, celular, email FROM tblCliente WHERE identificacion = ?";
    
    public Connection conexion;
    public DAOCliente () throws SQLException
    {
        ConexionOracle conex = new ConexionOracle();
        this.conexion = conex.conexion;
    }

    public void insertar(Cliente cliente) throws DAOException {
        PreparedStatement c = null;
        try{
            c = conexion.prepareStatement(INSERT);
            c.setInt(1, cliente.getTipoIdentificacion());
            c.setString(2, cliente.getCelular());
            c.setString(3, cliente.getDireccion());
            c.setString(4, cliente.getEmail());
            c.setString(5, cliente.getIdentificacion());
            c.setString(6, cliente.getNombre());
            c.setString(7, cliente.getTelefono());
            if (c.executeUpdate() == 0){
                throw new DAOException("No se ha guardado el cliente");
            }
            ResultSet rs = c.getGeneratedKeys();
            if(rs.next()){
                cliente.setId(rs.getInt(1));
            }else{
                throw new DAOException("No se puede asignar id a este cliente");
            }
        }catch (SQLException ex){
            throw new DAOException ("Error en SQL", ex);
        }finally {
            if (c != null){
                try{
                c.close();
                }catch (SQLException ex){
                    throw new DAOException ("Error en SQL", ex);
                }
            }
        }
    }
    
    public void eliminar (Cliente cliente) throws DAOException{
        PreparedStatement c = null;
        try{
            c = conexion.prepareStatement(DELETE);
            c.setLong(1, cliente.getId());
            if(c.executeUpdate() == 0){
                throw new DAOException("No se ha borrado");
            }
        }catch (SQLException ex){
            throw new DAOException("Error en SQL", ex);
        }finally{
            if (c != null){
                try{
                    c.close();
                }catch (SQLException ex){
                   throw new DAOException("Error en SQL", ex); 
                }
            }
        }
    }
    
    public void modificar (Cliente cliente) throws DAOException{
        PreparedStatement c = null;
        try{
            c = conexion.prepareStatement(UPDATE);
            c.setInt(1, cliente.getTipoIdentificacion());
            c.setString(2, cliente.getIdentificacion());
            c.setString(3, cliente.getCelular());
            c.setString(4, cliente.getDireccion());
            c.setString(5, cliente.getEmail());
            c.setString(6, cliente.getNombre());
            c.setString(7, cliente.getTelefono());
            if (c.executeUpdate() == 0){
                throw new DAOException("No se ha modificado el cliente");
            }
           }catch (SQLException ex){
            throw new  DAOException ("Error de SQL", ex);
        }finally{
            if (c != null){
                try{
                    c.close();
                }catch (SQLException ex){
                    throw new DAOException ("Error de SQL", ex);
                }
            }
        }
       
    }

    public Cliente convertir (ResultSet rs) throws SQLException{ //Convertir los datos de las columnas.
        
        int tipoIdentificacion = rs.getInt("tipoIdentificacion");
        String nombre = rs.getString("nombreCliente");
        String identificacion = rs.getString("identificacion");
        String celular = rs.getString("celular");
        String telefono = rs.getString("telefono");
        String email = rs.getString("email");
        String direccion = rs.getString("direccion");
        Cliente cliente = new  Cliente (tipoIdentificacion, nombre, identificacion, celular, telefono, email, direccion);
        cliente.setId(rs.getInt("id"));
        return cliente;
    }
    
    public Cliente obtenerCLiente(int id) throws DAOException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        Cliente cliente = null;
        try{
            ps = conexion.prepareStatement(OBTENER);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()){
                cliente = convertir(rs);
            }else{
                throw  new DAOException("No se ha encontrrado ese registro.");
            }
        }catch (SQLException ex){
            throw new DAOException("Error en SQL", ex);
        }finally{
            if(rs != null){
                try{
                    rs.close();
                }catch (SQLException ex){
                    new DAOException("Error en SQL", ex);
                }
            }
            if (ps != null){
                try{
                    ps.close();
                }catch (SQLException ex){
                    new DAOException("Error en SQL", ex);
                }
            }
        }return cliente;
    }
    
    public List<Cliente> listaCliente() throws DAOException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Cliente> cliente = new ArrayList<>();
        try{
            ps = conexion.prepareStatement(OBTENERCLIENTE);
            rs = ps.executeQuery();
            while (rs.next()){
                cliente.add(convertir(rs));
            }
        }catch (SQLException ex){
            throw new DAOException("Error en SQL", ex);
        }finally{
            if(rs != null){
                try{
                    rs.close();
                }catch (SQLException ex){
                    new DAOException("Error en SQL", ex);
                }
            }
            if (ps != null){
                try{
                    ps.close();
                }catch (SQLException ex){
                    new DAOException("Error en SQL", ex);
                }
            }
        }return cliente;
    }

    
}

 