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
    private Button cardCollection;

    private ChangeScene cs = new ChangeScene();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    @FXML
    public void cardCollection(ActionEvent event){
        cs.change(event, cs.collection);
    }
}
