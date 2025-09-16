import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] ans = new int[2];
        int x1 = 0;
        int x2 = n - 1;
        int min = Integer.MAX_VALUE;

        Arrays.sort(arr);

        while (x1 < x2) {
            int sum = arr[x1] + arr[x2];

            if (min > Math.abs(sum)) {
                min = Math.abs(sum);
                ans[0] = arr[x1];
                ans[1] = arr[x2];

                if (sum == 0) {
                    break;
                }
            }
            if (sum < 0) {
                x1++;
            } else {
                x2--;
            }
        }

        System.out.println(ans[0] + " " + ans[1]);
    }
}