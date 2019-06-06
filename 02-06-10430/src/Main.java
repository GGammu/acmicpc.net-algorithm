import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] values = sc.nextLine().split(" ");
		
		int a = Integer.parseInt(values[0]);
		int b = Integer.parseInt(values[1]);
		int c = Integer.parseInt(values[2]);

		System.out.println((a + b) % c);
		System.out.println((a % c + b % c) % c);
		System.out.println((a * b) % c);
		System.out.println((a % c * b % c) % c);
	}

}
