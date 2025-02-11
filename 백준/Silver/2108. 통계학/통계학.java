import java.util.*;

public class Main {
    public static long[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[8001];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int mid = 10000;
        int mod = 10000;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            sum += num;
            arr[num + 4000]++;

            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }

        int count = 0;
        int mod_max = 0;
        boolean flag = false;

        for (int i = min + 4000; i <= max + 4000; i++) {
            if (arr[i] > 0) {
                if (count < (n + 1) / 2) {
                    count += arr[i];
                    mid = i - 4000;
                }
                if (mod_max < arr[i]) {
                    mod_max = arr[i];
                    mod = i - 4000;
                    flag = true;
                } else if (mod_max == arr[i] && flag == true) {
                    mod = i - 4000;
                    flag = false;
                }
            }
        }

        System.out.println((int) Math.round((double) sum / n));
        System.out.println(mid);
        System.out.println(mod);
        System.out.println(max - min);
    }
}