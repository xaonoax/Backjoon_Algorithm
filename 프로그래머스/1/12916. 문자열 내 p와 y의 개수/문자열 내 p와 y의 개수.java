class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;

        for (int i = 0; i < s.length(); i++) {
            String str = s.toLowerCase();
            char c = str.charAt(i);
            if (c == 'p') {
                p++;
            } else if (c == 'y') {
                y++;
            }
        }

        if (p != y) {
            answer = false;

        }

        return answer;
    }
}