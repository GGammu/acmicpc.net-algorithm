import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		 * �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
		 * 
		 * 5
		 * 1 1
		 * 2 3
		 * 3 4
		 * 9 8
		 * 5 2
		 * 
		 * 2
		 * 5
		 * 7
		 * 17
		 * 7
		 */
		
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());
		int A = 0;
		int B = 0;
		
		String[] values = new String[cnt];
		String[] nums = new String[2];
		
		for (int i = 0; i < cnt; i++) {
			values[i] = sc.nextLine();
		}
		
		for (int i = 0; i < values.length; i++) {
			nums = values[i].split(" ");
			A = Integer.parseInt(nums[0]);
			B = Integer.parseInt(nums[1]);
			System.out.println(A + B);
		}
	}
	
}
