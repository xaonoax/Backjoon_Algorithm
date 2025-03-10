import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Long> pq = new PriorityQueue<Long>();

        for (int i = 0; i < n; i++) {
            pq.add(sc.nextLong());
        }

        long num = 0;

        while (pq.size() > 1) {
            long tmp1 = pq.poll();
            long tmp2 = pq.poll();

            num += tmp1 + tmp2;
            pq.add(tmp1 + tmp2);
        }

        System.out.println(num);
    }
}