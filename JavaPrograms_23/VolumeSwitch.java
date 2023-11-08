import java.util.*;
public class VolumeSwitch
{ 
  public static void main() {
      int shape = 0;
      int r = 0;
      int l = 0;
      int b= 0;
      int h = 0;
      int s = 0;
         
      Scanner in = new Scanner(System.in);

      System.out.println("Enter the desired output - ");
      System.out.println("Please enter the number for the result - ");
      System.out.println("Enter 1 for sphere - ");
      System.out.println("Enter 2 for cube - ");
      System.out.println("Enter 3 for cuboid - ");
        
      shape = in.nextInt();
         
      switch(shape) {
          case 1 : System.out.println("Enter radius");
          r = in.nextInt();
          double volume = ((4*3.14*r*r*r)/3);
          System.out.println ("Volume of sphere = " + volume);
          break;
             
          case 2 : System.out.println("Enter side");
          s = in.nextInt();
          volume = s*s*s;
          System.out.println ("Volume of cube = " + volume);
          break;
             
          case 3 : System.out.print("enter lenght");
          l = in.nextInt();
          System.out.print("enter breadth");
          b = in.nextInt();
          System.out.print("enter height");
          h = in.nextInt();
          volume = l*b*h;
          System.out.println ("Volume of cuboid = " + volume);
          break;
     }
  }
}