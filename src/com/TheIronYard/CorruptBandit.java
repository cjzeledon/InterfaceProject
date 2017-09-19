package com.TheIronYard;

public class CorruptBandit extends Soldier {
    public CorruptBandit() {
        this.name = "Sergio Illescas";
        this.rank = "Officer";
        this.branch = "United States Marine";
        this.isAlive = true;
        this.HP = 500;
    }

    @Override
    // speak() is an abstract method from an Soldier (an abstract class)
    public String speak() {
        return "Semper Fi!";
    }

    @Override
    // hasWeapon() is a method signature of the Interface Weapon
    public boolean hasWeapon() {
        return false;
    }

    @Override
    // walk() is a non-abstract method called in from Soldier (which is an abstract class)
    public String walk() {
        return super.walk();
    }

    @Override
    // canFight is a method signature of the Interface Weapon
    public boolean canFight() {
        return true;
    }

    @Override
    // ammo is a method signature of the Interface Weapon
    public int ammo() {
        return 0;
    }

    @Override
    public String weaponType() {
        return "Hand-to-Hand Combat";
    }
}
