
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
