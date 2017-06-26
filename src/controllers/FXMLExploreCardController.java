
package controllers;

import characters.LoadCharacter;
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
    private final LoadCharacter loadCharacter = new LoadCharacter();
    
//    public String chosenCharacter;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        loadCharacter.getCharacterInfo(chosenCharacter);
    }    
    
    @FXML
    private void back(ActionEvent event){
        cs.change(event, cs.cardCollection);
    }
    
}
