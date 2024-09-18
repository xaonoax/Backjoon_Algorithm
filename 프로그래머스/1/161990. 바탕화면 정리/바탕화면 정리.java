class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int minRow = wallpaper[0].length();
        int minCol = wallpaper.length;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[0].length(); j++) {
                int row = j;
                int col = i;

                if (wallpaper[i].charAt(j) == '#') {
                    if (minRow > row) {
                        minRow = row;
                    }
                    if (minCol > col) {
                        minCol = col;
                    }
                    if (maxRow < row) {
                        maxRow = row;
                    }
                    if (maxCol < col) {
                        maxCol = col;
                    }
                }
            }
        }

        return new int[] {minCol, minRow, maxCol + 1, maxRow + 1};
    }
}