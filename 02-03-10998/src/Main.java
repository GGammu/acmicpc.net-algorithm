import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] values = sc.nextLine().split(" ");
		
		System.out.println(Integer.parseInt(values[0]) * Integer.parseInt(values[1]));
	} 	
	
}