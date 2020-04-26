package exercises.class2;

import java.util.ArrayList;
import java.util.Arrays;

public class SplitStringIntoArrayList {

    public static void main(String[] args) {
        String string = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] str = string.split(" ");

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(str));

        for (String word : arrayList) {
            System.out.println(word);
        }
    }
}
