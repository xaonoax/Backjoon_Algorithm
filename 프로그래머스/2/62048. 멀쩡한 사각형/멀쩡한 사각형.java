class Solution {
    public long solution(int w, int h) {
        long w1 = w;
        long h1 = h;
        long answer = (w1 * h1) - ((w1 + h1) - gcd(w1, h1));

        return answer;
    }

    public static long gcd(long w, long h) {
        if (h == 0) {
            return w;
        }
        return gcd(h, w % h);
    }
}