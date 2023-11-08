public class swap
{
    public static void main()
    {
        String st="Bangalore"; 
        String st1="Mumbai";
        st=st.concat(st1);
        st1=st.substring(0,(st.length()-st1.length()));
        st=st.substring(st1.length());
        System.out.println(st);
        System.out.println(st1);
    }
}