import java.util.*;
public class Travels {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int i,p;
        double d = 0.0, amt = 0.0;
        String name;
        for(i=1;i<=100;i++) {
            System.out.println("Enter name: ");
            name  = sc.nextLine();
            System.out.println("Enter ticket amt: ");
            p = sc.nextInt();
            if (p<25000) {
                d=p*2.0/100.0;
                p-=d;
                System.out.println("");
                System.out.println("Name: "+name);
                System.out.println("Discount %: "+2);
                System.out.println("Discount amount: "+d);
                System.out.println("Bill: "+p);
                System.out.println("==============================================");
                System.out.println("");
            }
            else if((p>25000)&&(p<=35000)) {
                d = p*10.0/100.0;
                p-=d;
                System.out.println("");
                System.out.println("Name: "+name);
                System.out.println("Discount %: "+10);
                System.out.println("Discount amount: "+d);
                System.out.println("Bill: "+p);
                System.out.println("==============================================");
                System.out.println("");
            }
            else if((p>35000)&&(p<=55000)) {
                d = p*15.0/100.0;
                p-=d;
                System.out.println("");
                System.out.println("Name: "+name);
                System.out.println("Discount %: "+15);
                System.out.println("Discount amount: "+d);
                System.out.println("Bill: "+p);
                System.out.println("==============================================");
                System.out.println("");
            }
            else if ((p>55000)&&(p<=70000)) {
                d = p*16.0/100.0;
                p-=d;
                System.out.println("");
                System.out.println("Name: "+name);
                System.out.println("Discount %: "+16);
                System.out.println("Discount amount: "+d);
                System.out.println("Bill: "+p);
                System.out.println("==============================================");
                System.out.println("");
            }
            else {
                d = p*18.0/100.0;
                p-=d;
                System.out.println("");
                System.out.println("Name: "+name);
                System.out.println("Discount %: "+18);
                System.out.println("Discount amount: "+d);
                System.out.println("Bill: "+p);
                System.out.println("==============================================");
                System.out.println("");
            }
        }
    }
}