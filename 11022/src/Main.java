import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		 * �� �׽�Ʈ ���̽����� "Case #x: A + B = C" �������� ����Ѵ�. x�� �׽�Ʈ ���̽� ��ȣ�̰� 1���� �����ϸ�, C�� A+B�̴�.
		 *
		 * 5
		 * 1 1
		 * 2 3
		 * 3 4
		 * 9 8
		 * 5 2
		 * 
		 * Case #1: 1 + 1 = 2
		 * Case #2: 2 + 3 = 5
		 * Case #3: 3 + 4 = 7
		 * Case #4: 9 + 8 = 17
		 * Case #5: 5 + 2 = 7
		 */
		
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.parseInt(sc.nextLine());
		String[] values = new String[cnt];
		String[] nums = new String[2];
		
		int A = 0;
		int B = 0;
		
		for (int i = 0; i < cnt; i++) {
			values[i] = sc.nextLine();
		}
		
		for (int i = 0; i < values.length; i++) {
			nums = values[i].split(" ");
			A = Integer.parseInt(nums[0]);
			B = Integer.parseInt(nums[1]);
			System.out.println("Case #" + (i + 1) + ": " + A + " + " + B + " = " + (A + B));
		}
	}
}