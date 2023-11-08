public class seconds
{
    public static void main(int sec)
    {
        int hr = sec/3600;
        int rhr = sec%3600;
        int min = rhr/60;
        int rmin = rhr%60;
        int rsec = rmin;
        
        System.out.println("hours= "+hr);
        System.out.println("minutes= "+min);
        System.out.println("remaining secs= "+rsec);
    }
}