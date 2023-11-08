public class classpercent
{
    public static void main(int n, int g)
    {
        /*n = no of students*/
        /*g = no of girls*/
        int b = n-g;
        double pob = (b*100)/n;
        double pog = (g*100)/n;
        System.out.println("total strength= "+n);
        System.out.println("no. Boys= "+b);
        System.out.println("no. Girls= "+g);
        System.out.println("% of Boys= "+pob+"%");
        System.out.println("% of Girls= "+pog+"%");
        System.out.println("*=======================*");
    }
}