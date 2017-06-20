
package scenes;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
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
    public String cardCollection = "CardCollection";
    public String options = "Options";
    public String instructions = "Instructions";
    public String friends = "Friends";
    public String playground = "Playground";
    public String exploreCard = "ExploreCard";
    
    // change scene from buttons
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
    
    // change scene from listitem
    public void change(MouseEvent event, String destination) {        
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
    
    
    //change scene from menuitem
    //not possible to use at the moment since the menuitem uses actionevents, while not being part of the node class
    public void change(MenuItem item, String destination) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXML" + destination + ".fxml"));
            Scene scene = new Scene(root);
            Stage appStage = (Stage) root.getScene().getWindow();
            appStage.setScene(scene);
            appStage.show();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }  
}
