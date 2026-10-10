
import java.util.Scanner;

abstract class Parcel {
    double weight, declaredValue;

    Parcel(double weight, double declaredValue) {
        this.weight = weight;
        this.declaredValue = declaredValue;
    }

    abstract double calculateCharge();

    double calculateInsurance() {
        return 0;
    }
}

class StandardParcel extends Parcel {
    StandardParcel(double w, double v) {
        super(w, v);
    }

    double calculateCharge() {
        return 40 + 10 * weight;
    }
}

class ExpressParcel extends Parcel {
    ExpressParcel(double w, double v) {
        super(w, v);
    }

    double calculateCharge() {
        return 80 + 15 * weight;
    }

    double calculateInsurance() {
        return 0.02 * declaredValue;
    }
}

class FragileParcel extends Parcel {
    FragileParcel(double w, double v) {
        super(w, v);
    }

    double calculateCharge() {
        return 40 + 10 * weight + 50;
    }

    double calculateInsurance() {
        return 0.02 * declaredValue;
    }
}

public class ParcelShippingDesk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double grandTotal = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            double weight = sc.nextDouble();
            double value = sc.nextDouble();

            Parcel p;

            switch (type) {
                case "STANDARD":
                    p = new StandardParcel(weight, value);
                    break;
                case "EXPRESS":
                    p = new ExpressParcel(weight, value);
                    break;
                case "FRAGILE":
                    p = new FragileParcel(weight, value);
                    break;
                default:
                    System.out.println("Invalid parcel type");
                    sc.close();
                    return;
            }

            double charge = p.calculateCharge();
            double insurance = p.calculateInsurance();
            double total = charge + insurance;

            System.out.printf(
                "%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",
                type, charge, insurance, total
            );

            grandTotal += total;
        }

        System.out.printf("Grand Total: %.2f%n", grandTotal);
        sc.close();
    }
}
