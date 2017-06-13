
package database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;

/**
 *
 * @author mohini
 */

/*
 * dis-/connects to the database, and checks if connected.
 * 
 */

public class DatabaseConnector {
    
    String url = null;
    String user = null;
    String password = null;
    
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    
    PreparedStatement preparedStatement = null;
    
    public static void connect(){
        
    }
    
    public static void close(){
        
    }
    
    public static Connection getConnection (){
        return null;
    }
}
