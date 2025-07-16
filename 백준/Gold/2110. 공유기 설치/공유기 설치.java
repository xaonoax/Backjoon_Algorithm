import java.io.*;
import java.util.*;

public class Main {
    public static int[] house;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        house = new int[n];

        for (int i = 0; i < n; i++) {
            house[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(house);

        int min = 1;
        int mox = house[n - 1] - house[0] + 1;

        while (min < mox) {
            int mid = (mox + min) / 2;

            if (canInstall(mid) < m) {
                mox = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min - 1);
    }

    public static int canInstall(int distance) {
        int count = 1;
        int lastLocate = house[0];

        for(int i = 1; i < house.length; i++) {
            int locate = house[i];

            if(locate - lastLocate >= distance) {
                count++;
                lastLocate = locate;
            }
        }
        
        return count;
    }
}