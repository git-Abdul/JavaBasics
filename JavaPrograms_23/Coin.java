public class Coin {
    public static void main() {
        int i;
        System.out.println("Heads: 0 | Tails: 1");
        System.out.println("");
        for (i=1; i<=10; i++) {
            int x = (int)(Math.random()*2);
            System.out.println("Coin tossed: "+x);
        }
    }
}