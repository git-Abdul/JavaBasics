package Iteration;
class Prime {
    public static void main(int n) {
        int f = 0;
        for (int i = 1; i<=n; i++) {
            if (n%i == 0) {
                f++;
            }
        }
        if (f>2) {
            System.out.println("Not Prime");
        }
        else {
            System.out.println("Prime");
        }
    }
}