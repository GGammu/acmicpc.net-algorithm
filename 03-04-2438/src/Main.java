import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
		 * ù° �ٿ� N(1 �� N �� 100)�� �־�����.
		 * ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
		 * 
		 * 5
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */

		Scanner sc = new Scanner(System.in);
		int value = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < value; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}