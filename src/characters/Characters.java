/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters;

/**
 *
 * @author Mohini
 */
public abstract class Characters {
    
    private String[] characters = {
        "ADHD", "ADD", "ADfrican Trypanomiasis or Sleeping Sickness", "ALS or Lou Gehrig's disease", "Alsheimers",
        "American Trypanosomiasis", "Anorexia", "Asperger syndrome", "Autism", "Avian influenza or Bird Flu",
        "Bipolar", "Bubonic plague", "Cancer", "Cholera", "Chronic Obstructibe Pulmonary Disease or COPD", "Cold",
        "Coronary Artery Desease or Ischemic Heart Disease", "Cryptosporidiosis", "Damp", "Dengue Fever", "Depression",
        "Diabetes", "Dihorrea", "Downs Syndrome", "Dyslexia", "Ebola", "Emphysema", "Fever", "Gonhorrea", "Hepatitis A", 
        "Hepatitis B", "Hepatitis C", "HIV/AIDS", "Hortons headache"
    };
    
    public abstract String name();
    public abstract String characterClass();
    public abstract String characterRarity();
    public abstract boolean characterCharge();
    public abstract int characterLevel();
    public abstract int manaCost();
    public abstract int health();
    public abstract int power();
//    public abstract void ability();

    /**
     * @return the characters
     */
    public String[] getCharacters() {
        return characters;
    }
}
