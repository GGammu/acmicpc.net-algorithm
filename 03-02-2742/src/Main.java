import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String value = sc.nextLine();
		
		for (int i = Integer.parseInt(value); i >= 1; i--) {
			System.out.println(i);
		}
	}
	
}