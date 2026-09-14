package classesandobjects.practice_problems;

public class PalindromeChecker {
    public static void checkPalindrome(int number) {
        int origNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        boolean isPalindrome = (origNumber == reversedNumber);
        System.out.println("Is the number " + origNumber + " a Palindrome? " + isPalindrome);
    }

    public static void main(String[] args) {
        checkPalindrome(121);
    }
}