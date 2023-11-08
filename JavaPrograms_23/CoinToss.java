import java.util.*;
public class CoinToss {
    public static void main(String args[]) {
        String winner = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: 1. Heads, 2. Tails: ");
        int c = sc.nextInt();
        int ans = (int)((Math.random()*1)+2);
        winner = (c == ans)?"You won!":"You lost ;-;";
        System.out.println("Your toss: "+c);
        System.out.println("Computer's toss: "+ans);
        System.out.println(winner);
    }
}