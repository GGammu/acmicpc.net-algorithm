import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * �ڿ��� N�� �־����� ��, N���� 1���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.
		 * ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.
		 * 
		 * 5
		 * 
		 * 5
		 * 4
		 * 3
		 * 2
		 * 1
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String value = sc.nextLine();
		
		for (int i = Integer.parseInt(value); i >= 1; i--) {
			System.out.println(i);
		}
	}
	
}