import java.util.Scanner;

class Testing {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String s = "BLUEJ";
        int l = s.length();
        int a = 0, l1 = 1;
        for(int i = 0; i<l; i++) {
            if(a == 5) {
                break;
            }
            if(l1 == 5) {
                break;
            }
            System.out.print(s.substring(a));
            if(i>=1) {
                System.out.print(s.substring(0, l1));
                l1++;
            }
            a++;
            System.out.println();
        }
    }
}
