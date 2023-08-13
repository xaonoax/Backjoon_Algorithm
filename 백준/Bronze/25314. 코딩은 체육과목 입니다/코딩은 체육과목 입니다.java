import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n % 4 == 0) {
			for(int j=1; j<=(n/4); j++) {
				System.out.print("long" + " ");
			}
		}
		System.out.print("int");
		
	}
}