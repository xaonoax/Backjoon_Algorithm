class Solution {
    static String[] board;

    public int solution(String[] board) {
        this.board = board;

        int oCnt = 0;
        int xCnt = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i].charAt(j) == 'O') {
                    oCnt++;
                } else if (board[i].charAt(j) == 'X') {
                    xCnt++;
                }
            }
        }

        if (xCnt > oCnt) {
            return 0;
        }
        if (oCnt > xCnt + 1) {
            return 0;
        }
        if (ticTacToe('O')) {
            if (oCnt == xCnt) {
                return 0;
            }
        }
        if (ticTacToe('X')) {
            if (oCnt == xCnt + 1) {
                return 0;
            }
        }
        return 1;
    }

    private static boolean ticTacToe(char c) {
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == c
                    && board[i].charAt(1) == c
                    && board[i].charAt(2) == c) {
                return true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (board[0].charAt(i) == c
                    && board[1].charAt(i) == c
                    && board[2].charAt(i) == c) {
                return true;
            }
        }

        if (board[0].charAt(0) == c
                && board[1].charAt(1) == c
                && board[2].charAt(2) == c) {
            return true;
        }
        if (board[0].charAt(2) == c
                && board[1].charAt(1) == c
                && board[2].charAt(0) == c) {
            return true;
        }

        return false;
    }
}