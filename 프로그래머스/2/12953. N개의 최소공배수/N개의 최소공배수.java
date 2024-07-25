import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int num = gcd(arr[i + 1], arr[i]);
            arr[i + 1] = (arr[i] * arr[i + 1]) / num;
        }


        return arr[arr.length - 1];
    }

    public static int gcd(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return gcd(num2, num1 % num2);
    }
}