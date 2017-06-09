/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import scenes.ChangeScene;

/**
 * FXML Controller class
 *
 * @author Mohini
 */
public class FXMLFriendsController implements Initializable {

    @FXML
    private Button back;
    
    private ChangeScene cs = new ChangeScene();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void back(ActionEvent event){
        cs.change(event, cs.lobby);
    }
    
}
