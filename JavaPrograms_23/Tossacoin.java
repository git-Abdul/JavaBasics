import java.util.*;
public class Tossacoin
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Coin Toss:");
        System.out.println("Enter 1 for heads and 0 for tails-");
        int bet= in.nextInt();
        
        System.out.println("Results of Coin Toss-");
        int result = (int)(Math.random()*2);
        
        System.out.println(result);
        
        if (bet==result)
        {
            System.out.println("Win");
        }
        else
        {
            System.out.println("Lose");
        }
    }
}