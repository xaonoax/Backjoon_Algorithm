class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String[] str = s.split("");

        for (int i = 0; i < str.length; i++) {
            char c = str[i].charAt(0);

            if (c == ' ') {
                answer += " ";
            } else if (c <= 'Z') {
                c += n;
                if (c > 'Z') {
                    c -= 26;
                }
                answer += c;
            } else {
                c += n;
                if (c > 'z') {
                    c -= 26;
                }
                answer += c;
            }
        }

        return answer;
    }
}