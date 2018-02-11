package co.com.sirensaMotor.Vista;

import co.com.sirensaMotor.dao.DAOCliente;
import co.com.sirensaMotor.dao.DAOException;
import co.com.sirensaMotor.objetos.interno.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nicol
 */
public class ClienteTableModel extends AbstractTableModel {
    
    public DAOCliente cliente;
    public List<Cliente> datos = new ArrayList<>();
    
    public ClienteTableModel(DAOCliente cliente){
        this.cliente = cliente;
        
    }
    public void updateModel() throws DAOException{
        datos = cliente.listaCliente();
    }
    @Override
    public String getColumnName(int column){
        switch (column){
            case 0: return "ID";
            case 1: return "Nombre";
            case 2: return "Tipo de identificación";
            case 3: return "Número de identificación";
            case 4: return "Celular";
            case 5: return "Telefono";
            case 6: return "Direccion";
            case 7: return "Ciudad";
            default: return "[no]";
        }
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente consultado = datos.get(rowIndex);
        switch (columnIndex) {
            case 0: return consultado.getId();
            case 1: return consultado.getNombre();
            case 2: return consultado.getIdentificacion();
            case 3: return consultado.getTipoIdentificacion();
            case 4: return consultado.getTelefono();
            case 5: return consultado.getDireccion();
            case 6: return consultado.getEmail();
            case 7: return consultado.getCiudad();
            default: return"";
            
        }
    }
    
}
