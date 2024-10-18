import java.util.*;
class Initials {
    public static void main() {
        Scanner sc =  new Scanner(System.in);
        String st = sc.nextLine();
        st = " "+st;
        String sn, sn2 = "";
        int p = st.lastIndexOf(" ");
        sn = st.substring(p);
        st = st.substring(0, p);
        for(int i = 0; i<st.length(); i++) {
            char ch = st.charAt(i);
            if(ch == ' ') {
                char ch1 = st.charAt(i+1);
                sn2+=ch1;
            }
        }
        System.out.println(sn2+" "+sn);
    }
}