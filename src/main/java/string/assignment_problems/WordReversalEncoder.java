package string.assignment_problems;

import java.util.Scanner;

public class WordReversalEncoder {

    public static String reverseWords(String text) {

        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            result.append(words[i]);

            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        System.out.println("Reversed: " + reverseWords(text));

        sc.close();
    }
}