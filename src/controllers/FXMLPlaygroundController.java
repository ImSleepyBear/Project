
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
 * @author Mohini
 */
public class FXMLPlaygroundController implements Initializable {

    private final ChangeScene cs = new ChangeScene();
    private final GeneralInformation generalInfo = new GeneralInformation();
    
    private boolean playerTurn; //decides who's starting
    
    @FXML
    private MenuButton gameplayOptions;
    
    @FXML
    private MenuItem gameplayOptionsItem1;
    @FXML
    private MenuItem gameplayOptionsItem2;
    @FXML
    private MenuItem gameplayOptionsItem3;
    @FXML
    private MenuItem gameplayOptionsItem4;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //adds all the gameplayoptions to the menubutton
        gameplayOptions.getItems().addAll(
                FXCollections.observableArrayList(
                        gameplayOptionsItem1 = new MenuItem(generalInfo.getGameplayOptions()[0]),
                        gameplayOptionsItem2 = new MenuItem(generalInfo.getGameplayOptions()[1]),
                        gameplayOptionsItem3 = new MenuItem(generalInfo.getGameplayOptions()[2]),
                        gameplayOptionsItem4 = new MenuItem(generalInfo.getGameplayOptions()[3])
                )
        );
        
        //resigns the game to the opponent
        gameplayOptionsItem1.setOnAction((ActionEvent event) -> {
            cs.change(gameplayOptions, cs.lobby);
        });
        
        //goes to options, alternatively not available to the player from here
        gameplayOptionsItem2.setOnAction((ActionEvent event) -> {
            cs.change(gameplayOptions, cs.options);
        });
        
        //logs out from the applicaation, after resigning the game and saves whatever there is to save
        gameplayOptionsItem3.setOnAction((ActionEvent event) -> {
            cs.change(gameplayOptions, cs.login);
        });
        
        //exits the application, after resigning the game and saves whatever there is to save
        gameplayOptionsItem4.setOnAction((ActionEvent event) -> {
            System.exit(0);
        });
        
    }    
    
    @FXML
    private void back(ActionEvent event){
        cs.change(event, cs.lobby);
    }
    
}
