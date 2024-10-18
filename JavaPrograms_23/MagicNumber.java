public class MagicNumber {
    public static void main(int n) {
        int r=0, s=0, f=0;
        int nn = n;
        while(nn > 9) {
            while(nn>0) {
                r = nn%10;
                s = s + (int)Math.pow(r,2);
                nn/=10;
            }
            nn=s;
            s=0;
        }
        if(nn==1) {
            System.out.println("Happy Number");
        }
        else {
            System.out.println("Normal Number");
        }
    }
}