import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int b = sc.nextInt();
        int tmp = 1;
        int answer = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                answer += (c - 55) * tmp;
            } else {
                answer += (c - 48) * tmp;
            }

            tmp *= b;
        }

        System.out.println(answer);
    }
}