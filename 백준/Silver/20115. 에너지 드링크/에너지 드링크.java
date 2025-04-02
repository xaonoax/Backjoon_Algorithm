import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        double max = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();

            if (max < arr[i]) {
                max = arr[i];
            }
        }

        double sum = max;

        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                continue;
            }

            sum += arr[i] / 2;
        }

        System.out.println(sum);
    }
}