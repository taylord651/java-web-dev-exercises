package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private int courseNumber;
    public ArrayList<Student> roster;

    public Course (String courseName, int courseNumber, ArrayList<Student> roster) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.roster = roster;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String aCourseName) {
        courseName = aCourseName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int aCourseNumber) {
        courseNumber = aCourseNumber;
    }

    public ArrayList<Student> getRoster() {
        return roster;
    }

    public void setRoster(ArrayList<Student> aRoster) {
        roster = aRoster;
    }

    public String toString() {
        return ("Course: " + courseNumber + "\n" + "Number: " + courseNumber + "\n" + "Roster: " + roster);
    }

    /*
    public Boolean equals() {
        if () {

        }

        if () {

        }

        if () {

        }

        if () {
            
        }
        return true;
    }

     */
}
