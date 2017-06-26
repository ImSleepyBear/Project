
package controllers;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        //use this code if there's a wepage for signing up available
//        try {
//            Desktop.getDesktop().browse(new URI(null));
//        } catch (IOException ex) {
//            Logger.getLogger(FXMLLogin.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (URISyntaxException ex) {
//            Logger.getLogger(FXMLLogin.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
    @FXML
    private void recoverCredentials(ActionEvent event) {
        cs.change(event, cs.recover);
        
        //use this code if there's a webpage for recovering credentials available
//        try {
//            Desktop.getDesktop().browse(new URI(null));
//        } catch (IOException ex) {
//            Logger.getLogger(FXMLLogin.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (URISyntaxException ex) {
//            Logger.getLogger(FXMLLogin.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
