import java.util.*;
public class ASCII
{
   public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an index value to check the ASCII value:");
        int index = sc.nextInt();
        System.out.println("Enter any word");
        char x = sc.next().charAt(index);
        System.out.println("ASCII = "+(int)x);
    }
}