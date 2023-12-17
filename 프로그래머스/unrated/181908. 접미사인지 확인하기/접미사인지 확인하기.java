class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;

        for (int i=my_string.length(); i>0; i--) {
            if (is_suffix.equals(my_string.substring(my_string.length() - i))) {
                answer = 1;
                break;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}