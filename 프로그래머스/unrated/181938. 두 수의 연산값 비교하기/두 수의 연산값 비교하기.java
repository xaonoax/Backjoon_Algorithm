class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = Integer.toString(a) + Integer.toString(b);
        int a2 = 2 * a * b;
        int a3 = Integer.parseInt(a1);

        if(a2 > a3) {
            answer = a2;
        }
        else if(a2 < a3) {
            answer = a3;
        }
        else {
            answer = a2;
        }
        return answer;
    }
}