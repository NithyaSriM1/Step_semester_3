
import java.util.Scanner;

abstract class Cab {
    double km;

    Cab(double km) {
        this.km = km;
    }

    abstract double calculateFare();
}

class Mini extends Cab {
    Mini(double km) {
        super(km);
    }

    double calculateFare() {
        return Math.max(100, km * 10);
    }
}

class Sedan extends Cab {
    Sedan(double km) {
        super(km);
    }

    double calculateFare() {
        return Math.max(100, km * 14);
    }
}

class SUV extends Cab {
    SUV(double km) {
        super(km);
    }

    double calculateFare() {
        return Math.max(100, km * 18);
    }
}

public class CityCabFareMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            double km = sc.nextDouble();
            String time = sc.next().toUpperCase();

            if (time.equals("NIGHT") && type.equals("MINI")) {
                System.out.println("CAB: night service not available");
                continue;
            }

            Cab cab;

            switch (type) {
                case "MINI":
                    cab = new Mini(km);
                    break;
                case "SEDAN":
                    cab = new Sedan(km);
                    break;
                case "SUV":
                    cab = new SUV(km);
                    break;
                default:
                    System.out.println("Invalid cab type");
                    continue;
            }

            double fare = cab.calculateFare();

            if (time.equals("NIGHT")) {
                fare = fare * 1.20;
            }

            System.out.printf("CAB: %.2f%n", fare);
            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
