/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import characters.CharacterInformation;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
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
    
    private characters.CharacterInformation characterInfo = new CharacterInformation();
    private ChangeScene cs = new ChangeScene();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

//        try{
        ObservableList<String> items = FXCollections.observableArrayList();
        for (String listItems : characterInfo.characters) {
            items.add(listItems);
            System.out.println(listItems);
        }
        
        characterList.setItems(items);
//        } catch (Exception e){
//            System.out.println("exception in loading listitems");
//            e.printStackTrace();
//        }
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
