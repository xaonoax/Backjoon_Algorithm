import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] sort = new int[n];

        for (int i = 0; i < n; i++) {
            sort[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(sort);

        for (int i = 0; i < sort.length; i++) {
            sb.append(sort[i]).append('\n');
        }

        System.out.println(sb);
    }
}