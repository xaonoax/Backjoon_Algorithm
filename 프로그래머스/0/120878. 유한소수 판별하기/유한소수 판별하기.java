class Solution {
    public int solution(int a, int b) {
        int answer = b / GCD(a, b);

        while (answer != 1) {
            if (answer % 2 == 0) {
                answer /= 2;
            } else if (answer % 5 == 0) {
                answer /= 5;
            } else {
                return 2;
            }
        }
        return 1;
    }

    public int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}