class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            answer += (n / a) * b;
            System.out.println("answer = " + answer);
            System.out.println();
            n = (n / a) * b + (n % a);
            System.out.println("n = " + n);
            System.out.println();
        }
        
        return answer;
    }
}