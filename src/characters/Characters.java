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
    abstract String name();
    abstract String characterClass();
    abstract String characterRarity();
    abstract boolean characterCharge();
    abstract int characterLevel();
    abstract int manaCost();
    abstract int health();
    abstract int power();
    abstract void ability();
}