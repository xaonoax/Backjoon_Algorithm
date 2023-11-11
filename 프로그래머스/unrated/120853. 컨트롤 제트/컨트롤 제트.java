class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] s2 = s.split(" ");

        for(int i=0; i<s2.length; i++) {
            if(s2[i].equals("Z")) {
                answer -= Integer.valueOf(s2[i - 1]);
                continue;
            }
            answer += Integer.valueOf(s2[i]);
        }

        return answer;
    }
}