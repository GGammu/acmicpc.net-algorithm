import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < value; i++) {
			for (int j = value - i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
