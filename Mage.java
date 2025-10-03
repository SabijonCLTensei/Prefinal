/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamecharacterweapons;

/**
 *
 * @author User
 */
public class Mage extends Character{
    public int mana;
    
    public Mage(int mana, String name, int health) {
        super (name, 1, health, null);
        this.mana = mana;
    }
    @Override
    public String attack() {
        if (getWeapon() != null){
            getName();
            getWeapon().getType();
            getWeapon().getDamage();
        }
        else{
            return getName();
        }
    return null;
    }

    @Override
    public String defend() {
    return getName() + mana ;
        
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nLevel: " + level + "\nHP: " + health + "\nWeapon: " + weapon
                + "\nMage{" + "armor_strength=" + mana + '}' + super.toString();
    }
    
    
}
