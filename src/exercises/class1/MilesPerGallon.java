package exercises.class1;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?:");

        int miles = input.nextInt();

        System.out.println("How many gallons of gas have you consumed?:");

        int gallons = input.nextInt();

        int milesPerGallon = miles/gallons;

        System.out.println("Miles per gallon: " + milesPerGallon);

    }
}
