class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int num = 1;

        for (int i = 0; i < section.length; i++) {
            if (num <= section[i]) {
                answer += 1;
                num = section[i] + m;
            }
        }

        return answer;
    }
}