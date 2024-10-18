import java.util.*;
class Letters {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice");
        char ch = sc.next().charAt(0);
        switch(ch) {
            case 'F': 
                System.out.println("Enter sentence with fullstop");
                while(true) {
                    String s = sc.next();
                    char ch2 = s.charAt(0);
                    ch2=Character.toUpperCase(ch2);
                    if(ch2 != '.') {
                        System.out.println(ch2);
                    }
                    if(s.equals("."))
                        break;
                }
                break;
            case 'L': 
                System.out.println("Enter sentence with fullstop");
                while(true) {
                    String s = sc.next();
                    char ch2 = s.charAt(s.length()-1);
                    ch2=Character.toUpperCase(ch2);
                    if(ch2 != '.') {
                        System.out.println(ch2);
                    }
                    if(s.equals("."))
                        break;
                }
                break;
            default: System.out.println("Invalid choice");
        }
    }
}