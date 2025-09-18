import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = 0;
        int length = Integer.MAX_VALUE;
        int sum = 0;

        while (start <= end && end <= n) {
            if (sum >= s) {
                length = Math.min(length, end - start);
                sum -= arr[start++];
            } else if (sum < s) {
                sum += arr[end++];
            }
        }

        System.out.println(length == Integer.MAX_VALUE ? 0 : length);
    }
}