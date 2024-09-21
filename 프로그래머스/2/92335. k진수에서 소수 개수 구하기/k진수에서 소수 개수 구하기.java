class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String str = Integer.toString(n, k);

        for (String s : str.split("0")) {
            if (s.equals("")) {
                continue;
            }
            if (check(s) == false) {
                answer++;
            }
        }

        return answer;
    }

    public static boolean check(String num) {
        long n = Long.parseLong(num);

        if (n == 1) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true;
            }
        }

        return false;
    }
}