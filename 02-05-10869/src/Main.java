import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * �� �ڿ��� A�� B�� �־�����. �̶�, A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �� �ڿ��� A�� B�� �־�����. (1 �� A, B �� 10,000)
		 * ù° �ٿ� A+B, ��° �ٿ� A-B, ��° �ٿ� A*B, ��° �ٿ� A/B, �ټ�° �ٿ� A%B�� ����Ѵ�.
		 * 
		 * 7 3
		 * 
		 * 10
		 * 4
		 * 21
		 * 2
		 * 1
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String[] values = sc.nextLine().split(" ");
		
		int a = Integer.parseInt(values[0]);
		int b = Integer.parseInt(values[1]);
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}
	
}
