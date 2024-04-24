class Solution {
    public int solution(String t, String p) {
        long num = Long.parseLong(p);
        int answer = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            String str = t.substring(i, i + p.length());
            long n = Long.parseLong(str);
            if (num >= n) {
                answer++;
            }
        }

        return answer;
    }
}