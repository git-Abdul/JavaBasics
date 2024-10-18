import java.util.*;
class Anagram {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words");
        String s = sc.next().toUpperCase();
        String s2 = sc.next().toUpperCase();
        int f = 0;
        if(s.length() == s2.length()) {
            for(int i = 0; i<s.length(); i++) {
                char ch = s.charAt(i);
                for(int j = 0; j<s2.length(); j++) {
                    char ch2 = s2.charAt(j);
                    if(ch2 == ch) 
                        f++;
                }
            }
            if(f == s.length() ) {
                System.out.println("An anagram");
            }
            else {
                System.out.println("Not an anagram");
            }
        }
        else {
            System.out.println("Not an anagram");
        }
    }
}
