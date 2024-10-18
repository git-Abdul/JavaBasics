public class Ascending {
    public static void main(int n) {
        int r=0, s=0, nn=n;
        for(int i = 0; i<=9; i++) {
            while(n>0) {
                r=n%10;
                if(i == r) {
                    System.out.print(i+" ");
                }
                n/=10;
            }
        }
    }
}