import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int pq : priorities) {
            priorityQueue.add(pq);
        }

        while (!priorityQueue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == priorityQueue.peek()) {
                    priorityQueue.remove();
                    answer++;
                    if (i == location) {
                        return answer;
                    }

                }
            }
        }

        return answer;
    }
}