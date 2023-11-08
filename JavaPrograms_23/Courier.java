import java.util.*;

public class Courier {
    public static void main(String args[]) {
        double bill; String addon = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter weight of parcel: ");
        int w = sc.nextInt();
        System.out.println("Enter type of booking: ");
        String b = sc.nextLine();

        switch(b) {
            case "O": addon = "rdinary";
            
            if((w>=1)&&(w<100)) {
                bill = 90.0;
            }
            else if((w>100)&&(w<=500)) {
                bill = 150.0;
            }
            else if((w>500)&&(w<=1000)) {
                bill = 210.0;
            }
            else {
                bill = 250.0;
            }

            case "E": addon = "xpress";
            
            if((w>=1)&&(w<100)) {
                bill = 100.0;
            }
            else if((w>100)&&(w<=500)) {
                bill = 200.0;
            }
            else if((w>500)&&(w<=1000)) {
                bill = 250.0;
            }
            else {
                bill = 300.0;
            }
            System.out.println("===================================================");
            System.out.println("Name: "+name);
            System.out.println("Weight of parcel: "+w);
            System.out.println("Type of booking: "+b+addon);
            System.out.println("Bill: "+bill);
        }
    }
}
