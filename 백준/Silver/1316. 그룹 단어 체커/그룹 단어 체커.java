import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (group(sc.next())) {
                count++;
            }
        }

        System.out.println(count);
    }


    public static boolean group(String s) {
        boolean[] check = new boolean[26];
        int prev = 0;

        for (int i = 0; i < s.length(); i++) {
            int now = s.charAt(i);

            if (prev != now) {
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    prev = now;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }

        return true;
    }
}