import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> lengthCount = new HashMap<>();

        for (String str : strArr) {
            int length = str.length();
            lengthCount.put(length, lengthCount.getOrDefault(length, 0) + 1);
        }

        int answer = 0;
        
        for (int count : lengthCount.values()) {
            if (count > answer) {
                answer = count;
            }
        }

        return answer;
    }
}