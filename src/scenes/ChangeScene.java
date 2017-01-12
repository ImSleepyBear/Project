
package scenes;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;

/**
 *
 * @author Mohini
 */

/*
 * allows the controllers to head over to other controllers, by giving the 
 * destination name.
 */

public class ChangeScene {
    
    public String login = "Login";
    public String signup = "SignUp";
    public String recover = "RecoverCredentials";
    public String lobby = "Lobby";
    public String collection = "CardCollection";
    public String options = "Options";
    public String instructions = "Instructions";
    
    public void change(ActionEvent event, String destination) {        
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/scenes/FXML" + destination + ".fxml"));
            Scene scene = new Scene(root);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();
            System.out.println("Destination: " + destination);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }  
    
//    public void change(ActionEvent event, String destination) {
//
//        try {
//            Parent root = FXMLLoader.load(getClass().getResource("FXML" + destination + ".fxml"));
//            Scene scene = new Scene(root);
//            Stage appStage = (Stage) ((MenuButton) event.getSource()).getScene().getWindow();
//            appStage.setScene(scene);
//            appStage.show();
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }  
}
