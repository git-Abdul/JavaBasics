package Iteration;
class Manchusen {
    public static void main(int n) {
        int nn = n;
        int r;
        int sum = 0;
        while(n>0) {
            r=n%10;
            n/=10;
            sum+=(int)Math.pow(r,r);
        }
        if (sum == nn) {
            System.out.println("Manchusen");
        }
        else {
            System.out.println("Normal");
        }
    }
}