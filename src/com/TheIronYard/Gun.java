package com.TheIronYard;

/*
As the software matures interfaces will probably need to change. One way to add methods to an interface is to
extend it. Write an interface that extends one of the existing interfaces and add a method to it. Have the method
return a new Bomb class (the Bomb class should have a toString method).


You can have Interface Gun extend another Interface which is Weapon. Inside the method, a class is called on with a
new variable called shootGun. Essentially, Weapon is first, then Gun which Bomb utilizes those two interfaces. When
a new object calls on the Soldier, it should create a chain reaction that requires all the necessary methods (calling
on Weapon, Gun and Bomb that has that variable). Hopefully, I got this part right.
*/

public interface Gun extends Weapon {
    public Bomb shootGun();
}
