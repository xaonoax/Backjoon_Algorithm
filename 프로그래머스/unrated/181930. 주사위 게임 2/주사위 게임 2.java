class Solution {
    public int solution(int a, int b, int c) {
        int[] count = new int[7];
        count[a]++;
        count[b]++;
        count[c]++;

        int answer = 0;

        if (count[a] == 3) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else if (count[a] == 2 || count[b] == 2 || count[c] == 2) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        } else {
            answer = a + b + c;
        }

        return answer;
    }
}