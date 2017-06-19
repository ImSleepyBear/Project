
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import localstorage.GeneralInformation;
import scenes.ChangeScene;

/**
 * FXML Controller class
 *
 * @author mohini
 */
public class FXMLInstructionsController implements Initializable {
    
    private final GeneralInformation generalInfo = new GeneralInformation();
    private final ChangeScene cs = new ChangeScene();
   
    @FXML
    private MenuButton showInstructions;
    
    @FXML
    public void back(ActionEvent event) {
        cs.change(event, cs.lobby);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showInstructions.getItems().addAll(
            FXCollections.observableArrayList(
                new MenuItem(generalInfo.showInstructions[0]),
                new MenuItem(generalInfo.showInstructions[1]),
                new MenuItem(generalInfo.showInstructions[2])
            )
        );
    }    
    
    @FXML
    private void showInstructions(){
        
    }
    
}
