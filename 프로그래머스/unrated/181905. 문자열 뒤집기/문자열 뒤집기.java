class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0, s);
        String str = my_string.substring(s, e + 1);
        String remain = my_string.substring(e + 1, my_string.length());

        for (int i=str.length() - 1; i>=0; i--) {
            answer += str.charAt(i);
        }

        answer += remain;

        return answer;
    }
}