
package controllers;

import characters.LoadCharacter;
import localstorage.CharacterInformation;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import localstorage.GeneralInformation;
import scenes.ChangeScene;

/**
 * FXML Controller class
 *
 * @author mohini
 */
public class FXMLCardCollectionController implements Initializable {
    
    private final CharacterInformation characterInfo = new CharacterInformation();
    private final GeneralInformation generalInfo = new GeneralInformation();
    private final LoadCharacter loadCharacter = new LoadCharacter();
    private final ChangeScene cs = new ChangeScene();
    
    @FXML
    private Button displayCards;
    @FXML
    private MenuButton sortCards;
    @FXML
    private MenuButton showCards;

    @FXML
    private ListView<String> characterList;
    
    @FXML
    private MenuItem sortCardsItem1;
    @FXML
    private MenuItem sortCardsItem2;
    @FXML
    private MenuItem sortCardsItem3;
    @FXML
    private MenuItem sortCardsItem4;
    @FXML
    private MenuItem sortCardsItem5;
    @FXML
    private MenuItem sortCardsItem6;
    
    @FXML
    private MenuItem showCardsItem1;
    @FXML
    private MenuItem showCardsItem2;
    @FXML
    private MenuItem showCardsItem3;
    @FXML
    private MenuItem showCardsItem4;
    @FXML
    private MenuItem showCardsItem5;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //population of the listview
        ObservableList<String> deceases = FXCollections.observableArrayList();
        for (String listItems : characterInfo.getCharacterNames()) {
            deceases.add(listItems);
            System.out.println(listItems);
        }
        characterList.setItems(deceases);
        
        //if one of the items is clicked by the mouse in the list of deceases, 
        //a new view with the specific decease will show up
        characterList.setOnMouseClicked((MouseEvent event) -> {
            System.out.println("Chosen decease: " + characterList.getSelectionModel().getSelectedItem());
            loadCharacter.setCharacterToShow(characterList.getSelectionModel().getSelectedItem());
            cs.change(event, cs.exploreCard);
        });
        
        //population of sort list menu button
        sortCards.getItems().addAll(
                FXCollections.observableArrayList(
                    sortCardsItem1 = new MenuItem(generalInfo.getSortCards()[0]),
                    sortCardsItem2 = new MenuItem(generalInfo.getSortCards()[1]),
                    sortCardsItem3 = new MenuItem(generalInfo.getSortCards()[2]),
                    sortCardsItem4 = new MenuItem(generalInfo.getSortCards()[3]),
                    sortCardsItem5 = new MenuItem(generalInfo.getSortCards()[4]),
                    sortCardsItem6 = new MenuItem(generalInfo.getSortCards()[5])
                )
        );
        
        //sort by name
        //duplicate for each sortCards item, and use the menubutton where the item is used
        sortCardsItem1.setOnAction((ActionEvent event) -> {
            System.out.println("sortcardsitem1 has fired");
            sortCards.setText("Sorted: " + generalInfo.getSortCards()[0]);
        });
        
        sortCardsItem2.setOnAction((ActionEvent event) -> {
            System.out.println("sortcardsitem2 has fired");
            sortCards.setText("Sorted: " + generalInfo.getSortCards()[1]);
        });
        
        sortCardsItem3.setOnAction((ActionEvent event) -> {
            System.out.println("sortcardsitem3 has fired");
            sortCards.setText("Sorted: " + generalInfo.getSortCards()[2]);
        });
        
        sortCardsItem4.setOnAction((ActionEvent event) -> {
            System.out.println("sortcardsitem4 has fired");
            sortCards.setText("Sorted: " + generalInfo.getSortCards()[3]);
        });
        
        sortCardsItem5.setOnAction((ActionEvent event) -> {
            System.out.println("sortcardsitem5 has fired");
            sortCards.setText("Sorted: " + generalInfo.getSortCards()[4]);
        });
        
        sortCardsItem6.setOnAction((ActionEvent event) -> {
            System.out.println("sortcardsitem6 has fired");
            sortCards.setText("Sorted: " + generalInfo.getSortCards()[5]);
        });

        //population of show cards menu button
        showCards.getItems().addAll(
                FXCollections.observableArrayList(
                    showCardsItem1 = new MenuItem(generalInfo.getShowCards()[0]), 
                    showCardsItem2 = new MenuItem(generalInfo.getShowCards()[1]), 
                    showCardsItem3 = new MenuItem(generalInfo.getShowCards()[2]), 
                    showCardsItem4 = new MenuItem(generalInfo.getShowCards()[3]), 
                    showCardsItem5 = new MenuItem(generalInfo.getShowCards()[4])
                )
        );
        
        showCardsItem1.setOnAction((ActionEvent event) -> {
            System.out.println("showcardsitem1 has fired");
            showCards.setText("Showed: " + generalInfo.getShowCards()[0]);
        });
        
        showCardsItem2.setOnAction((ActionEvent event) -> {
            System.out.println("showcardsitem2 has fired");
            showCards.setText("Showed: " + generalInfo.getShowCards()[1]);
        });
        
        showCardsItem3.setOnAction((ActionEvent event) -> {
            System.out.println("showcardsitem3 has fired");
            showCards.setText("Showed: " + generalInfo.getShowCards()[2]);
        });
        
        showCardsItem4.setOnAction((ActionEvent event) -> {
            System.out.println("showcardsitem4 has fired");
            showCards.setText("Showed: " + generalInfo.getShowCards()[3]);
        });
        
        showCardsItem5.setOnAction((ActionEvent event) -> {
            System.out.println("showcardsitem5 has fired");
            showCards.setText("Showed: " + generalInfo.getShowCards()[4]);
        });
        
    }

    @FXML
    public void displayCards(ActionEvent event) {
        System.out.println("currently unused");
    }

    @FXML
    public void back(ActionEvent event) {
        cs.change(event, cs.lobby);
    }

}
