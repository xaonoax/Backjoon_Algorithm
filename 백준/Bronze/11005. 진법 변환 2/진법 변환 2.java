import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int tmp = 0;
        String answer = "";

        while (n > 0) {
            tmp = n % b;
            if (tmp >= 10) {
                char c = (char) (tmp + 55);
                answer += c;
            } else {
                answer += tmp;
            }

            n = n / b;
        }

        for (int i = answer.length() - 1; i >= 0; i--) {
            System.out.print(answer.charAt(i));
        }
    }
}