class Solution {
    public String solution(String myString) {
        String answer = "";
        char c = 'l';

        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);

            if (c < ch) {
                answer += ch;
            } else {
                answer += "l";
            }
        }

        return answer;
    }
}