package org.launchcode.java.studios.areaofacircle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence: ");

        String sentence = input.nextLine();

        /*
        String name = "If the product of two terms is zero then common " +
                "sense says at least one of the two terms has to be zero to " +
                "start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored " +
                "allowing that side of the equation to equal zero. Once you’ve " +
                "done that, it’s pretty straightforward from there.";

         */

        //Convert a string to an array of chars
        char[] charactersInString = sentence.toLowerCase().toCharArray();

        //Setup an empty hashmap to hold keys and values
        HashMap<Character, Integer> characterCount = new HashMap<>();

        //Loop through each character in the array using a for each loop
        for (char character : charactersInString) {

            if (!Character.isLetter(character)) {
                continue;
            } else
            //Check to see if the hashmap already contains the key
            if (characterCount.containsKey(character)) {
                //Access the key and add one to the value
                characterCount.put(character, characterCount.get(character) + 1);
            } else {
                //Create a new key and initialize a value of 1
                characterCount.put(character, 1);
            }
        }

        //Use a for each loop to access each key value pair in the hashmap
        for (Map.Entry<Character, Integer> key : characterCount.entrySet()) {
            //Print the key and value of each pair in the hashmap
            System.out.println(key.getKey() + ": " + key.getValue());
            }
        }

    }
