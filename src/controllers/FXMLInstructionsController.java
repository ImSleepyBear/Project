
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
    private MenuItem showInstructionsItem1;
    @FXML
    private MenuItem showInstructionsItem2;
    @FXML
    private MenuItem showInstructionsItem3;
    
    @FXML
    public void back(ActionEvent event) {
        cs.change(event, cs.lobby);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        showInstructions.getItems().addAll(
            FXCollections.observableArrayList(
                showInstructionsItem1 = new MenuItem(generalInfo.getShowInstructions()[0]),
                showInstructionsItem2 = new MenuItem(generalInfo.getShowInstructions()[1]),
                showInstructionsItem3 = new MenuItem(generalInfo.getShowInstructions()[2])
            )
        );
        
        showInstructionsItem1.setOnAction((ActionEvent event) -> {
            System.out.println("showinstructionsitem1 has fired");
            showInstructions.setText("Showed instructions: " + generalInfo.getShowInstructions()[0]);
            showAccurateInstructions(1);
        });
        
        showInstructionsItem2.setOnAction((ActionEvent event) -> {
            System.out.println("showinstructionsitem2 has fired");
            showInstructions.setText("Showed instructions: " + generalInfo.getShowInstructions()[1]);
            showAccurateInstructions(2);
        });
        
        showInstructionsItem3.setOnAction((ActionEvent event) -> {
            System.out.println("showinstructionsitem3 has fired");
            showInstructions.setText("Showed instructions: " + generalInfo.getShowInstructions()[2]);
            showAccurateInstructions(3);
        });
        
    }
    
    private void showAccurateInstructions(int instructions){
        System.out.println("instructions are determined by a number");
        System.out.println("currently chose number is: " + instructions);
    }
    
}
