import java.util.Scanner;

public class Copi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        char[] s = {s1.charAt(0),s1.charAt(1)};
        String s2 = new String(String.copyValueOf(s));
        String s3 = s2;
        for (int i = 0; i < s1.length()-1; i++) {
            s2 = s2.concat(s3);
        }
        System.out.println(s2);
    }
}
