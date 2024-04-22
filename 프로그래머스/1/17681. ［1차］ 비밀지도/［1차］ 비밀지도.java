import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String s1 = String.format("%" + n + "d", Long.parseLong(Integer.toBinaryString(arr1[i])));
            String s2 = String.format("%" + n + "d", Long.parseLong(Integer.toBinaryString(arr2[i])));

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if (s1.charAt(j) == '1' || s2.charAt(j) == '1') {
                    sb.append('#');
                } else {
                    sb.append(' ');
                }
            }
            answer[i] = sb.toString();
        }

        return answer;
    }
}