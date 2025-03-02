import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int kim = sc.nextInt();
        int lim = sc.nextInt();
        int round = 0;

        while (kim != lim) {
            kim = (kim / 2) + (kim % 2);
            lim = (lim / 2) + (lim % 2);
            round++;
        }

        System.out.println(round);
    }
}