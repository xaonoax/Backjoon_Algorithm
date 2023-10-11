class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        for(int i=0; i<1; i++) {
            for(int j=1; j<2; j++) {
                if(dot[i] > 0 && 0 < dot[j]) {
                    answer = 1;
                }
                else if(dot[i] < 0 && 0 < dot[j]) {
                    answer = 2;
                }
                else if(dot[i] < 0 && 0 > dot[j]) {
                    answer = 3;
                }
                else {
                    answer = 4;
                }
            }
        }
        return answer;
    }
}