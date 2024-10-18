import java.util.*;
class Testing2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length(), l2=l;
        int b = 65;
        int range = 74-65;
        int k = l;
        for(int i = 0; i<=l; i++) {
            System.out.print(s.substring(0,k));
            k--;
            System.out.println();
        }
    }
}