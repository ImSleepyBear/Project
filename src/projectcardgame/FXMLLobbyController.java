/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcardgame;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author mohini
 */

/**
* This is where you come when you successfully have logged in
*/

public class FXMLLobbyController implements Initializable {
    
    @FXML
    private Button singlePlayer;
    
    @FXML
    private Button multiPlayer;
    
    @FXML
    private Button cardCollection;
    
    @FXML
    private Button instructions;
    
    @FXML
    private Button friends;
    
    @FXML
    private Button options;
    
    @FXML
    private Button logout;
    
    @FXML
    private ListView <String> friendList;
    
    private ChangeScene cs = new ChangeScene();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void singlePlayer(ActionEvent event){
        cs.change(event, null);
    }
    
    @FXML
    public void multiPlayer(ActionEvent event){
        cs.change(event, null);
    }
    
    @FXML
    public void cardCollection(ActionEvent event){
        cs.change(event, cs.collection);
    }
    
    @FXML
    public void instructions(ActionEvent event){
        cs.change(event, cs.instructions);
    }
    
    @FXML
    public void friends(ActionEvent event){
        cs.change(event, null);
    }
    
    @FXML
    public void options(ActionEvent event){
        cs.change(event, cs.options);
    }
    
    
    @FXML
    public void logOut(ActionEvent event){
        cs.change(event, cs.login);
        //System.exit(1);
    }
}
