package exercises.class2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> roster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String name;
        int id;

        do {
            System.out.println("Enter a student name: ");
            name = input.nextLine();

            if (!name.equals("")) {
                System.out.println("Enter an id number: ");
                id = input.nextInt();

                roster.put(id, name);
                input.nextLine();
            }

        } while (!name.equals(""));


        for(Map.Entry<Integer, String> student : roster.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }

                System.out.println(roster.size());

        }
}
