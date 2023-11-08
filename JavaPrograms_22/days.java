public class days
{
    public static void main(int days)
    {
        int y = days/365;
        int ry = days%365;
        int m = ry/30;
        int rm = ry%30;
        int rd = rm;
        
        System.out.println("years= "+y);
        System.out.println("months= "+m);
        System.out.println("remaining days= "+rd);
    }
}