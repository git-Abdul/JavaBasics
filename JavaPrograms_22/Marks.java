    public class Marks
{
    public static void main(String n, int c, String s, int m1, int m2, int m3, int tm)
    {
        double p = (m1+m2+m3)*100/tm;
        int t = m1+m2+m3;
        double avg = (m1+m2+m3)/3;
        System.out.println("Title     |       Value        ");
        System.out.println("_______________________________");
        System.out.println("name      |              "+n);
        System.out.println("class     |              "+c);
        System.out.println("section   |              "+s);
        System.out.println("Marks1    |              "+m1);
        System.out.println("Marks2    |              "+m2);
        System.out.println("Marks3    |              "+m3);
        System.out.println("Total     |              "+t);
        System.out.println("Average   |              "+avg);
        System.out.println("Percent   |              "+p+"%");
    }
}