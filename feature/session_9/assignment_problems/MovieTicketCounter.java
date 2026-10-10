
import java.util.Scanner;

abstract class Ticket {
    int count;

    Ticket(int count) {
        this.count = count;
    }

    abstract double calculateAmount();
}

class Regular extends Ticket {
    Regular(int count) {
        super(count);
    }

    @Override
    double calculateAmount() {
        return count * (150 + 20);
    }
}

class Premium extends Ticket {
    Premium(int count) {
        super(count);
    }

    @Override
    double calculateAmount() {
        return count * (250 + 20);
    }
}

class Recliner extends Ticket {
    Recliner(int count) {
        super(count);
    }

    @Override
    double calculateAmount() {
        return count * (400 + 20);
    }
}

public class MovieTicketCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            int count = sc.nextInt();

            Ticket ticket;

            switch (type) {
                case "REGULAR":
                    ticket = new Regular(count);
                    break;

                case "PREMIUM":
                    ticket = new Premium(count);
                    break;

                case "RECLINER":
                    ticket = new Recliner(count);
                    break;

                default:
                    System.out.println("Invalid ticket type");
                    sc.close();
                    return;
            }

            double amount = ticket.calculateAmount();

            System.out.printf("%s: %.2f%n", type, amount);

            total += amount;
        }

        System.out.printf("Total: %.2f%n", total);

        sc.close();
    }
}
