import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			System.out.println(c1 + c2);
		}
	}
}