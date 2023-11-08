public class MathFunc {
    public static void main() {
        int x=1;
        int y=1;
        double power = Math.pow(2,2);
        double min = Math.min(2,5);
        double max = Math.max(2,5);
        double abs = Math.abs(-7);
        double round = Math.round(4.3);
        double sqrt = Math.sqrt(169);
        double cbrt = Math.cbrt(512);
        double ceiling = Math.ceil(4.5);
        double floor = Math.floor(3.4);
        double exp = Math.exp(2*x) + x*y;
        
        System.out.println(power);
        System.out.println(min);
        System.out.println(max);
        System.out.println(abs);
        System.out.println(round);
        System.out.println(sqrt);
        System.out.println(cbrt);
        System.out.println(ceiling);
        System.out.println(floor);
        System.out.println(exp);
    }
}