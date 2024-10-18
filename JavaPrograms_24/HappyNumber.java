class HappyNumber {
    public static void main(int n) {
        int nn = n;
        int s = 0;
        int r = 0;
        s=n;
        while(s>9) {
            n = s;
            s = 0;
            while(n>0) {
                r = n%10;
                s = s+(r*r);
                n/=10;
            }
        }
        if(s == 1) {
            System.out.println("Happy Number");
        }
    }
}