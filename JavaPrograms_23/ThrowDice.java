public class ThrowDice
{
    public static void main()
    {
        int i;
        for(i=1; i<=200; i++) {
            System.out.println("Throw a Dice");
        
            int result = ((int)(Math.random()*6)+1);
            System.out.println("Result of Dice Throw - ");
            System.out.println(result);
        }
    }
}