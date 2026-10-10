package oop.assignment_problems;

public class MatchDayGridAnalyzer {

    static void analyzeMatches(int[][] scores, int threshold) {
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;

            for (int score : scores[i]) {
                sum += score;
            }

            double average = (double) sum / scores[i].length;

            if (average >= threshold) {
                System.out.println("Match " + i + ": Power Surge");
            } else {
                System.out.println("Match " + i + ": Normal");
            }
        }
    }

    public static void main(String[] args) {
        int[][] scores = {
            {4, 6, 8},
            {10, 12, 14},
            {2, 3, 1}
        };

        analyzeMatches(scores, 8);
    }
}