import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = array.length;
        
        Arrays.sort(array);
        
        answer = array[answer / 2];
        
        return answer;
    }
}