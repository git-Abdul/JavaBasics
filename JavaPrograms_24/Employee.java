import java.util.*;
class Employee {
    void Tax(String name, int s) {
        double tax = 0.0;
        if(s<=250000) {
            tax = 0.0;
        } else if(s>250000 && s<=500000) {
            tax = 0.1*s;
        } else if(s>500000 && s<=1000000) {
            tax = 30000+(0.2*s);
        } else {
            tax = 50000+(0.3*s);
        }
        System.out.println("Name: "+name);
        System.out.println("Income tax: "+tax);
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        Employee ob = new Employee();
        System.out.println("Enter name and annual income");
        String name = sc.nextLine();
        int s = sc.nextInt();
        ob.Tax(name, s);
    }
}
