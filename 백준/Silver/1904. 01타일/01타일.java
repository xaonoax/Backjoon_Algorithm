import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        System.out.println(Tile(n));
    }

    public static int Tile(int a) {
        if (a == 1) {
            return 1;
        }
        if (a == 2) {
            return 2;
        }
        
        int val1 = 1;
        int val2 = 2;
        int sum = 0;

        for (int i = 2; i < a; i++) {
            sum = (val2 + val1) % 15746;
            val1 = val2;
            val2 = sum;
        }

        return sum;
    }
}