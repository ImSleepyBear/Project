/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcardgame;

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
public class ChangeScene {
    
    public String login = "LogIn";
    public String signup = "SignUp";
    public String recover = "RecoverCredentials";
    public String lobby = "Lobby";
    public String collection = "CardCollection";
    
    public void change(ActionEvent event, String destination) {        
        try {
            Parent root = FXMLLoader.load(getClass().getResource("FXML" + destination + ".fxml"));
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
