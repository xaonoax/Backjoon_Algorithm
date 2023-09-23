import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int sum[] = {1, 1, 2, 2, 2, 8};

        for(int i=0; i<sum.length; i++) {
            int p = sc.nextInt();

                sum[i] = sum[i]-p;
        }

        for(int i=0; i<sum.length; i++) {
            System.out.print(sum[i] + " ");
        }

    }
}