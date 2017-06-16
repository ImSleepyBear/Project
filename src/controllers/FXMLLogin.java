
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import scenes.ChangeScene;

/**
 *
 * @author Mohini
 */
public class FXMLLogin implements Initializable {
    
    @FXML
    private TextField txtField_username;
    
    @FXML
    private TextField txtField_password;
    
    private final ChangeScene cs = new ChangeScene();
    
    @FXML
    private void login(ActionEvent event) {
        cs.change(event, cs.lobby);
    }
    
    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }
    
    @FXML
    private void signUp(ActionEvent event) {
        cs.change(event, cs.signup);
    }
    
    @FXML
    private void recoverCredentials(ActionEvent event) {
        cs.change(event, cs.recover);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
