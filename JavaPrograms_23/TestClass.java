import java.util.*;
public class TestClass {
   public static void main() {
        Scanner sc = new Scanner(System.in);
        // Accepting single character from scannner class: 
        System.out.println("Enter a character: ");
        char a = sc.next().charAt(0);
        // Changing into uppercase character: 
        char aUpper = Character.toUpperCase(a);
        System.out.println("Character: "+a);
        System.out.println("Uppercase: "+ aUpper);
    }
}