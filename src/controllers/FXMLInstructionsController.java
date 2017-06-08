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
 * @author mohini
 */
public class FXMLInstructionsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    private ChangeScene cs = new ChangeScene();
    
    @FXML
    private Button back;
    
    @FXML
    public void back(ActionEvent event) {
        cs.change(event, cs.lobby);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
