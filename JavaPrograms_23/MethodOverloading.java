public class MethodOverloading {
    public double series(int a, int n) {
        double s = 0.0;
        for(int i = 1; i<=n; i++) {
            s = s+((Math.pow(a,i)/i));
        }
        return s;
    }
    public double series(int n) {
        double s = 0.0;
        for(int i = 1; i<=n; i++) {
            if(i%2 == 0) {
                s-=(i/(i+1));
            }
            else {
                s+=(i/(i+1));
            }
        }
        return s;
    }
    public static void main() {
        MethodOverloading obj = new MethodOverloading();
        double x = obj.series(29, 18);
        double y = obj.series(18);
        System.out.println("Sum of first series: "+x);
        System.out.println("Sum of second series: "+y);
    }
}