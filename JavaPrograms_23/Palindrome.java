import java.util.*;
class Palindrome {
    public String CreatePalindrome(String s) {
        String value = s;
        String s1 = "";
        String s2 = "";
        String s3 = "";
        StringBuffer ob = new StringBuffer();
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(i != 0) {
                s1+=ch;
            }
        }
        if(s.equals(s1) == false) {
            for(int i = s.length()-1; i>=0; i--) {
                char ch = s.charAt(i);
                s2+=ch;
            }
            for(int i = 0; i<s2.length(); i++) {
                char ch = s2.charAt(i);
                if(i != 0) {
                    s3+=ch;
                }
            }
            value = value.concat(s3);
            return value;
        }
        else {
            value = "Already palindrome";
            return value;
        }
    }
    public static void main() {
        Palindrome ob = new Palindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println(ob.CreatePalindrome(sc.next()));
    }
}