import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] round1 = new int[n];
        int[] round2 = new int[n];
        int score = 0;

        for (int i = 0; i < n; i++) {
            round1[i] = Math.abs(sc.nextInt());
            round2[i] = Math.abs(sc.nextInt());

            score += round1[i] + round2[i];
        }

        System.out.println(score);
    }
}