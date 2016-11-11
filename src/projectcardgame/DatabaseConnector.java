
package projectcardgame;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;

/**
 *
 * @author mohini
 */

/*
 * connects to the database, and adds/changes/deletes variables.
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
    
    public void connect(){
        
    }
}
