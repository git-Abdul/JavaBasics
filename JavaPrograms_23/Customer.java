import java.util.*;
public class Customer {
    public static void main() {
        Customer calculate = new Customer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter card number: ");
        long num = sc.nextLong();
        System.out.println("Enter card amount: ");
        int amt = sc.nextInt();
        System.out.println("Enter card type: 1.Silver 2.Gold 3.Platinum: ");
        int op = sc.nextInt();
        calculate.CardCalculation(name, num, amt, op);
    }
    public void CardCalculation(String name, long num, int amt, int op) {
        double discount = 0.0;
        double dp = 0.0;
        String type = "";
        switch(op) {
            case 1: discount = 0.02; type = "Silver"; break;
            case 2: discount = 0.05; type = "Gold"; break;
            case 3: discount = 0.08; type = "Platinum"; break;
            default: System.out.println("Enter valid number");
        }
        dp = amt-(amt*discount);
        System.out.println("Customer name: "+name);
        System.out.println("Customer card type: "+type);
        System.out.println("Customer card number: "+num);
        System.out.println("Customer card amount: "+amt);
        System.out.println("Discounted amount: "+dp);
    }
}