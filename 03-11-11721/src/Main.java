import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		int strCnt = value.length();
		
		for (int i = 0; i < strCnt; i++) {
			if (i % 10 == 0 && i != 0) {
				System.out.println();
			}
			
			System.out.print(value.charAt(i));
		}
	}
	
}
