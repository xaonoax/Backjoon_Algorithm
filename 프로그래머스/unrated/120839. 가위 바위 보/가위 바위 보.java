class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] c = rsp.toCharArray();

        for(int i=0; i<rsp.length(); i++) {
            if(c[i] == '0') {
                c[i] = '5';
            }
            else if(c[i] == '2') {
                c[i] = '0';
            }
            else if(c[i] == '5') {
                c[i] = '2';
            }
            answer += c[i];
        }
        return answer;
    }
}