package com.TheIronYard;

/*
Assignment:
The way the soldier fights is by implementing interfaces. Create a couple different interfaces with appropriate
methods for different kind of fighting. Have the methods return String.

My Note:
hasWeapon(), canFight() and ammo() are method signatures that do NOT have a body which are the ones that begins and
ends with curly brackets (i.e. { } ). When the Weapon interface is being utilized in another class, that particular
class IS required to use all the method signatures and FILL in those body. However it is used is up to the user to
define those method signatures for a particular class.

Assignment on Default Method:
What you decide to do in version 3.0 is to introduce a default method in the interface. A default method has the
keyword default at the beginning and a method body.

Go ahead and introduce a default method in an interface. Your main method should run fine without any changes. Now call
the method on a class that implements the interface.

Go ahead and override the default method in a class that implements the interface. Call the method in main.

*/

interface Weapon {
    boolean hasWeapon();
    boolean canFight();
    int ammo();

    default String weaponType(){
        return "Sniper Rifle";
    };
}
