import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 첫째 줄에 A/B를 출력한다. 절대/상대 오차는 10-9 까지 허용한다.
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
