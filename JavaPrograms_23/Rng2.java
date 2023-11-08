import java.util.*;
public class Rng2
{ 
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i;
        System.out.println("Enter lower limit");
        int n = in.nextInt();
        System.out.println("Enter upper limit");
        int m = in.nextInt();
        int diff = m-n;
        int number = (int)(Math.random()*diff)+n;
        System.out.println(" Random number- ");
        System.out.println(number);
    }
}
//no. bw n and m, n is lower limit and m is upper limit
