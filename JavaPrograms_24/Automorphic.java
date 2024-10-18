import java.util.*;
class Automorphic {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int x = sc.nextInt();
        int sq = x*x;
        String str= Integer.toString(sq);
        int l = str.length();
        if(sq%(Math.pow(10,l-1)) == x) {
            System.out.println("Automorphic Number");
        }
        else {
            System.out.println("Normal Number");
        }
    }
}
