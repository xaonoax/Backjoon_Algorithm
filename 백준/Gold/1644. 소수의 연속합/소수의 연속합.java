import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static boolean[] primes;
    static List<Integer> list;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();

        getPrime();

        int start = 0;
        int end = 0;
        int sum = 0;
        int cnt = 0;

        while (start <= end && end < list.size()) {
            if (sum < n) {
                sum += list.get(end++);
            } else {
                if (sum == n) {
                    cnt++;
                }

                sum -= list.get(start++);
            }
        }

        System.out.println(cnt);
    }

    static void getPrime() {
        primes = new boolean[n + 1];
        
        Arrays.fill(primes, true);

        primes[0] = primes[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (primes[i]) {
                list.add(i);
            }
        }
        
        list.add(0);
    }
}