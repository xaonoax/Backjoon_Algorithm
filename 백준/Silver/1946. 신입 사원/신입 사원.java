import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int count = 1;
            int[] arr = new int[n + 1];

            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                arr[a] = b;
            }

            int num = arr[1];

            for (int j = 2; j <= n; j++) {
                if (arr[j] < num) {
                    num = arr[j];
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}