import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * (A+B)%C�� (A%C + B%C)%C �� ������?
		 * (A��B)%C�� (A%C �� B%C)%C �� ������?
		 * �� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� A, B, C�� ������� �־�����. (2 �� A, B, C �� 10000)
		 * ù° �ٿ� (A+B)%C, ��° �ٿ� (A%C + B%C)%C, ��° �ٿ� (A��B)%C, ��° �ٿ� (A%C �� B%C)%C�� ����Ѵ�.
		 * 
		 * 5 8 4
		 * 
		 * 1
		 * 1
		 * 0
		 * 0 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String[] values = sc.nextLine().split(" ");
		
		int a = Integer.parseInt(values[0]);
		int b = Integer.parseInt(values[1]);
		int c = Integer.parseInt(values[2]);

		System.out.println((a + b) % c);
		System.out.println((a % c + b % c) % c);
		System.out.println((a * b) % c);
		System.out.println((a % c * b % c) % c);
	}

}
