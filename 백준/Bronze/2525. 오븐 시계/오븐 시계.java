import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		b = 60 * a + b;
		b += c;
		
		a = (b / 60) % 24;
		c = b % 60;
		
		System.out.println(a + " " + c);
		
    }

}