import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String[] str = n.split("");
        Integer[] num = new Integer[str.length];

        for (int i = 0; i < str.length; i++) {
            num[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(num, Collections.reverseOrder());

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
    }
}