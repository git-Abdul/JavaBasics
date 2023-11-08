public class fruitpercent
{
    public static void main(int f, int a)
    {
        /* int f = no of fruits*/
        /* int a = no of apples*/
        
        int o = f-a;
        double poo = (o*100)/f;
        double poa = (a*100)/f;
        System.out.println("no. of fruits= "+f);
        System.out.println("no of apples= "+a);
        System.out.println("no of oranges= "+o);
        System.out.println("% of apples= "+poa+"%");
        System.out.println("% of oranges= "+poo+"%");
        System.out.println("*=====================*");
    }
}