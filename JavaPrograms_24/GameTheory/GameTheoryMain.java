/**
 * This game follows principles from the "Game Theory" by Prof Axelrod, Stanford edu.
 * There are 2 players in each game, and the rounds of the game can be edited.
 * Each player can play one of two options during its turn.
 * 1. Co-operation and 2. Deflection
 * If both players co-operate then 3 points will be added to both players.
 * If neither co-operates then 1 point will be added to both players
 * If one person co-operates then the deflecting person will get 5 points.
 */
package GameTheory;
import java.util.*;
class GameTheoryMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Strategy1 strategy1 = new Strategy1();
        System.out.println("Enter the number of rounds to be played: ");
        int n = sc.nextInt();
        sc.close();
        int i, x, y, n1 = 0, n2 = 0;
        for(i = 1; i<=n; i++) {
            x = 0; y = 0;
            x = strategy1.p1;
            switch(x) {
                case 1: System.out.println("x: Co-operative."); break;
                case 2: System.out.println("x: Deflective."); break;
            }
            y = strategy1.p2;
            switch(y) {
                case 1: System.out.println("y: Co-operative."); break;
                case 2: System.out.println("y: Deflective."); break;
            }
            if(x == y && x == 1 && y == 1) {
                n1+=3;
                n2+=3;
            }
            if(x!=y) {
                if(x == 2) {
                    n1+=5;
                }
                else {
                    n2+=5;
                }
            }
            if(x == y && x == 2 && y == 2) {
                n1+=1;
                n2+=1;
            }
        }
        if(n1>n2) {
            System.out.println("Player X won the game.");
        }
        else if(n2==n1) {
            System.out.println("Equal scores achieved.");
        }
        else {
            System.out.println("Player Y won the game.");
        }
    }
}