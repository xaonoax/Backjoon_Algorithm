import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int[] newElements = new int[elements.length * 2];

        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
            newElements[i + elements.length] = elements[i];
        }

        Set<Integer> answer = new HashSet<>();

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                answer.add(Arrays.stream(newElements, j, j + i).sum());
            }
        }

        return answer.size();
    }
}