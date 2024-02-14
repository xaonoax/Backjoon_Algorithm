class Solution {
    public String solution(String code) {
        String[] str = code.split("");
        int i = 0;
        int idx = 0;
        String answer = "";

        while (i < str.length) {
            if (!str[i].equals("1")) {
                idx++;
                if (idx % 2 != 0) {
                    answer += str[i];
                }
            }
            i++;
        }

        if (answer.equals("")) {
            answer = "EMPTY";
        }

        return answer;
    }
}