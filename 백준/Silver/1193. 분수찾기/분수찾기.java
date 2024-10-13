import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 0;
        int n = 0;

        while (n < x) {
            i++;
            n += i;
        }

        if (i % 2 == 0) {
            System.out.println((i - (n - x)) + "/" + (i + (((n - i) - x) + 1)));
        } else {
            System.out.println( (i + (((n - i) - x) + 1)) + "/" + (i - (n - x)));
        }

    }
}