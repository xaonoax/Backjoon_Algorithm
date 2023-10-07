class Solution {
    public int solution(int n) {
        int result = 0;
        
        for(int i=0; i<=n; i+=2) {
            if(i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }
}