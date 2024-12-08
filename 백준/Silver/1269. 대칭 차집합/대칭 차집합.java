import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < a; i++) {
            set.add(sc.nextInt());
        }

        for (int i = 0; i < b; i++) {
            set.add(sc.nextInt());
        }

        System.out.println((set.size()- b) + (set.size() - a) + " ");
    }
}