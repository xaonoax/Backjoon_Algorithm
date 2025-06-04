import java.io.*;

public class Main {
    static char[][] cArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        cArr = new char[n][n];

        star(0, 0, n, false);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(cArr[i][j]);
            }

            sb.append('\n');
        }

        System.out.print(sb);
    }

    public static void star(int x, int y, int n, boolean blank) {
        if (blank) {
            for (int i = x; i < x + n; i++) {
                for (int j = y; j < y + n; j++) {
                    cArr[i][j] = ' '; 
                }
            }
            
            return;
        }

        if (n == 1) {
            cArr[x][y] = '*';
            
            return;
        }

        int size = n / 3;
        int count = 0;

        for (int i = x; i < x + n; i += size) {
            for (int j = y; j < y + n; j += size) {
                count++;

                if (count == 5) {
                    star(i, j, size, true);
                } else {
                    star(i, j, size, false);
                } 
            }
        }
    }
}