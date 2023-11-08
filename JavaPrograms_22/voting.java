import java.util.*;
public class voting 
{
    public static void main()
    {
        int a;
        int vote;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Name: ");
        String name = sc.nextLine();
        System.out.println("Input age: ");
        a = sc.nextInt();
        if ((a>=18) && (a<60))
        {
            System.out.println("Active voter");
            System.out.println(":=======================================================================:");
        }
        if ((a>=60) && (a<80))
        {
            System.out.println("Passive voter");
            System.out.println(":=======================================================================:");
        }   
        if (a>80)
        {
            System.out.println("Senior Citizen");
            System.out.println(":=======================================================================:");
        }
        if (a>=18)
        {
            System.out.println("Name: "+name);
            System.out.println("Eligible for voting");
            System.out.println("1 = Congress, 2 = BJP, 3 = AAP");
            System.out.println(":=======================================================================:");
            System.out.println("Cast your vote:");
            vote = sc.nextInt();
            if (vote == 1)
            {
                System.out.println(":=======================================================================:");
                System.out.println("You voted for Congress!");
            }
            else if (vote == 2)
            {
                System.out.println(":=======================================================================:");
                System.out.println("You voted for BJP!");
            }
            else if (vote == 3)
            {
                System.out.println(":=======================================================================:");
                System.out.println("You voted for AAP!");
            }
            else 
            {
                System.out.println(":=======================================================================:");
                System.out.println("Choose a valid party to vote.");
            }
        }
        if (a<18) {
            System.out.println("Name: "+name);
            System.out.println("Not eligible for voting");
        }
    }
}
        