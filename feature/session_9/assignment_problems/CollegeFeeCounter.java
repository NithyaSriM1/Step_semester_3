
import java.util.Scanner;

abstract class StudentFee {
    abstract double calculateFee();
}

class DayScholar extends StudentFee {
    double calculateFee() {
        return 40000 + 12000;
    }
}

class Hosteller extends StudentFee {
    double calculateFee() {
        return 40000 + 60000;
    }
}

class Scholar extends StudentFee {
    double calculateFee() {
        return 20000 + 12000;
    }
}

public class CollegeFeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String type = sc.next().toUpperCase();

            StudentFee student;

            switch (type) {
                case "DAY_SCHOLAR":
                    student = new DayScholar();
                    break;
                case "HOSTELLER":
                    student = new Hosteller();
                    break;
                case "SCHOLAR":
                    student = new Scholar();
                    break;
                default:
                    System.out.println("Invalid student type");
                    sc.close();
                    return;
            }

            double fee = student.calculateFee();

            System.out.printf("%s: %.2f%n", name, fee);
            total += fee;
        }

        System.out.printf("Total Collected: %.2f%n", total);
        sc.close();
    }
}
