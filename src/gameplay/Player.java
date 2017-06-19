/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameplay;

/**
 *
 * @author mohini
 */
public class Player {
    
    private int experience = 0;
    private int experienceUntilNewLevel = 0;
    
    private int level = 0;
    
    private String availability; //online, offline, afk, in play
    
    public void levelUp(){
        experience = experience - experienceUntilNewLevel;
        level++;
    }

    public int getExperience() {
        return experience;
    }

    public int getLevel() {
        return level;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
    
    
    
}
