import java.util.*;
public class Marks { 
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Name");
        String name =  sc.nextLine();
        System.out.println("Input Math Marks");
        int m =  sc.nextInt();
        System.out.println("Input Physics Marks");
        int p =  sc.nextInt();
        System.out.println("Input Chemistry Marks");
        int c =  sc.nextInt();
        System.out.println("Input Biology Marks");
        int b =  sc.nextInt();
        int sum = p+c+m+b;
        double percent = (sum*100)/160;
        double avg = sum/4;
        System.out.println(":========================================================================================:");
        System.out.println("Name: "+name);
        System.out.println("Total percent: "+percent+"%");
        System.out.println("Average: "+avg);
        System.out.println(":========================================================================================:");
    }
}