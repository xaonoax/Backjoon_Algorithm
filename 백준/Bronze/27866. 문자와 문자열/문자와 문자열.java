import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int b = sc.nextInt();

        System.out.println(s.charAt(b - 1));
    }
}