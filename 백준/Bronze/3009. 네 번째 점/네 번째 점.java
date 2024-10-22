import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] str1 = {sc.nextInt(), sc.nextInt()};
        int[] str2 = {sc.nextInt(), sc.nextInt()};
        int[] str3 = {sc.nextInt(), sc.nextInt()};
        int x = 0;
        int y = 0;

        if (str1[0] == str2[0]) {
            x = str3[0];
        } else if (str1[0] == str3[0]) {
            x = str2[0];
        } else {
            x = str1[0];
        }

        if (str1[1] == str2[1]) {
            y = str3[1];
        } else if (str1[1] == str3[1]) {
            y = str2[1];
        } else {
            y = str1[1];
        }

        System.out.println(x + " " + y);
    }
}