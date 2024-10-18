package Iteration;
class PrimeDoubt1 {
    public static void main(int n) {
        int nn = n;
        int c = 0;
        for (int i = 2; i<=n; i++) {
            if (i%n == 0) {
                c+=1;
            }
        }
        if (c>1) {
            System.out.println("Normal");
        }
        else {
            System.out.println("PrimeDoubt1");
        }
    }
}
