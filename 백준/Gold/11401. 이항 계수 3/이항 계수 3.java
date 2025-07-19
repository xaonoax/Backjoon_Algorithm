import java.io.*;
import java.util.*;

public class Main {
    final static long P = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long numer = factorial(n);
        long denom = factorial(k) * factorial(n - k) % P;

        System.out.println(numer * pow(denom, P - 2) % P);
    }

    public static long factorial(long num) {
        long facto = 1L;

        while (num > 1) {
            facto = (facto * num) % P;
            num--;
        }
        
        return facto;
    }

    public static long pow(long base, long expo) {
        long result = 1;

        while (expo > 0) {
            if (expo % 2 == 1) {
                result *= base;
                result %= P;
            }
            
            base = (base * base) % P;
            expo /= 2;
        }
        
        return result;
    }
}