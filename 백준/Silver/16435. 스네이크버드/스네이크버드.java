import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] height = new int[n];

        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        Arrays.sort(height);

        int total_length = l;

        for (int i = 0; i < height.length; i++) {
            if (height[i] <= total_length) {
                total_length++;
            } else {
                break;
            }
        }

        System.out.println(total_length);
    }
}