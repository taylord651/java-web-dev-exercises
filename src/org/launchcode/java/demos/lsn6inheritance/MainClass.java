package org.launchcode.java.demos.lsn6inheritance;

public class MainClass {
    public static void main(String [] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);

        Cat suki = new HouseCat("Garfield", 12);

        //HouseCat suki1 = new Cat(12);

        //Cat testCat = new Cat(12);

        //Eat method is in the Cat class, but we can use it for a HouseCat b/c of inheritanctenc
        garfield.eat();
        System.out.println(garfield.isTired());
    }
}
