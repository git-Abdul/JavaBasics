import java.util.*;
class Piglatin {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u') {
                System.out.print(s.substring(i, s.length()));
                for(int j = 0; j<i; j++) {
                    System.out.print(s.charAt(j));
                }
                System.out.print("ay");
                System.exit(0);
            }
        }
    }
}