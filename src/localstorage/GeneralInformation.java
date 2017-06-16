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
    public String[] options = {
        "Options", "Log Out", "Exit"
    };

    public String[] sortCards = {
        "By name", "By power", "By health"
    };
    
    public String[] showCards = {
        "Collected cards", "All cards"
    };
    
    public String[] showInstructions = {
        "How to play", "How the cards work", "The layout of the cards"
    };
    
    public String[] getOptions() {
        return options;
    }

    public String[] getSortCards() {
        return sortCards;
    }

    public String[] getShowCards() {
        return showCards;
    }
}
