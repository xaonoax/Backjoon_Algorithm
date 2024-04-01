class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            answer += Character.getNumericValue(c);
        }

        return answer;
    }
}