class Solution {
    public int solution(int order) {
        int answer = 0;
        String num = String.valueOf(order);

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);

            if (c == '3' || c == '6' || c == '9') {
                answer++;
            }
        }

        return answer;
    }
}