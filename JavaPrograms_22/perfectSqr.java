import java.util.* ;
public class perfectSqr
{
    public static void main()
    {
        int a;
        Scanner num  = new Scanner(System.in);
        System.out.println("Enter Number:");
        a = num.nextInt();
        double s = Math.sqrt(a);
        int i = (int)s;
        if ((i*i)== a)
        {
            System.out.println("Perfect Sqare");
        } 
        else
        {
            System.out.println("Non perfect Sqare");
        }
    }
}