import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int total = 0;

        for (int i = 0; i < n; i++) {
            total = Math.max(total, arr[i] * (i + 1));
        }

        System.out.println(total);
    }
}