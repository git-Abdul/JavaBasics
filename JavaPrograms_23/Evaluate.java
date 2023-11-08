public class Evaluate {
    public static void main() {
        // Evaluate these expressions: 
        int b; b = 12;
        b -= 2*b++ + ++b/3+2*b--;
        
        int a = 7;
        a+= a++ + --a + a++ % 2+a;
        
        int x; int y; x =3; y= 8;
        x *= ++y/2+x++ + --y%2 + 2*5/2;
        
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("x= "+x);
    }
}