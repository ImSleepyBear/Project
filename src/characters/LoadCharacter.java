
package characters;

import localstorage.CharacterInformation;

/**
 *
 * @author Mohini
 */
public class LoadCharacter {

    CharacterInformation characterInfo = new CharacterInformation();
    
    private ADD add = new ADD();
    private ADHD adha = new ADHD();
    
    private String chosenCharacter;
    
    public String characterName;
    public String characterClass;
    public String characterRarity;
    public int characterManaCost;
    public String characterAbilities;
    public String characterDescritption;
    
    public void setCharacterToShow(String characterName){
        this.chosenCharacter = characterName;
        System.out.println("Chosen character to show: " + characterName);
    }
    
    public void getCharacterInfo(/*String characterName*/) {
        if (chosenCharacter.equalsIgnoreCase(characterInfo.getCharacterNames()[0])) {
            characterName = add.name();
            characterClass = add.characterClass();
            characterRarity = add.characterRarity();
            characterManaCost = add.manaCost();
            characterDescritption = add.information();
            System.out.println("name: " + characterName + ", \nclass: " + characterClass + " \nrarity: " + " \nmana cost: " + " \ninfo: " + characterDescritption);
        }
        else if (characterName.equalsIgnoreCase(characterInfo.getCharacterNames()[1])) {
            
        }
        
    }

}
