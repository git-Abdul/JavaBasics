import java.util.*;

public class Bank {
    public static void main(String args[]) {
        double bal = 50000.0;
        int i;
        for (i = 1; i <= 100; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter action to be performed: ");
            System.out.println("'Balance', 'Deposit', 'Withdraw', 'Exit'");
            String act = sc.nextLine();

            switch (act) {
                case "Deposit":
                    System.out.println("Enter amount: ");
                    double d = sc.nextDouble();
                    bal += d;
                    break;

                case "Withdraw":
                    System.out.println("Enter amount: ");
                    double w = sc.nextDouble();
                    bal -= w;
                    break;

                case "Balance":
                    System.out.println("Balance: " + bal);
                    break;

                case "Exit":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid input!");
            }
        }
    }
}