import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n * 2];

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
        }

        Arrays.sort(score);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < score.length; i++) {
            int sum = score[i] + score[(2 * n - 1) - i];

            if (min > sum) {
                min = sum;
            }
        }

        System.out.println(min);
    }
}