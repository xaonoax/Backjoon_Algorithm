import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String s = sc.next();

        for (int i = 0; i < alphabet.length; i++) {
            if (s.contains(alphabet[i])) {
                s = s.replace(alphabet[i], ".");
            }
        }

        System.out.println(s.length());
    }
}