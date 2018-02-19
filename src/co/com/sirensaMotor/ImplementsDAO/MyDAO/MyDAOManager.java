
package co.com.sirensaMotor.ImplementsDAO.MyDAO;

import co.com.sirensaMotor.dao.DAOCliente;
import co.com.sirensaMotor.dao.DAODevolucion;
import co.com.sirensaMotor.dao.DAOFactura;
import co.com.sirensaMotor.dao.DAOInventario;
import co.com.sirensaMotor.dao.DAOManager;
import co.com.sirensaMotor.dao.DAOParametros;
import co.com.sirensaMotor.dao.DAOPedido;
import co.com.sirensaMotor.dao.DAOProducto;
import co.com.sirensaMotor.dao.DAOProveedor;
import co.com.sirensaMotor.dao.DAORol;
import co.com.sirensaMotor.dao.DAOUsuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nicol
 */
public class MyDAOManager implements DAOManager{
    
    private Connection conex;
    public DAOCliente clientes = null;
    public DAODevolucion devoluciones = null;
    public DAOFactura facturas = null;
    public DAOInventario inventarios = null;
    public DAOParametros parametros = null;
    public DAOPedido pedidos = null;
    public DAOProducto productos = null;
    public DAOProveedor proveedores = null;
    public DAORol roles = null;
    public DAOUsuario usuarios = null;
    
    
    public MyDAOManager(String username, String password, String database) throws SQLException{
        conex = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", username, password);
    }

    @Override
    public DAOCliente getDAOCliente()  {
        if(clientes == null ){
            clientes = new MyDAOCliente(conex);
        }
        return clientes;
    }

    @Override
    public DAODevolucion getDAODevolucion() {
//        if (devoluciones == null){
//            devoluciones = new MyDAODevolucion(conex);
//        }
        return devoluciones;
    }

    @Override
    public DAOFactura getDAOFactura() {
//        if(facturas == null){
//            facturas = new MyDAOFactura(conex);
//        }
        return facturas;
    }

    @Override
    public DAOInventario getDAOInventario() {
//        if(inventarios == null){
//            inventarios = new MyDAOInventario(conex);
//        }
        return inventarios;
    }

    @Override
    public DAOParametros getDAOParametros() {
//        if(parametros == null){
//            parametros = new MyDAOParametro(conex);
//        }
        return parametros;
    }

    @Override
    public DAOPedido getDAOPedido() {
//        if(pedidos == null){
//            pedidos = new MyDAOPedido(conex);
//        }
        return pedidos;
    }

    @Override
    public DAOProducto geeDAOProducto() {
//        if(productos == null){
//            productos = new MyDAOPedido(conex);
//        }
        return productos;
    }

    @Override
    public DAORol getDAORol() {
//        if(roles == null){
//            roles = new MyDAORol(conex);
//        }
        return roles;
    }

    @Override
    public DAOUsuario getDAOUsuario() {
//        if (usuarios == null){
//            usuarios = new MyDAOUsuario(conex);
//        }
        return usuarios;
    }
    
}
