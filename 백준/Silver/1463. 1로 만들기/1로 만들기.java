import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(recursion(n, 0));
    }

    public static int recursion(int n, int count) {
        if (n < 2) {
            return count;
        }
        
        return Math.min(recursion(n / 2, count + 1 + (n % 2)), recursion(n / 3, count + 1 + (n % 3)));
    }
}