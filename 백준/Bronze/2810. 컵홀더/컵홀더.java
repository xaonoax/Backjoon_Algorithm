import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = sc.next().split("");
        int count = 1;

        for (int i = 0; i < n; i++) {
            if (str[i].equals("S")) {
                count++;
            } else {
                i++;
                count++;
            }
        }

        System.out.println(n > count ? count : n);
    }
}