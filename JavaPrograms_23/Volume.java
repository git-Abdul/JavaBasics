import java.util.*;
public class Volume {
    public static void main() {
        int i;
        for (i = 1; i <= 100; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter shape who's volume to find out");
            System.out.println("1. Cube, 2. Cuboid, 3. Sphere");
            String shape = sc.nextLine();
            System.out.println("=======================================================");

            switch (shape) {
                case "Cube":
                    System.out.println("Enter side of cube: ");
                    int s = sc.nextInt();
                    int vc = s * s * s;
                    System.out.println("Volume of the cube: " + vc);
                    System.out.println("=======================================================");
                    break;

                case "Cuboid":
                    System.out.println("Enter length of cuboid: ");
                    int l = sc.nextInt();
                    System.out.println("Enter breadth of cuboid: ");
                    int b = sc.nextInt();
                    System.out.println("Enter height of cuboid: ");
                    int h = sc.nextInt();
                    int vcb = l * b * h;
                    System.out.println("Volume of cuboid: " + vcb);
                    System.out.println("=======================================================");
                    break;

                case "Sphere":
                    System.out.println("Enter radius of sphere: ");
                    int r = sc.nextInt();
                    double vs = (4.0 * 3.14 * r * r * r) / 3.0;
                    System.out.println("Volume of sphere: " + vs);
                    System.out.println("=======================================================");
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}