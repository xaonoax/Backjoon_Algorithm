import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }

        int x = Integer.valueOf(br.readLine());

        System.out.println(count(n, arr, x));
    }

    public static int count(int n, int[] arr, int x) {
        int result = 0;
        int sum = 0;
        int lt = 0;
        int rt = n - 1;

        Arrays.sort(arr);

        while (lt < rt) {
            sum = arr[rt] + arr[lt];

            if (sum == x) {
                result++;
            }
            if (sum < x) {
                lt++;
            } else {
                rt--;
            }
        }
        
        return result;
    }
}