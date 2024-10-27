import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] n = {a, b, c};

        Arrays.sort(n);

        if (n[0] + n[1] > n[2]) {
            System.out.println(a + b + c);
        } else {
            System.out.println((n[0] + n[1]) * 2 - 1);
        }
    }
}