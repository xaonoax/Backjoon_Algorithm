class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String a1 = Integer.toString(a) + Integer.toString(b);
        String a2 = Integer.toString(b) + Integer.toString(a);
        
        answer = a1.compareTo(a2);
        
        if(answer > 0) {
            answer = Integer.parseInt(a1);
        }
        else if(answer < 0) {
            answer = Integer.parseInt(a2);
        }
        else {
            answer = Integer.parseInt(a1);
        }
        
        return answer;
    }
}