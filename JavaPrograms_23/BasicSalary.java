import java.util.*;
public class BasicSalary {
    public static void main (){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter your basic salary: ");
        double s = sc.nextDouble();
        
        double da = (5*s)/100;
        double hra = (15*s)/100;
        double pf = (8.33*s)/100;
        double net = s+hra+da;
        double gross = net-pf;
        
        System.out.println("Employee: "+name);
        System.out.println("Basic Salary: "+s);
        System.out.println("Net Pay: "+net);
         System.out.println("Gross: "+gross);
    }
}