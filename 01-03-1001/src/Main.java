import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * �� ���� A�� B�� �Է¹��� ����, A-B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		 * ù° �ٿ� A-B�� ����Ѵ�.
		 * 
		 * 3 2
		 * 
		 * 1
		 */
		
		Scanner sc = new Scanner(System.in);
		String[] numbers = sc.nextLine().split(" ");
		System.out.println(Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]));
	}

}
