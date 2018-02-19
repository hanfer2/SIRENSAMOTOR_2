package co.com.sirensaMotor.dao;

import co.com.sirensaMotor.objetos.interno.Cliente;
import java.util.List;


public interface DAOCliente {
    
    public void insertar(Cliente c) throws DAOException;
    
    public void modificar (Cliente c)throws DAOException;
    
    public void eliminar (Cliente c)throws DAOException;
    
    List<Cliente> listaClientes()throws DAOException;
    
    Cliente obtener(int id)throws DAOException;
}

    
    