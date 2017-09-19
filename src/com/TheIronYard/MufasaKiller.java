package com.TheIronYard;

// This Rambo class (a non-abstract class) works with the use of inheritance from Soldier class which so happens to be an abstract class
// All the abstract methods that are in the Soldier class (an abstract class) will all need to be override
// Keep in mind that there are some methods in the Soldier class that do NOT need to be override because they are NOT set as abstract methods
// That Solider class also implements from the Weapon interface
// Therefore, Rambo MUST use the methods from the Weapon interface
public class MufasaKiller extends Soldier{
    public MufasaKiller() {
        this.name = "Rambo The Mufasa-Killer";
        this.rank = "Army Specialist";
        this.branch = "United States Army";
        this.isAlive = true;
        this.HP = 200;
    }

    @Override
    // speak() is an abstract method from an Soldier
    public String speak() {
        return "To survive a war, you gotta become war.";
    }

    @Override
    // hasWeapon() is a method signature of the Interface Weapon
    public boolean hasWeapon() {
        return true;
    }

    @Override
    // canFight is a method signature of the Interface Weapon
    public boolean canFight() {
        return true;
    }

    @Override
    // ammo() is a method signature of the Interface Weapon
    public int ammo() {
        return 45;
    }

    @Override
    // sleep() is an abstract method of the Soldier (which is an abstract class)
    // When using sleep(), it must ALWAYS be override in order to use it
    public String sleep() {
        return "I don't sleep. I create war.";
    }

    @Override
    // weaponType() is a default method created in Version 3.0
    // It implements from Weapon Interface
    public String weaponType() {
        return "M16A2";
    }

    @Override
    public String eat() {
        return "I don't eat. I survive on the power of the Sun.";
    }

    Bomb shoot = new Bomb() {
//        public Bomb shootGun() {
//            return null;
//        }

    };

}
