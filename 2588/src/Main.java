import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * (�� �ڸ� ��) �� (�� �ڸ� ��)�� ������ ���� ������ ���Ͽ� �̷������.
		 * (1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־��� �� (3), (4), (5), (6)��ġ�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� (1)�� ��ġ�� �� �� �ڸ� �ڿ�����, ��° �ٿ� (2)�� ��ġ�� �� ���ڸ� �ڿ����� �־�����.
		 * ù° �ٺ��� ��° �ٱ��� ���ʴ�� (3), (4), (5), (6)�� �� ���� ����Ѵ�.
		 * 
		 * 472
		 * 385
		 * 
		 * 2360
		 * 3776
		 * 1416
		 * 181720
		 */
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		int d = 0;
		
		for (int i = 0; i < 3; i++) {
			c = b / (int) Math.pow(10, i) ;
			d = c % 10;
			System.out.println(a * d);
		}
		
		System.out.println(a * b);
	}
	
}
