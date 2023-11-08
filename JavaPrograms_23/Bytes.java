public class Bytes {
    public static void main (){
        int a = 360;
        int b = 240;
        int c  = 200;
        System.out.println(((a%2==0)&&(b%2==0)));
        System.out.println(((a>b)||(a>c)));
        System.out.println(!((a>b)&&(a>c)));
    }
}