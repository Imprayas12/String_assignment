import java.util.Scanner;

public class Concet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        StringBuilder s11 = new StringBuilder(s1);
        String s2 = sc.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.charAt(s1.length()-1)!=s2.charAt(0)) {
            System.out.println(s1+s2);
        }
        else{
            s11.deleteCharAt(s1.length()-1);
            s1 = s11.toString();
            System.out.println(s1+s2);
        }
    }
}
