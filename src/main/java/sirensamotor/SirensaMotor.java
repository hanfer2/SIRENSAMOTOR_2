/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirensamotor;

import co.com.sirensaMotor.Vista.Menu;
import co.com.sirensaMotor.Vista.VistaCRUDCliente;
import co.com.sirensaMotor.dao.DAOCliente;
import co.com.sirensaMotor.dao.DAOException;
import java.sql.SQLException;

/**
 *
 * @author nicol
 */
public class SirensaMotor {
    
    
        public static void main(String args[]) throws SQLException, DAOException {
     //VistaCRUDCliente vtn = new VistaCRUDCliente(new DAOCliente());
     //vtn.setVisible(true);
     Menu menu = new Menu();
     menu.setVisible(true);
    }
    
}
