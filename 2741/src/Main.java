import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * �ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� 100,000���� �۰ų� ���� �ڿ��� N�� �־�����.
		 * ù° �ٺ��� N��° �� ���� ���ʴ�� ����Ѵ�.
		 * 
		 * 5
		 * 
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String value = sc.nextLine();
		
		for (int i = 1; i <= Integer.parseInt(value); i++) {
			System.out.println(i);
		}
	}
	
}
