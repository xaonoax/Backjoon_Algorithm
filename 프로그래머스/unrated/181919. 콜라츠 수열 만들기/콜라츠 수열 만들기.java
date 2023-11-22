import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int result = n;

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(n);

        for (int i=0; i<n; i++) {
            if (result == 1) {
                break;
            }
            else if (result % 2 == 0) {
                result = result / 2;
                arr.add(result);
            }
            else if (result % 2 != 0) {
                result = 3 * result + 1;
                arr.add(result);
            }
        }

        int[] answer = new int[arr.size()];
        int index = 0;
        
        for (Integer list : arr) {
            answer[index++] = list;
        }

        return answer;
    }
}