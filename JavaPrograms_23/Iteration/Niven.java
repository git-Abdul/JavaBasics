package Iteration;
class Niven {
    public static void main(int n) {
        int sum = 0;
        int nn = n;
        while (n>0) {
            int r=n%10;
            n/=10;
            sum+=r;
        }
        if (sum%nn == 0) {
            System.out.println("Niven");
        }
        else {
            System.out.println("Not Niven");
        }
    }
}