import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * �� ���� A�� B�� �Է¹��� ����, A/B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		 * ù° �ٿ� A/B�� ����Ѵ�. ����/��� ������ 10-9 ���� ����Ѵ�.
		 * 
		 * 1 3
		 * 
		 * 0.33333333333333333333333333333333
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String[] values = sc.nextLine().split(" ");
		
		System.out.println(Double.parseDouble(values[0]) / Double.parseDouble(values[1]));

	}

}
