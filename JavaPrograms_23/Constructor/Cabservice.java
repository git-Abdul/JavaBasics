package Constructor;
import java.util.*;
class Cabservice {
    String taxino;
    String name;
    int d, amt;
    Cabservice() {
        taxino = "0";
        name = "";
        d=0;
    }
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter taxino, name, distance");
        taxino = sc.nextLine();
        name = sc.nextLine();
        d = sc.nextInt();
    }
    void calculate() {
        if(d<=1) {
            amt = 25*d;
        }
        else if(d>1 && d<=5) {
            amt = 25+(30*d);
        }
        else if(d>5 && d<=10) {
            amt = 25+ 30*5 + (d*35);
        }
        else if(d>10 && d<=20) {
            amt = 25+ 30*5 + 10*35 + (d*40);
        }
        else if(d>20) {
            amt =  25+ 30*5 + 35*10 + 40*20 + (d*45);
        }
    }
    void display() {
        System.out.println("Taxino\t\tName\t\tDistance\t\tBill");
        System.out.println("********\t\t********\t\t********\t\t********\t\t********");
        System.out.println(taxino+"\t\t"+name+"\t\t"+d+"\t\t"+amt);
    }
    public static void main() {
        Cabservice obj = new Cabservice();
        obj.input();
        obj.calculate();
        obj.display();
    }
}