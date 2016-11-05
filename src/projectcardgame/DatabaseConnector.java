/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcardgame;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;

/**
 *
 * @author mohini
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
