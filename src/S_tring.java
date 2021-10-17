import java.util.Scanner;

public class S_tring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int i=0;
        int j = s1.length()-1;
        int f=0;
        while(i<j){
            if(s1.charAt(i)!=s1.charAt(j)) {
                System.out.println("Not palindrome");
                f=1;
                break;
            }
            i++;
            j--;
        }
        if(f==0)
            System.out.println("Palindrome");
    }
}
