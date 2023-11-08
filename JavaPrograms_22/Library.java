public class Library
{
    public static void main(int n)
    {
        if ((1<=n)&&(n<=5))
        {
            System.out.println(n*2+"rs to be paid.");
        }
        else if((n>=6)&&(n<=10))
        {
            int pay =((n-5)*5)+10;
            System.out.print(pay+"rs to be paid.");
        }
        else
        {
            int pay = ((n-10)*10)+35;
            int pay2 = pay+n*10;
            System.out.println();
        }  
    }
}