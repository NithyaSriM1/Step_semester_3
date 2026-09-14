package classesandobjects.assignment_problems;

public class NumberPrinter {
    public static void printNumbersUpToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + (i == n ? "" : " "));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printNumbersUpToN(5);
    }
}