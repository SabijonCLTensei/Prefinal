/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamecharacterweapons;

/**
 *
 * @author User
 */
public abstract class Character {
    public String name;
    public int level;
    public int health;
    public Weapon weapon;

    public Character(String name, int level, int health, Weapon weapon) {
        this.name = name;
        this.level = 1;
        this.health = health;
        this.weapon = weapon;
    }


    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
    public abstract String attack();
    public abstract String defend();

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", \nlevel=" + level + ", \nhealth=" + health + ", \nweapon=" + weapon + '}';
    }
    
    
}
