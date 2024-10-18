public class ICSE {
    public static void main() {
        String s = "ICSE";
        for(int i = 1; i<=4; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(s.charAt(j-1)+" ");
            }
            System.out.println();
        }
    }
}