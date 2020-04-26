package exercises.class2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListItemLength {

    public static void getLength (ArrayList<String> words, int length) {
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        words.add("happy");
        words.add("black");
        words.add("brown");
        words.add("Elmo");
        words.add("chair");

        System.out.println("Enter a length: ");
        int length = input.nextInt();

        getLength(words, length);
    }
}
