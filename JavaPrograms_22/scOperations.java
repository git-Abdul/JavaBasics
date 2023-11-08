import java.util.* ; 
public class scOperations
{
    public static void main()
    {
        Scanner scan  = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter Number:");
        a = scan.nextInt();
        System.out.println("Enter Number 2:");
        b = scan.nextInt();
        System.out.println("=========================================================================================================================");
        System.out.println("Available operations: 'add = 1', 'sub = 2', 'mult = 3', 'div = 4', 'root = 5', 'square = 6'");
        System.out.println("Enter operation to be performed:");
        c = scan.nextInt();  
        if(c==1)
        System.out.println("Sum: "+a+b);
        else if(c==2)
        System.out.println("Difference: "+(a-b));
        else if(c==3)
        System.out.println("Product: "+a*b);
        else if(c==4) 
        {
            double quo = a/b;
            System.out.println("Quotient: "+quo); 
        }
        else if(c==5)
        {
            double r1 = Math.sqrt(a);
            double r2 = Math.sqrt(b);
            System.out.println("Root1: "+r1);
            System.out.println("Root2: "+r2);
        }
        else if(c==6)
        {
            double s1 = a*a;
            double s2 = b*b;
            System.out.println("Square1: "+s1);
            System.out.println("Square2: "+s2);
        }
        else
        System.out.println("Enter valid operation: 'add = 1', 'sub = 2', 'mult = 3', 'div = 4', 'root = 5', 'square = 6'");
    }
}
    