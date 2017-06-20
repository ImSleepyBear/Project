/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package localstorage;

/**
 *
 * @author Mohini
 */
public class GeneralInformation {

    private String[] options = {
        "Options", "Log Out", "Exit"
    };

    private String[] gameplayOptions = {
        "Resign", "Options", "Log Out", "Exit"
    };

    private String[] sortCards = {
        "By name", "By class", "By power", "By damage", "By manacost", "By rarity"
    };

    private String[] showCards = {
        "All cards", "Collected cards", "Psycologigal", "Physical", "Medpacks"
    };
    
    private String[] showInstructions = {
        "How to play", "How the cards work", "The layout of the cards"
    };
    
    public String[] getOptions() {
        return options;
    }

    public String[] getGameplayOptions() {
        return gameplayOptions;
    }

    public String[] getSortCards() {
        return sortCards;
    }

    public String[] getShowCards() {
        return showCards;
    }

    public String[] getShowInstructions() {
        return showInstructions;
    }
}
