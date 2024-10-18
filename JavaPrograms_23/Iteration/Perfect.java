package Iteration;
class Perfect {
    public static void main(int n) {
        int nn = n;
        int r;
        int i;
        int pr = 1;
        int sum = 0;
        boolean Perfect;
        while(n>0) {
            r=n%10;
            n/=10;
            for(i=1; i<=r; i++) {
                pr*=i;
            }
            System.out.println(pr);
            sum+=pr;
            pr=1;
        }
        if(sum == nn) {
            Perfect = true;
        }
        else {
            Perfect = false;
        }
        System.out.println(Perfect);
    }
}