import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                queue.offer((100 - progresses[i]) / speeds[i]);
            } else {
                queue.offer(((100 - progresses[i]) / speeds[i]) + 1);
            }
        }

        int n = queue.poll();
        int count = 1;

        while (!queue.isEmpty()) {
            if (n >= queue.peek()) {
                count++;
                queue.poll();
            } else {
                answer.add(count);
                count = 1;
                n = queue.poll();
            }
        }

        answer.add(count);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}