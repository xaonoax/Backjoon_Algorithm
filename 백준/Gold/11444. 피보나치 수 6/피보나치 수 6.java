import java.io.*;

public class Main {
    public final static long MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        if(n == 1 || n == 0) {
            System.out.println(n);

            return;
        }

        n--;

        long[][] origin = {{1, 1},{1, 0}};
        long[][] a = {{1, 0},{0, 1}};

        while(n > 0) {
            if(n % 2 == 1) {
                a = multiple(a, origin);
            }

            origin = multiple(origin, origin);
            n /= 2;
        }

        System.out.println(a[0][0]);
    }

    public static long[][] multiple(long[][] ori1, long[][] ori2) {
        long[][] ret = new long[2][2];

        ret[0][0] = ((ori1[0][0] * ori2[0][0]) + (ori1[0][1] * ori2[1][0])) % MOD;
        ret[0][1] = ((ori1[0][0] * ori2[0][1]) + (ori1[0][1] * ori2[1][1])) % MOD;
        ret[1][0] = ((ori1[1][0] * ori2[0][0]) + (ori1[1][1] * ori2[1][0])) % MOD;
        ret[1][1] = ((ori1[1][0] * ori2[0][1]) + (ori1[1][1] * ori2[1][1])) % MOD;

        return ret;
    }
}