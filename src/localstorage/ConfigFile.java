
package localstorage;

import java.io.File;

/**
 *
 * @author Mohini
 */

/*
 * allows the user to store its preferences between game session, 
 * which in this is options that should be applied all game sessions from
 * the moment a change is made
 */

public class ConfigFile {
    
    // what preferences to save, regards sound
    
    private final File configFile = new File("Config.cfg"); //direction
    private final int configSize = 8;
    
    public void createConfigFile(){
        
    }
    
    public void saveToConfigFile(){
        
    }
    
    public void readFromConfigFile(){
        
    }
    
}
