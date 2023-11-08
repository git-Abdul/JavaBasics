public class Discount
{
    public static void main(int c)
    {
        if(c<2000)
        {
            double a = (5/100.0)*c;
            System.out.println("5% is the discount");
            System.out.println(c-a+" is the amount");
        }
        else if((c>=2001)&&(c<=5000))
        {
            double a = (10/100.0)*c;
            System.out.println("10% is the discount");
            System.out.println(c-a+" is the amount");
        }
        else if((c>5001)&&(c<=10000))
        {
            double a = (15/100.0)*c;
            System.out.println("15% is the discount");
            System.out.println(c-a+" is the amount");
        }
        else
        {
            double a = (20/100.0)*c;
            System.out.println("20% is the discount");
            System.out.println(c-a+" is the amount");
        }
    }
}