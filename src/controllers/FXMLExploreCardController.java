
package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import localstorage.CharacterInformation;
import localstorage.GeneralInformation;
import scenes.ChangeScene;

/**
 * FXML Controller class
 *
 * @author Mohini
 */
public class FXMLExploreCardController implements Initializable {

    private final ChangeScene cs = new ChangeScene();
    private final CharacterInformation characterInfo = new CharacterInformation();
    private final GeneralInformation generalInfo = new GeneralInformation();
    
    public String chosenCharacter;
    
    private String characterName;
    private String characterClass;
    private String characterRarity;
    private int characterManaCost;
    private String characterAbilities;
    private String characterDescritption;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void back(ActionEvent event){
        cs.change(event, cs.cardCollection);
    }
    
}
