import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        int numerator = (a1 * b2) + (a2 * b1);
        int denominator = b1 * b2;

        int gcd = getGcd(numerator, denominator);

        System.out.println(numerator / gcd + " " + denominator / gcd);
    }

    public static int getGcd(int numerator, int denominator) {
        if (numerator % denominator == 0) {
            return denominator;
        }

        return getGcd(denominator, numerator % denominator);
    }
}