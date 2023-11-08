public class Dice {
    public static void main() {
        int i;
        for(i=1; i<=10; i++) {
            int x = (int)((Math.random()*6)+1);
            System.out.println("Dice rolled: "+x);
        }
    }
}