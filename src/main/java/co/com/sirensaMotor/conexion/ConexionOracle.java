package co.com.sirensaMotor.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nicol
 */
public class ConexionOracle{
    
    public Connection conexion = null;
    
    public ConexionOracle() throws SQLException{
     
        try{
            conectar();
        }finally{
            cerrar();
        }
    }
    
    public void conectar() throws SQLException {
        String jdbc = "jdbc:oracle:thin:@localhost:1521:XE";
        conexion = DriverManager.getConnection(jdbc, "maira", "maira");
    }
    
    public void cerrar() throws SQLException {
        if (conexion != null){
            conexion.close();
        }
    }
}
    