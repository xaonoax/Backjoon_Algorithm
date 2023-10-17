class Solution {
    public int solution(int n) {
        int answer = 0;
        int num1 = n;
        int num2 = 6;
        int gcd = getGCD(num1, num2);

        answer = ((num1 * num2) / gcd) / 6;

        return answer;
    }
    public static int getGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return getGCD(num2, num1 % num2);
    }
}