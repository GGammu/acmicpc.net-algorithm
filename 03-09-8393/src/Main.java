import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� n (1 �� n �� 10,000)�� �־�����.
		 * 1���� n���� ���� ����Ѵ�.
		 * 
		 * 3
		 * 
		 * 6
		 */
		
		Scanner sc = new Scanner(System.in);
		int value = Integer.parseInt(sc.nextLine());
		int sum = 0;
		
		for (int i = value; i > 0; i--) {
			sum += i;
		}
		
		System.out.println(sum);
	}
	
}
