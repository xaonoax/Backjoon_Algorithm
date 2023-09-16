import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = 0;

        int arr[] = new int[n];
        double avg[] = new double[n];

        for(int i=0; i<arr.length; i++) {
            int m = sc.nextInt();

            arr[i] = m;
        }

        Arrays.sort(arr);

        for(int j=0; j<arr.length; j++) {
            max = arr[arr.length-1];
        }

        for(int k=0; k<arr.length; k++) {
            avg[k] = arr[k] / (double) max * 100.0;
        }

        double total = (Arrays.stream(avg).sum() / n);

        System.out.println(total);

    }
}