import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ��� ����
		 * ������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
		 * ù° �ٿ� N(1 �� N �� 100)�� �־�����.
		 * ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
		 * 
		 * 5
		 * 
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 */
		
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
