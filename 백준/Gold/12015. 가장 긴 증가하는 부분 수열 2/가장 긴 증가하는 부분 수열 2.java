import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] seq = new int[n];
        int[] lis = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        lis[0] = seq[0];

        int lengthOflis = 1;

        for (int i = 1; i < n; i++) {
            int key = seq[i];

            if (lis[lengthOflis - 1] < key) {
                lengthOflis++;
                lis[lengthOflis - 1] = key;
            } else {
                int low = 0;
                int height = lengthOflis;

                while (low < height) {
                    int mid = (low + height) >>> 1;

                    if (lis[mid] < key) {
                        low = mid + 1;
                    } else {
                        height = mid;
                    }

                }

                lis[low] = key;
            }
        }

        System.out.println(lengthOflis);
    }
}