import java.util.*;
class Overload2 {
    void display(String str, int p) {
        if(p == 1) {
            System.out.println(str.toUpperCase());
        } else if(p == 0) {
            System.out.println(str.toLowerCase());
        } else {
            System.out.println("Invalid Argument");
        }
    }

    void display(String str, char chr) {
        str = str.toLowerCase();
        if(chr == 'v') {
            for(int i = 0; i<str.length(); i++) {
                char ch = str.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println(ch);
                }
            }
        }
        else {
            for(int i = 0; i<str.length(); i++) {
                char ch = str.charAt(i);
                System.out.println(ch);
            }
        }
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        Overload2 ob = new Overload2();
        ob.display("ABDUL", 0); ob.display("ABDUL", 'v');
    }
}