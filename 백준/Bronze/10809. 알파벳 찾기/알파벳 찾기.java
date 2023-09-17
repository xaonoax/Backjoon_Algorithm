import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        String s = sc.next();

        for(int i=0; i<arr.length; i++) {
            arr[i] = -1;
        }

        for(int j=0; j<s.length(); j++) {
            char c = s.charAt(j);

            if(arr[c - 'a'] == -1) {
                arr[c -'a'] = j;
            }
        }
        for(int fin : arr) {
            System.out.print(fin + " ");
        }
    }
}