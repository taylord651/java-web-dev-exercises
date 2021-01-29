package Test;

import java.util.Scanner;

public class QuizQuestion {
    public static void main(String[] args) {

        System.out.println("Are you a space cadet? yes or no");
        Scanner in = new Scanner(System.in);
        String response = in.next();

        switch (response) {
            case "yes":
                System.out.println("Greetings cadet.");
            case "no":
                System.out.println("Greetings normie.");
            case "maybe":
                System.out.println("Maybe it prints this");
            default:
                System.out.println("Are you an alien?");
        }
    }
}