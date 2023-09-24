import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int length = s.length();
        char[] c = new char[length];
        char[] rc = new char[length];

        for(int i=0; i<s.length(); i++) {
            c[i] = s.charAt(i);
        }
        for(int i=length-1; i>=0; i--) {
            rc[length-1-i] = s.charAt(i);
        }

        if (Arrays.equals(c, rc)){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}