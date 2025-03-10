package backend;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Clemente
 */
public class SQLiteJDBC {

    public SQLiteJDBC() {
        try {
            Connection connection = null;
            connection = (Connection) DriverManager.getConnection("jdbc:sqlite:test.db");
            JOptionPane.showConfirmDialog(null, "Conexão bem sucedida");
            
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro de conexã0: "+e.getMessage().toString());
        }
    }

   

}
