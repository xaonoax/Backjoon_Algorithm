import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int[] num = new int[str.length];


        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals(" ")) {
                num[i] = Integer.parseInt(str[i]);
            }
        }

        int min = Arrays.stream(num).min().getAsInt();
        int max = Arrays.stream(num).max().getAsInt();

        answer = String.valueOf(min) + " " + String.valueOf(max);

        return answer;
    }
}