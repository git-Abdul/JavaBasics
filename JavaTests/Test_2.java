import java.util.*;
public class Test_2 {
    public static void main(int l, int b, int r) {
        // To find area of rectangle
        int area = l*b;
        int perimeter = 2*(l+b);
        
        String str = (l>b)?"Greater is length, value: "+l:"Greater is breadth";
        System.out.println(str);
        double a = (double)(22/7.0)*(r*r);
        System.out.println(a);
    }
}