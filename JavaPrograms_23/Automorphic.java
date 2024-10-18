import java.util.*;
public class Automorphic {
   public static void main(int n) {
       int nn = n*n;
       String s = Integer.toString(nn);
       int l = (s.length())-1;
       int pr = nn/((int)Math.pow(10,l));
       int real = nn - (pr*((int)Math.pow(10,l)));
       if(real == n)
           System.out.println("Amstrong");
       else
           System.out.println("U will fail");
   }
}
