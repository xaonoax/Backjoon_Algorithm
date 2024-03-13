class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        String[] str = my_string.split("");

        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];
            int idx = i;

            for (int n = j; n >= i; n--) {
                str[idx] = String.valueOf(answer.charAt(n));
                idx++;
            }
            answer = String.join("", str);

        }

        return answer;
    }
}