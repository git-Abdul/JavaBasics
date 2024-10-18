package Iteration;
class Ams {
    public static void main(int n) {
        String s = Integer.toString(n);
        int l = s.length();
        int i;
        int r;
        int nn = n;
        int sum = 0;
        while(n > 0) {
            r=n%10;
            n/=10;
            sum+=(int)Math.pow(r,l);
        }
        if (sum == n) {
            System.out.println("Ams");
        }
    }
}