class Solution {
    public String solution(int age) {
        String answer = "";
        
        while (age > 0) {
            int a = age % 10;
            char al = (char) ('a' + a);
            answer = al + answer;
            age /= 10;
        }
        
        return answer;
    }
}