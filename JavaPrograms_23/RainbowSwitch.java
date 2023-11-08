import java.util.*;
public class RainbowSwitch {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a color: ");
        String color = sc.nextLine();
        
        switch(color) {
            case "Violet": System.out.println("It is a rainbow color"); break;
            case "Indigo": System.out.println("It is a rainbow color"); break;
            case "Blue": System.out.println("It is a rainbow color"); break;
            case "Green": System.out.println("It is a rainbow color"); break;
            case "Yellow": System.out.println("It is a rainbow color"); break;
            case "Orange": System.out.println("It is a rainbow color"); break;
            case "Red": System.out.println("It is a rainbow color"); break;
        }
    }
}