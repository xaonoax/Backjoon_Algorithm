class Solution {
    public String solution(int[] food) {
        String answer = "";

        for (int i = 0; i < food.length; i++) {
            if (food[i] != 1) {
                for (int j = 0; j < food[i] / 2; j++) {
                    answer += String.valueOf(i);
                }
            }
        }

        answer += "0";

        for (int i = answer.length() - 2; i >= 0; i--) {
            char c = answer.charAt(i);
            answer += Character.toString(c);
        }

        return answer;
    }
}