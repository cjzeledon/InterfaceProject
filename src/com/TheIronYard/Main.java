package com.TheIronYard;

public class Main {

    public static void main(String[] args) {

//        // Testing to see if all the methods are called on properly
        MufasaKiller mf = new MufasaKiller();
//        System.out.println(mf.sleep());
//        System.out.println(mf.eat());
//        System.out.println(mf.name);
//        System.out.println(mf.ammo());
//        System.out.println(mf.canFight());
//        System.out.println(mf.speak());
//        System.out.println(mf.weaponType());
//        System.out.println(mf.hasWeapon());
//
//        // Testing to see if all the methods are called on properly
        CorruptBandit cb = new CorruptBandit();
//        System.out.println(cb.sleep());
//        System.out.println(cb.eat());
//        System.out.println(cb.name);
//        System.out.println(cb.ammo());
//        System.out.println(cb.canFight());
//        System.out.println(cb.speak());
//        System.out.println(cb.hasWeapon());
//        System.out.println(cb.weaponType());

    }

    /*
    In main create a class that extends Soldier and implements the new interface. Call the method that returns a
    Bomb and write the console the String return by the toString method.

    Question: Why is this necessary to write another class inside the Main file?
              I thought it was good practice to have one class per file for readability.
    */

    public class KaPow extends Soldier implements Gun {

        @Override
        public String speak() {
            return null;
        }

        @Override
        public boolean canFight() {
            return false;
        }

        @Override
        public int ammo() {
            return 0;
        }

        @Override
        public boolean hasWeapon() {
            return false;
        }

        @Override
        public Bomb shootGun() {
            return null;
        }

        @Override
        public String weaponType() {
            return "Simple Gun";
        }
    }
}


