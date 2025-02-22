import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[s.length()];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - 48;
            count += arr[i];
        }

        Arrays.sort(arr);

        if ((count % 3 == 0) && (arr[0] == 0)) {
            for (int i = s.length() - 1; i > -1; i--) {
                System.out.print(arr[i]);
            }
        } else {
            System.out.println(-1);
        }
    }
}