package classesandobjects.practice_problems;

public class PrimeChecker {
    public static void checkPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("Is the number " + number + " a Prime number? " + (isPrime && number > 1));
    }

    public static void main(String[] args) {
        checkPrime(7);
    }
}