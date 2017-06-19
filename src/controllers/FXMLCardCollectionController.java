
package controllers;

import localstorage.CharacterInformation;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import localstorage.GeneralInformation;
import scenes.ChangeScene;

/**
 * FXML Controller class
 *
 * @author mohini
 */
public class FXMLCardCollectionController implements Initializable {

    @FXML
    private Button displayCards;

    @FXML
    private MenuButton sortCards;

    @FXML
    private MenuButton showCards;

    @FXML
    private ListView<String> characterList;
    
    private final CharacterInformation characterInfo = new CharacterInformation();
    private final GeneralInformation generalInfo = new GeneralInformation();
    private final ChangeScene cs = new ChangeScene();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //population of the listview
        ObservableList<String> deceases = FXCollections.observableArrayList();
        for (String listItems : characterInfo.characters) {
            deceases.add(listItems);
            System.out.println(listItems);
        }
        characterList.setItems(deceases);
        
        //population of sort list menu button
        sortCards.getItems().addAll(
            FXCollections.observableArrayList(
                new MenuItem(generalInfo.sortCards[0]), 
                new MenuItem(generalInfo.sortCards[1]), 
                new MenuItem(generalInfo.sortCards[2])
            )
        );
        
        //population of show cards menu button
        showCards.getItems().addAll(
            FXCollections.observableArrayList(
                new MenuItem(generalInfo.showCards[0]), 
                new MenuItem(generalInfo.showCards[1])
            )
        );
        
    }

    @FXML
    public void sortCards(ActionEvent event) {
//        cs.change(event, cs.lobby);
    }

    @FXML
    public void showCards(ActionEvent event) {
//        cs.change(event, cs.lobby);
    }

    @FXML
    public void displayCards(ActionEvent event) {
//        cs.change(event, cs.lobby);
    }

    @FXML
    public void back(ActionEvent event) {
        cs.change(event, cs.lobby);
    }

}
