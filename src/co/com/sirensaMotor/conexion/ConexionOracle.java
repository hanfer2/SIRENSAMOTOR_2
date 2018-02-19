package co.com.sirensaMotor.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import org.slf4j.LoggerFactory;


/**
 *
 * @author nicol
 */
public class ConexionOracle {
    
    public ConexionOracle() throws SQLException{
    try{
        conectar();
//        consulta();
    }finally{
    cerrar();
    }
}
    
    public Connection conexion = null;
    
    
    
    public void conectar() throws SQLException {
        String jdbc = "jdbc:oracle:thin:@localhost:1521:XE";
        conexion = DriverManager.getConnection(jdbc, "maira", "maira");
    }
    
//    public void consulta() throws SQLException {
//       Statement statemen = conexion.createStatement();
//    }
    
    
    public void cerrar() throws SQLException {
        if (conexion != null){
            conexion.close();
        }
    }
//    private static final Logger LOG = (Logger) LoggerFactory.getLogger(ConexionOracle.class);
}
    