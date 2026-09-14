package classesandobjects.practice_problems;

public class GcdCalculator {
    public static void findGcd(int number1, int number2) {
        int orig1 = number1;
        int orig2 = number2;
        while (number2 != 0) {
            int remainder = number1 % number2;
            number1 = number2;
            number2 = remainder;
        }
        System.out.println("The GCD of " + orig1 + " and " + orig2 + " is " + number1);
    }

    public static void main(String[] args) {
        findGcd(24, 36);
    }
}