import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] values = sc.nextLine().split(" ");
		
		System.out.println(Double.parseDouble(values[0]) / Double.parseDouble(values[1]));

	}

}
