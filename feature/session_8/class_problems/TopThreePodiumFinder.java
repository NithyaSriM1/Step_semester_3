
package oop.class_problems;

import java.util.Arrays;

public class TopThreePodiumFinder {
    public static void main(String[] args) {
        int[] scores = {85, 96, 78, 92, 88};

        Arrays.sort(scores);

        System.out.println("First Place: " + scores[scores.length - 1]);
        System.out.println("Second Place: " + scores[scores.length - 2]);
        System.out.println("Third Place: " + scores[scores.length - 3]);
    }
}
