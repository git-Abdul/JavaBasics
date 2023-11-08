import java.util.*;
public class ageCalc
{
    public static void main()
    {
        int y;
        Scanner age = new Scanner(System.in);
        System.out.println("Input Date of Birth:");
        y = age.nextInt();
        int a = 2023-y;
        System.out.println("Age of individual: "+a);
        if (a>110)
            System.out.println("You are probably dead");
        else if (a<5)
            System.out.println("Why are u here?");
        else if (a<=0)
            System.out.println("Newborn ah?");
    }
}