public class a5 {
    public static void main(int a) {
        int t  = a/10;
        int o = a%10;
        int sum = t+o;
        int pr = t*o;
        int num = sum+pr;
        String output;
        output = (a == num)?"Special No":"Not speacial";
        System.out.println(output);
    }
}