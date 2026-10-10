package oop.class_problems;

public class HackathonScoreCurveBooster {

    static int[] boostScores(int[] scores, int bonus) {
        int[] result = new int[scores.length];

        for (int i = 0; i < scores.length; i++) {
            result[i] = scores[i] + bonus;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] scores = {60, 70, 80};
        int[] result = boostScores(scores, 5);

        for (int score : result) {
            System.out.print(score + " ");
        }
    }
}