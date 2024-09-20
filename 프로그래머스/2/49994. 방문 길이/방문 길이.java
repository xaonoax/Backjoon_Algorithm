class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int dr[] = {-1, 0, 1, 0};
        int dc[] = {0, -1, 0, 1};
        int map[][] = new int[11][11];
        boolean visit[][][] = new boolean[11][11][4];
        int r = 5;
        int c = 5;

        for (int i = 0; i < dirs.length(); i++) {
            char ch = dirs.charAt(i);
            int d = 0;

            if (ch == 'U') {
                d = 0;
            }
            if (ch == 'L') {
                d = 1;
            }
            if (ch == 'D') {
                d = 2;
            }
            if (ch == 'R') {
                d = 3;
            }

            int nr = r + dr[d];
            int nc = c + dc[d];

            if (nr < 0 || nc < 0 || nr >= 11 || nc >= 11) {
                continue;
            }
            if (!visit[nr][nc][d]) {
                visit[nr][nc][d] = true;
                if ((d % 2 == 0)) {
                    d = 2 - d;
                } else {
                    d = 4 - d;
                }
                visit[r][c][d] = true;
                answer++;
            }
            
            r = nr;
            c = nc;
        }

        return answer;
    }
}