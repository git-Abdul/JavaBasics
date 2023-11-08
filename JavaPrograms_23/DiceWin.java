public class DiceWin {
    public static void main() {
        int i;
        int f;
        int p1=0;
        int p2=0;
        int n1=0;
        int n2=0;
        
        System.out.println("Player one is rolling...");
        for (i=1; i<=6; i++) {
            p1 = (int)((Math.random()*6)+1);
            System.out.println(p1);
            n1+=p1;
        }
        System.out.println("Player two is rolling...");
        for (f=1; f<=6; f++) {
            p2 = (int)((Math.random()*6)+1);
            System.out.println(p2);
            n2+=p2;
        }
        if (n1>n2)
            System.out.println("Player one wins!");
        else 
            System.out.println("Player two wins!");
    }
}