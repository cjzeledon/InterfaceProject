package com.TheIronYard;

/*
Write an abstract Soldier class with a few instance variables (e.g. name, rank, serialNumber). Write a few common
methods for the behavior (e.g. sleep, eat, walk) and just return a String for something meaning (e.g. "snore",
"chew", "trudge").
*/

public abstract class Soldier implements Weapon {
    protected String name;
    protected String rank;
    protected String branch;
    protected boolean isAlive;
    protected int HP;

    /*
    Write a few common methods for the behavior (e.g. sleep, eat, walk) and just return a String for something
    meaning (e.g. "snore", "chew", "trudge").
    */
    public String sleep(){
        return "ZZZZZZZZZZ!!!!!";
    }

    public String eat(){
        return "Chow Time!";
    }

    public String walk(){
        return "Left Left Left Right Left";
    }

    /*
    Write an abstract method speak which returns a String. Each class that extends the FootSoldier class will
    have to implement the method (e.g. Marines could return "oohrah", Army could return "Hooah", Navy could
    return "Hooyah", ...). All of the methods you're writing will work this way; you can think of them as sound effects
    (punch => "Blamo!" or whatever you pick).

     Within the class, there is the the abstract method speak(), a method with no body which will need to be
     implemented (filled in) by all the non-abstract classes that extend Soldier. Note that abstract classes can have
     non-abstract methods just like regular classes.
    */
    public abstract String speak();

}

