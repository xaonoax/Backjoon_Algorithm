import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        boolean bl;
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt() % 42;
        }

        for(int i=0; i<arr.length; i++) {
            bl = false;
            for(int k=i+1; k<arr.length; k++) {
                if(arr[i] == arr[k]) {
                    bl = true;
                    break;
                }
            }
            if(bl == false) {
                count++;
            }
        }
        System.out.println(count);
    }
}