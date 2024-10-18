package Iteration;
class Pattern3 {
     public static void main() {
         int i, j, k, s, sp=1, x = 1, y = 5, z = 5;
         for(i = 1; i<=5; i++) {
            x = 1;
            for(j=5; j>=i; j--) {
                System.out.print(x+" ");
                x++;
            }
            for(s=0; s<=sp; s++) {
                System.out.print(" ");
            }
            for(k=5; k>=i; k--) {
                System.out.print(y+" ");
                y--;
            }
            y=z;
            z--;
            sp=sp+4;
            y-=1;
            System.out.println();
         }
     }
}