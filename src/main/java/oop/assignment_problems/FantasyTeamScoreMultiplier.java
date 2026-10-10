package oop.assignment_problems;

import java.util.Arrays;

public class FantasyTeamScoreMultiplier {

    static double[] calculateScores(double[] scores,
                                    int captainIndex,
                                    int viceCaptainIndex) {
        double[] result = Arrays.copyOf(scores, scores.length);

        result[captainIndex] *= 2;
        result[viceCaptainIndex] *= 1.5;

        return result;
    }

    public static void main(String[] args) {
        double[] scores = {40, 55, 30, 62};

        System.out.println(Arrays.toString(
            calculateScores(scores, 1, 3)
        ));
    }
}