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
public class CharacterInformation {
    private String[] charactersNames = {
        "ADD", "ADHD", "African Trypanomiasis or Sleeping Sickness", "ALS or Lou Gehrig's disease", "Alsheimers",
        "American Trypanosomiasis", "Anorexia", "Asperger syndrome", "Asthma", "Autism", "Avian influenza or Bird Flu",
        "Bipolar", "Bubonic plague", "Cancer", "Cholera", "Chronic Obstructibe Pulmonary Disease or COPD", "Cold",
        "Coronary Artery Desease or Ischemic Heart Disease", "Cryptosporidiosis", "Damp", "Dengue Fever", "Depression",
        "Diabetes", "Dihorrea", "Downs Syndrome", "Dyslexia", "Ebola", "Emphysema", "Fever", "Gonhorrea", "Hepatitis A", 
        "Hepatitis B", "Hepatitis C", "HIV/AIDS", "Hortons headache"
    };
    
    /**
     * @return the characters
     */
    public String[] getCharacterNames() {
        return charactersNames;
    }
}
