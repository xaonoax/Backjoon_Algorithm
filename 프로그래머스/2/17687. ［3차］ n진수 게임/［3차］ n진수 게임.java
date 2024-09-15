class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String tmp = "";

        for (int i = 0; tmp.length() < t * m; i++) {
            tmp += Integer.toString(i, n);
        }

        for (int i = p - 1; answer.length() < t; i += m) {
            answer += tmp.charAt(i);
        }

        return answer.toUpperCase();
    }
}