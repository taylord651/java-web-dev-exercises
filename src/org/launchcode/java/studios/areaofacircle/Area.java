package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double radius;

        do {
            System.out.println("Enter a radius: ");

            try {
                input.nextDouble();
            }
            catch (Exception e) {
                System.out.println("Radius must be numeric characters");
            }

            radius = input.nextDouble();

        } while (radius < 0.0 && radius != null);

        Double area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
