package Iteration;
import java.util.*;
class MultipleCheck {
    public static void main(int n) {
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 1; i<=10; i++) {
            System.out.println(n*i);
            System.out.println("Same number?");
            n = sc.nextInt();
        }
    }
}