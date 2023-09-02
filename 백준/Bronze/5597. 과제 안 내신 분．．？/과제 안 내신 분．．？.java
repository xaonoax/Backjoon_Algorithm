import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[31];

        for(int i=0; i<28; i++) {
            int submit = sc.nextInt();
            n[submit] = 1;
        }
        for(int i=1; i<n.length; i++) {
            if(n[i] != 1)
                System.out.println(i);
        }
    }
}