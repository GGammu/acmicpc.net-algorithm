import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� ���� N(0 �� N �� 12)�� �־�����.
		 * ù° �ٿ� N!�� ����Ѵ�.
		 * 
		 * 10
		 * 
		 * 3628800
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long value = 0;
		
		value = factorial(N);
		System.out.print(value);
	}

	private static long factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
	
}
