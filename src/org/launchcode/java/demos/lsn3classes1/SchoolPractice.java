package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class SchoolPractice {
    public static void main(String[] args) {

        Student Domonique = new Student("Domonique", 1, 1, 4.0);

        Student Taylor = new Student("Taylor", 2, 1, 4.0);

        Student Yaya = new Student("Yaya", 3, 1, 4.0);

        Course Biology = new Course("Biology", 105, new ArrayList<>(List.of(Domonique, Taylor, Yaya)));

        //TODO figure out how to get the toString() method to work on objects
        /*
        Student[] rosterArray = new Student[Biology.getRoster().size()];
        System.out.println(Biology.getRoster().toArray(rosterArray));
        System.out.println(rosterArray.toString());
         */

        System.out.println(Biology.toString());
    }
}

