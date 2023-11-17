class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int square = 0;


        for (int i=0; i<num_list.length; i++) {
            multi *= num_list[i];
            square += num_list[i];
        }

        if (multi < square * square) {
            answer = 1;
        }
        else {
            answer = 0;
        }

        return answer;
    }
}