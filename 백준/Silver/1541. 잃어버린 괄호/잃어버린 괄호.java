import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = Integer.MAX_VALUE;
        String[] arr = sc.nextLine().split("-");

        for (int i = 0; i < arr.length; i++) {
            int tmp = 0;
            String[] n = arr[i].split("\\+");

            for (int j = 0; j < n.length; j++) {
                tmp += Integer.parseInt(n[j]);
            }

            if (sum == Integer.MAX_VALUE) {
                sum = tmp;
            } else {
                sum -= tmp;
            }
        }

        System.out.println(sum);

    }
}