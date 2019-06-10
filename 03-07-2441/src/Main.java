import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value; j++) {
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
}
