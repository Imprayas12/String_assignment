import java.util.Scanner;

public class bigstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int m = Math.max(a.length(),b.length());
        StringBuffer s1 = new StringBuffer();
        for (int i = 0; i <= m-1; i++) {
            if(i<=a.length()-1)
            s1.append(a.charAt(i));
            s1.append(b.charAt(i));
        }
        System.out.println(s1);
    }
}
