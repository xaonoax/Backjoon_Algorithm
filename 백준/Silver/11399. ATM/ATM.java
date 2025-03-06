import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int x = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += x + arr[i];
            x += arr[i];
        }

        System.out.println(sum);
    }
}