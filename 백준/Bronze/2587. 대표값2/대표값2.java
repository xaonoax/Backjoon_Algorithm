import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int avg = 0;

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            arr[i] = n;
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }

        System.out.println(avg / 5);
        System.out.println(arr[2]);

    }
}