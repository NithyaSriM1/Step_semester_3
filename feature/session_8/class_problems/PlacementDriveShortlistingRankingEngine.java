
package oop.class_problems;

public class PlacementDriveShortlistingRankingEngine {
    public static void main(String[] args) {
        String[] students = {"Anu", "Bala", "Charan", "Divya"};
        int[] scores = {85, 92, 78, 96};

        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[i] < scores[j]) {
                    int tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;

                    String tempName = students[i];
                    students[i] = students[j];
                    students[j] = tempName;
                }
            }
        }

        System.out.println("Placement Ranking:");

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i]
                    + " - " + scores[i]);
        }
    }
}
