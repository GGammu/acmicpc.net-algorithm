import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 첫째 줄에 A-B를 출력한다.
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
