package Iteration;
class Pronic {
    public static void main(int n) {
        int flag = 0;
        for (int i=1;i<=n;i++) {
            if (i*(i+1) == n){
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("Pronic");
        }
        else 
            System.out.println("Normal");
    }
}