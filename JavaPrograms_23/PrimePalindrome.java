public class PrimePalindrome {
    public boolean isPrime(int n) {
        int f = 0;
        boolean isPr = false;
        for(int i = 1; i<=n; i++) {
            if(n%i == 0) {
                f+=1;
            }
        }
        if(f>=3) {
            return isPr = false;
        }
        else 
            return isPr = true;
    }
    public boolean isPalindrome(int n) {
        int nn = n;
        int r = 0, s = 0;
        boolean isPa = false;
        while(n>0) {
            r=n%10;
            n/=10;
            s = (s*10)+r;
        }
        if(nn == s) {
            return isPa = true;
        }
        else {
            return isPa = false;
        }
    }
    public static void main() {
        PrimePalindrome obj = new PrimePalindrome();
        for(int i = 10; i<=100; i++) {
            if(obj.isPrime(i) && obj.isPalindrome(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println(obj.isPrime(727));
    }
}