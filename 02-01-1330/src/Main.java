import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * �� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� A�� B�� �־�����. A�� B�� ���� �� ĭ���� ���еǾ��� �ִ�.
		 * ù° �ٿ� ���� �� ���� �� �ϳ��� ����Ѵ�.
		 * A�� B���� ū ��쿡�� '>'�� ����Ѵ�.
		 * A�� B���� ���� ��쿡�� '<'�� ����Ѵ�.
		 * A�� B�� ���� ��쿡�� '=='�� ����Ѵ�.
		 * 
		 * 1 2
		 * 
		 * <
		 */
		
		Scanner sc = new Scanner(System.in);
		String[] values = sc.nextLine().split(" ");
		int A = Integer.parseInt(values[0]);
		int B = Integer.parseInt(values[1]);
		
		if (A > B) {
			System.out.println(">");
		} else if (A < B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
	
}
