class Solution {
    public int solution(int hp) {
        int answer = 0;
        int general = 5;
        int soldier = 3;
        int ergate = 1;
        int spare = 0;

        answer += hp / general;
        spare = hp % general;

        answer += spare / soldier;
        spare = spare % soldier;

        answer += spare / ergate;
        
        return answer;
    }
}