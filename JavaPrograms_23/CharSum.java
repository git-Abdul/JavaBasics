import java.util.*;
public class CharSum {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String s = "Sleeplessness";
        int l = s.length();
        char x = s.charAt(0);
        char y = s.charAt(l-1);
        int sum = (int)x+y;
        System.out.println("First letter: "+x);
        System.out.println("Last letter: "+y);
        System.out.println("Sum: "+(int)sum);
    }
}