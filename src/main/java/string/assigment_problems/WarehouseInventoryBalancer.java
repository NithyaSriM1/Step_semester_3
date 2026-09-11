package string.assigment_problems;

import java.util.Scanner;

public class WarehouseInventoryBalancer {

    public static void analyzeInventory(
            int[] sectionA, int[] sectionB) {

        int totalA = 0;
        int totalB = 0;

        for (int i = 0; i < sectionA.length; i++) {

            totalA = totalA + sectionA[i];
            totalB = totalB + sectionB[i];
        }

        String status;

        if (totalA == totalB) {
            status = "Balanced";
        } else {
            status = "Not Balanced";
        }

        int maxQuantity = sectionA[0];
        String section = "Section A";
        int index = 0;

        for (int i = 0; i < sectionA.length; i++) {

            if (sectionA[i] > maxQuantity) {

                maxQuantity = sectionA[i];
                section = "Section A";
                index = i;
            }

            if (sectionB[i] > maxQuantity) {

                maxQuantity = sectionB[i];
                section = "Section B";
                index = i;
            }
        }

        System.out.println(
                "Section A Total: " + totalA
        );

        System.out.println(
                "Section B Total: " + totalB
        );

        System.out.println(
                "Status: " + status
        );

        System.out.println(
                "Highest Quantity: "
                + maxQuantity
                + " ("
                + section
                + ", Item "
                + (index + 1)
                + ")"
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print(
                    "Section A item " + (i + 1) + ": "
            );

            sectionA[i] = sc.nextInt();

            System.out.print(
                    "Section B item " + (i + 1) + ": "
            );

            sectionB[i] = sc.nextInt();
        }

        analyzeInventory(sectionA, sectionB);

        sc.close();
    }
}