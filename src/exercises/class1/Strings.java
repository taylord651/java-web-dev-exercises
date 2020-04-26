package exercises.class1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was reading, but it had " +
                "no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'\n";

        System.out.println("Enter a word: ");

        String phrase = input.nextLine();

        System.out.println("Index: " + sentence.indexOf(phrase));
        System.out.println("Length: " + phrase.length());

        sentence = sentence.replace(phrase, "");

        System.out.println(sentence);

    }
}
