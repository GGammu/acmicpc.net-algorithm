import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ��� ����
		 * ù° �ٿ� N(1 �� N �� 100)�� �־�����.
		 * ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
		 * 
		 * 5
		 * 
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
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
