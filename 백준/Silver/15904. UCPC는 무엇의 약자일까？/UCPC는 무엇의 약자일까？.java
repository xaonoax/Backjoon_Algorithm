import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = {'U', 'C', 'P', 'C'};
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            if (c[index] == (s.charAt(i))) {
                index++;
            }
            if (index == 4) {
                System.out.println("I love UCPC");
                return;
            }
        }

        System.out.println("I hate UCPC");
    }
}