
package oop.class_problems;

public class HackathonSeatingGridOptimizer {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;

        int[][] seats = new int[rows][columns];
        int count = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = count++;
            }
        }

        System.out.println("Hackathon Seating Grid:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(seats[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
