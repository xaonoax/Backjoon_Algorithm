import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        int i = sc.nextInt();

        System.out.println(s[i-1]);
    }
}