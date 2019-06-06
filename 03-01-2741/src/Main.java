import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String value = sc.nextLine();
		
		for (int i = 1; i <= Integer.parseInt(value); i++) {
			System.out.println(i);
		}
	}
	
}
