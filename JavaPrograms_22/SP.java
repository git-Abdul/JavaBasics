public class SP
{
    public static void main(int c, int s)
    {
        if(s>c)
        {
            System.out.println("Gain");
            double g = (s-c)/c*100.0;
            System.out.println("Gain% = "+g);
        }
        else
        {
            System.out.println("Loss");
            double l = (c-s)/c*100.0;
            System.out.println("Loss% = "+l);
        }
    }
}