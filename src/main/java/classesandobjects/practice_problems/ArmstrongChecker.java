package classesandobjects.practice_problems;

public class ArmstrongChecker {
    public static void checkArmstrong(int number) {
        int original = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        boolean isArmstrong = (sum == original);
        System.out.println("Is the number " + original + " an Armstrong number? " + isArmstrong);
    }

    public static void main(String[] args) {
        checkArmstrong(153);
    }
}