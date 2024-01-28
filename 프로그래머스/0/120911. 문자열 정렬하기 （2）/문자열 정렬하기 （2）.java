import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String[] arr = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.toLowerCase().charAt(i);
            arr[i] = String.valueOf(c);
        }

        Arrays.sort(arr);

        String answer = String.join("", arr);

        return answer;
    }
}