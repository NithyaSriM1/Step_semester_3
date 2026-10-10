
import java.util.Scanner;

abstract class Booking {
    double distance;
    static final double BOOKING_FEE = 50;

    Booking(double distance) {
        this.distance = distance;
    }

    abstract double calculateBaseFare();

    double calculateTotal() {
        return calculateBaseFare() + BOOKING_FEE;
    }
}

class BusBooking extends Booking {
    BusBooking(double distance) {
        super(distance);
    }

    double calculateBaseFare() {
        return distance * 2;
    }
}

class TrainBooking extends Booking {
    TrainBooking(double distance) {
        super(distance);
    }

    double calculateBaseFare() {
        return distance * 1.5;
    }
}

class FlightBooking extends Booking {
    FlightBooking(double distance) {
        super(distance);
    }

    double calculateBaseFare() {
        return 2500 + distance * 4;
    }
}

public class TravelBookingWithCommonFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String mode = sc.next();
            double distance = sc.nextDouble();

            Booking booking;

            switch (mode) {
                case "BUS":
                    booking = new BusBooking(distance);
                    break;

                case "TRAIN":
                    booking = new TrainBooking(distance);
                    break;

                default:
                    booking = new FlightBooking(distance);
            }

            System.out.printf("%s: %.2f%n",
                    mode, booking.calculateTotal());
        }

        sc.close();
    }
}
