package string.assignment_problems;

import java.util.Scanner;

public class ATM_PINLengthValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        if (pin.length() == 4 || pin.length() == 6) {
            boolean valid = true;

            for (int i = 0; i < pin.length(); i++) {
                if (!Character.isDigit(pin.charAt(i))) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                System.out.println("Valid PIN");
            } else {
                System.out.println("Invalid PIN");
            }

        } else {
            System.out.println("Invalid PIN");
        }

        sc.close();
    }
}