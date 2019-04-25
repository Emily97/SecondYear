/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazine;

/**
 *
 * @author N00150623
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection sConnection;

    public static Connection getInstance() throws ClassNotFoundException, SQLException {
        String host, db, user, password;
        
        host = "localhost";
        db = "magazineapp";
        user = "root";
        password = "";
        
   
       
        if (sConnection == null || sConnection.isClosed()) {
     
            
            String url = "jdbc:mysql://" + host + "/" + db ;
             
            Class.forName("com.mysql.jdbc.Driver");
            sConnection = DriverManager.getConnection(url, user, null);
        }

        return sConnection;
    }
}