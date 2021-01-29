package org.launchcode.java.technology.main;

import java.sql.Date;

public class Program {

    public static void main(String[] args){
        Computer testComputer = new Computer("HP", "Inspiron", "DualCore");

        Date purchaseDate = new Date(2020, 1, 20);
        Laptop testLaptop = new Laptop("HP", "Pavilion", "QuadCore", 15.6, "Domonique", purchaseDate);
        SmartPhone testSmartPhone = new SmartPhone("Apple", "iPhone", "IOS", "T-Mobile", false, true);
    }
}
