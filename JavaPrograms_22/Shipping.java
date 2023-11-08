import java.util.*;
public class Shipping
{
    public static void main()
    {
        Scanner obj = new Scanner(System.in);
        int w,c=0;
        System.out.println("Enter the weight of the parcel:");
        w = obj.nextInt();
        if (w <= 0)
        c = w*20;
        if ((w>10)&&(w<=30))
        c = 200+(w-10)*10;
        if ((w>30)&&(w<=50))
        c = 200+200+(w-30)*8;
        if(w>50)
        c = 200+200+160+(w-50)*5;
        System.out.println("Cost:"+c);
        System.out.println("Weight:"+w);
    }
}