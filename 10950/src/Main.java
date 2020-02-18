import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 각 테스트 케이스마다 A+B를 출력한다.
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
