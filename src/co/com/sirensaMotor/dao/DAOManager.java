
package co.com.sirensaMotor.dao;


public interface DAOManager {
    
    DAOCliente getDAOCliente();
    
    DAODevolucion getDAODevolucion();
    
    DAOFactura getDAOFactura();
    
    DAOInventario getDAOInventario();
    
    DAOParametros getDAOParametros();
    
    DAOPedido getDAOPedido();
    
    DAOProducto geeDAOProducto();
    
    DAORol getDAORol();
    
    DAOUsuario getDAOUsuario();
}
