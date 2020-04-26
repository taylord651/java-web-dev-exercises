package exercises.class2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringArray {

    public static void main(String[] args) {
        String phrases = "I would not, could not, " +
                "in a box. I would not, could not with " +
                "a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        int length = phrases.split(" ").length;

        String[] wordArray = new String[length];

        for (int i = 0; i < length; i++) {
            wordArray[i] = phrases.split(" ")[i];
        }

        //System.out.println(Arrays.toString(wordArray));

        int sentenceArrayLength = phrases.split("\\.").length;

        String[] sentenceArray = new String[sentenceArrayLength];

        for (int i = 0; i < sentenceArrayLength; i++) {
            sentenceArray[i] = phrases.split("\\.")[i];
        }
        System.out.println(Arrays.toString(sentenceArray));

    }
}
