import java.util.* ; 
import java.io.*;
public class scGreatest
{
    public static void main()
    {
        System.out.print('\u000C');
        Scanner num  = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter Number:");
        a = num.nextInt();
        System.out.println("Enter Number 2:");
        b = num.nextInt();
        System.out.println("Enter Number 3:");
        c = num.nextInt();
        if((a>b)&&(a>c))
        System.out.println(a+" is greatest");
        else if((b>a)&&(b>c))
        System.out.println(b+" is greatest");
        else
        System.out.println(c+" is greatest");
    }
}
    