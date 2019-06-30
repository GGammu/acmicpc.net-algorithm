import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.
		 * 첫째 줄에 N!을 출력한다.
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
