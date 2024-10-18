package Iteration;
class Amstrong {
    public static void main(int n) {
        int nn = n;
        int sum = 0;
        String s = Integer.toString(n);
        int l = s.length();
        while(n>0) {
            int r = n%10;
            n = n/10;
            sum += (int)Math.pow(r,l); 
        }
        if (sum == nn) {
            System.out.println("Amstrong Number");
        }
        else {
            System.out.println("Normal Number");
        }
    }
}