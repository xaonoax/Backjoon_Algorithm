class Solution {
    public int solution(int price) {
        int answer = 0;

        if (500000 <= price) {
            answer = (int)(price - (price * 0.2));
        } else if (300000 <= price) {
            answer = (int)(price - (price * 0.1));
        } else if (100000 <= price){
            answer = (int)(price - (price * 0.05));
        } else {
            answer = price;
        }

        return answer;
    }
}