class Solution {
    public int solution(int angle) {
        int result = 0;
        
        if(angle > 0 && 90 > angle) {
            result = 1;
        }
        
        else if(angle == 90) {
            result = 2;
        }
        
        else if(angle > 90 && 180 > angle) {
            result = 3;
        }
        
        else if(angle == 180) {
            result = 4;
        }
        
        return result;
    }
}