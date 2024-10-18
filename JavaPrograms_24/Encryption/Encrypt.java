package Encryption;
import java.util.*;
class Encrypt {
    public String EncryptSequence(String s) {
        String s1 = "";
        String s2 = "";
        int n = 0;
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isWhitespace(ch) == false) {
                s1+=ch;
            }
        }
        for(int i = 0; i<s1.length(); i++) {
            char ch = s1.charAt(i);
            if(Character.isLetter(ch) == true) {
                n = (int)ch+5;
                char ch2 = (char)n;
                s2+=ch2;
            }
            else if(Character.isDigit(ch) == true) {
                n = (int)ch+1;
                char ch2 = (char)n;
                s2+=ch2;
            }
            else if(Character.isWhitespace(ch) == true) {
                char ch2 = '-';
                s2+=ch2;
            }
            else if(ch == 'z') {
                char ch2 = 'a';
                s2+=ch2;
            }
            else {
                s2+=ch;
            }
        }
        return s2;
    }
    public String DecryptSequence(String s) {
        String s1 = "";
        String s2 = "";
        int n = 0;
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLetter(ch) == true) {
                n = (int)ch-5;
                char ch2 = (char)n;
                s2+=ch2;
            }
            else if(Character.isDigit(ch) == true) {
                n = (int)ch-1;
                char ch2 = (char)n;
                s2+=ch2;
            }
            else if(ch == '-') {
                char ch2 = ' ';
                s2+=ch2;
            }
            else if(ch == 'a') {
                char ch2 = 'z';
                s2+=ch2;
            }
            else {
                s2+=ch;
            }
        }
        return s2;
    }
    public static void main() {
        Encrypt start = new Encrypt();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word: ");
        System.out.println("Information depicted in the form: (Encrypted word, Decrypted word)");
        for(int i = 1; i<=100; i++) {
            String input = sc.nextLine();
            if(input.equals("end")) {
                System.out.println("Program terminated.");
                break;
            }
            String encrypt = start.EncryptSequence(input);
            String decrypt = start.DecryptSequence(input);
            System.out.println(input+": "+"("+encrypt+", "+decrypt+")");
        }
    }
}