class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {
            if (s.matches(".*[a-z].*") || s.matches(".*[A-Z].*")) {
                answer = false;
            } else if (!s.matches(".*[0-9].*")) {
                answer = false;
            }
        } else {
            answer = false;
        }

        return answer;
    }
}