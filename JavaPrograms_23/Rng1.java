import java.util.*;
public class Rng1
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number-");
        int n = in.nextInt();
        int Randomnumber = ((int)(Math.random()*n)+1);
        System.out.println(Randomnumber);
    }
}