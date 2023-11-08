import java.util.*;
class EmployeePay {
    public static void main() {
        Scanner pay = new Scanner(System.in);
        System.out.println("Enter employee's basic salary:");
        double basic,da,hra,pf,gp=0,np=0;
        basic = pay.nextInt();
        da=basic*30.0/100.0;
        hra=basic*20.0/100.0;
        pf=basic*12.0/100.0;
        gp=basic+da+hra;
        np=gp-pf;
        System.out.println("Gross pay: Rs."+gp);
        System.out.println("Provident Fund: Rs."+pf);
        System.out.println("Net pay: Rs."+np);
    }
}