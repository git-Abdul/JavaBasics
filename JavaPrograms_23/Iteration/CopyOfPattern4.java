package Iteration;
class CopyOfPattern4 {
    public static void main() {
        int m = 1;
        for(int i=1; i<=5; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(m);
                m++;
            }
            System.out.println();
        }
    }
}
