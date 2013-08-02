
package br.com.modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mayara_freita
 */
public class FabricaConexao {
    
    public static Connection getConnection() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost3306/revenda", "root", "");
        }catch(ClassNotFoundException e){
            throw new SQLException(e.getMessage());
        }
    }
    
}
