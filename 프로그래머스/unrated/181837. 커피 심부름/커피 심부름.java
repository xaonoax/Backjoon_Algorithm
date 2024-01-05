class Solution {
    public int solution(String[] order) {
        int answer = 0;

        for (int i = 0; i < order.length; i++) {
            int price = 0;
            if (order[i].contains("americano") || order[i].contains("anything")) {
                price += 4500;
            } else if (order[i].contains("cafelatte")) {
                price += 5000;
            }
            answer += price;
        }

        return answer;
    }
}