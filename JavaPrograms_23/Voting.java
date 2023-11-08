import java.util.*;
public class Voting {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();       
        System.out.println("==========================================================================================");
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        if(age >= 18) {
            System.out.println("Eligibility: Eligible");
            boolean eligible = true;
        }
        else {
            System.out.println("Eligibility: Not eligible");
        }
        System.out.println("==========================================================================================");
    }
}