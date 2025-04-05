import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String light = sc.nextLine();
        boolean[] states = new boolean[light.length() + 1];

        for (int i = 0; i < light.length(); i++) {
            states[i + 1] = light.charAt(i) == 'Y';
        }

        int count = 0;

        for (int i = 1; i < states.length; i++) {
            if (!states[i]) {
                continue;
            }

            count++;

            for (int j = i; j < states.length; j += i) {
                states[j] = !states[j];
            }
        }

        boolean off = true;

        for (int i = 1; i <= light.length(); i++) {
            if (states[i]) {
                off = false;
                break;
            }
        }

        System.out.println(off ? count : -1);
    }
}