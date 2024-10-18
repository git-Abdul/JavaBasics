import java.util.*;
public class LongestWord {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String lw = "";
        String cw = "";
        int length = input.length();    
        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if (c != ' ') {
                cw += c;  // Build the current word
            } else {
                if (cw.length() > lw.length()) {
                    lw = cw;  // Update longest word if necessary
                }
                cw = "";  // Reset current word for the next word
            }
        }
        if (cw.length() > lw.length()) {
            lw = cw;
        }
        System.out.println("Longest word: " + lw);
    }
}