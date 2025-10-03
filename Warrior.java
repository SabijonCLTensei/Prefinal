/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamecharacterweapons;

/**
 *
 * @author User
 */
public class Warrior extends Character {
    public int armor_strength;

    public Warrior(int armor_strength, String name, int health) {
        super (name, 1, health, null);
        this.armor_strength = armor_strength;
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
        return getName() + armor_strength ;
    }

    public int getArmor_strength() {
        return armor_strength;
    }

    public void setArmor_strength(int armor_strength) {
        this.armor_strength = armor_strength;
    }


    @Override
    public String toString() {
        return "Name: " + name + "\nLevel: " + level + "\nHP: " + health + "\nWeapon: " + weapon
                + "\nWarrior{" + "armor_strength= " + armor_strength + '}' + super.toString();
    }

    
    
}
