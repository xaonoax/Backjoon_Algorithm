import java.io.*;
import java.util.*;

class Tomato {
    int x;
    int y;
    int z;

    Tomato(int z, int y, int x){
        this.z = z;
        this.y = y;
        this.x = x;
    }
}

public class Main {
    static int m, n, h;
    static int[] dx = { -1, 0, 1, 0, 0, 0 };
    static int[] dy = { 0, 1, 0, -1, 0, 0 };
    static int[] dz = { 0, 0, 0, 0, 1, -1 };
    static int[][][] tomato;
    static Queue<Tomato> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        tomato = new int[h][m][n];
        queue = new LinkedList<>();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                
                for (int k = 0; k < n; k++) {
                    tomato[i][j][k] = Integer.parseInt(st.nextToken());
                    
                    if (tomato[i][j][k] == 1) {
                        queue.add(new Tomato(i, j, k));
                    }
                }
            }
        }
        
        System.out.println(bfs());
    }
    
    public static int bfs() {
        while(!queue.isEmpty()) {
            Tomato tomato = queue.remove();
            int z = tomato.z;
            int y = tomato.y;
            int x = tomato.x;

            for (int i = 0; i < 6; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nz = z + dz[i];

                if (nx >= 0 && ny >= 0 && nz >= 0 && nx < n && ny < m && nz < h) {
                    if (Main.tomato[nz][ny][nx] == 0) {
                        queue.add(new Tomato(nz, ny, nx));
                        Main.tomato[nz][ny][nx] = Main.tomato[z][y][x] + 1;
                    }
                }
            }
        }

        int result = Integer.MIN_VALUE;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    if (tomato[i][j][k] == 0) {
                        return -1;
                    }
                    
                    result = Math.max(result, tomato[i][j][k]);
                }
            }
        }

        if (result == 1) {
            return 0;
        } else {
            return result - 1;
        }
    }
}