import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        Arrays.sort(a);

        for (int i = 0; i < m; i++) {
            if (binarySearch(a, sc.nextInt()) >= 0) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static int binarySearch(int[] arr, int t) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (t == arr[mid]) {
                return 0;
            } else if (t < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}