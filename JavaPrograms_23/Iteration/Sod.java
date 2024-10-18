package Iteration;
class Sod {
    public static void main(int n) {
        int r;
        int sum = 0;
        while(n > 0) {
            r=n%10;
            n/=10;
            sum+=r;
        }
        System.out.println(sum);
    }
}