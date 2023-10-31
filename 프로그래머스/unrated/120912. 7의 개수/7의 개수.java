class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int number : array) {
            String numSt = String.valueOf(number);
            for (int i = 0; i < numSt.length(); i++) {
                if (numSt.charAt(i) == 7 + '0') {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}