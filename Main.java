/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamecharacterweapons;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon(54, 50, "SWORD");
        Warrior wa = new Warrior(86, "anrco", 100);
        wa.setName("narco");
        wa.setArmor_strength(89);
        wa.setHealth(100);
        wa.setLevel(7);
        wa.setWeapon(sword);
        wa.attack();
        wa.defend();
        System.out.println(wa.toString());
        
        System.out.println("_____________________________");
        
        Weapon fireball = new Weapon(54, 50, "fireball");
        Mage ma = new Mage(86, "halo", 100);
        ma.setName("hola");
        ma.setMana(89);
        ma.setHealth(100);
        ma.setLevel(7);
        ma.setWeapon(fireball);
        ma.attack();
        ma.defend();
        System.out.println(ma.toString());
        
        
    }
}
