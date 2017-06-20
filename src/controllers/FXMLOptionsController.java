
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import localstorage.ConfigFile;
import scenes.ChangeScene;

/**
 * FXML Controller class
 *
 * @author mohini
 */
public class FXMLOptionsController implements Initializable {
    
    private ChangeScene cs = new ChangeScene();
    // save windowed/fullscreen, as well as audio settings in the configfile
    private final ConfigFile config = new ConfigFile();
    
    @FXML
    private CheckBox soundOnOff;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void saveInfo(ActionEvent event){
        System.out.println("saved info");
    }
    
    @FXML
    private void back(ActionEvent event){
        cs.change(event, cs.lobby);
    }
    
}
