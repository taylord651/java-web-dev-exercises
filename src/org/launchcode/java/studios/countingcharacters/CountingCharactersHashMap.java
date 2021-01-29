package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharactersHashMap {

    //Create a main method
    public static void main(String[] args) {

            //Declare and assign values to variable
            String paragraph = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward from there.";
            HashMap<Character, Integer> letterCount = new HashMap<>();
            char[] charactersInString = paragraph.toCharArray();

            //Loop through our charactersInString array (access each character individually)
            for (Character character : charactersInString) {

                //Update/increase by 1 the character key value if it already exists in the letterCount HashMap
                if (letterCount.containsKey(character)) {
                    Integer newKey = letterCount.get(character) + 1;
                    letterCount.put(character, newKey);

                //Otherwise create a new key value pair and set the value to 1
                }else {
                    letterCount.put(character, 1);
                }
            }

            //Loop through the letterCount HashMap and print each key/value pair on a new line
            for (Map.Entry<Character ,Integer>paragraphKeyValue :letterCount.entrySet()){
                System.out.println(paragraphKeyValue.getKey() + " (" +paragraphKeyValue.getValue() + ")");
            }
        }
}
