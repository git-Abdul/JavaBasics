public class time
{
    public static void main(int time)
    {
        int hrs=time/3600;
        int rs=time%3600;
        int mins=rs/60;
        int rsec=rs%60;
        System.out.println("Hours = " + hrs);
        System.out.println("Minutes = " + mins);
        System.out.println("Seconds = " + rsec);
    }
}