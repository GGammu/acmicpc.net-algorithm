import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = Integer.parseInt(sc.nextLine());
		int sum = 0;
		
		for (int i = value; i > 0; i--) {
			sum += i;
		}
		
		System.out.println(sum);
	}
	
}
