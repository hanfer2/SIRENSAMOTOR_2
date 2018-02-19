
package sirensamotor;

import co.com.sirensaMotor.ImplementsDAO.MyDAO.MyDAOManager;
import co.com.sirensaMotor.Vista.Login;
import co.com.sirensaMotor.Vista.Menu;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SirensaMotor {
   static Login login = null;
    public static void main(String args[]) throws SQLException{
        
        invocarLogin();
        
        if(login.isAceptar()){
            String username = login.getUsuario();
            String password = login.getContraseña();
            MyDAOManager manager =null;
            
            try{
            manager = new MyDAOManager("maira", "maira123", "SIENSAMOTORDBD");
         
            }catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
                invocarLogin();
            }
            if(manager != null)
            {
                Menu mnu = new Menu(manager);
                mnu.setLocationRelativeTo(null);
                mnu.setVisible(true);
            }
            
        }   
    }
    public  static void invocarLogin()
    {
        login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
}
