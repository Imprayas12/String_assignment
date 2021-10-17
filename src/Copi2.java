import java.util.Scanner;

public class Copi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = sc.next();
        StringBuffer s2 = new StringBuffer();
        for (int i = s1.length()-n,a=0; a<n; i++,a++) {
            s2.append(s1.charAt(i));
        }
        String s3 = "";
        for (int i = 0; i < n; i++) {
            s3 = s3.concat(s2.toString());
        }
        System.out.println(s3);
    }
}
