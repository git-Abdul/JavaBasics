import java.util.*;
public class Students {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of boys: ");
        int b = sc.nextInt();
        
        System.out.println("Enter number of girls: ");
        int g = sc.nextInt();
        
        System.out.println("Enter number of boys absent: ");
        int ba = sc.nextInt();
        
        System.out.println("Enter number of girls absent: ");
        int ga = sc.nextInt();

        int gp = g-ga;
        int bp = b-ba;
        int ts = b+g;
        
        int bper = (bp*100)/ts;
        int gper = (gp*100)/ts;
        
        System.out.println("=============================================================================================================================");
        System.out.println("Percent of boys: "+bper+"%");
        System.out.println("Percent of girls: "+gper+"%");
        System.out.println("=============================================================================================================================");
    }
}