package Iteration;
class DuckNumber {
    public static void main(int n) {
        int nn = n;
        int sum = 0;
        int flag = 0;
        while(n>0) {
            int r = n%10;
            n = n/10;
            if (r == 0) {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("Duck Number");
        }
        else {
            System.out.println("Normal Number");
        }
    }
}