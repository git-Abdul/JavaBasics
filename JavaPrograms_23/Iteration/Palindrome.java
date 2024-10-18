package Iteration;
class Palindrome {
    public static void main(int n) {
        int nn = n;
        int sum = 0;
        int r;
        while(n>0) {
            r=n%10;
            n/=10;
            sum=((sum*10)+r);
        }
        if (sum == nn) {
            System.out.println("Palindrome");
        }
        else 
            System.out.println("No");
    }
}