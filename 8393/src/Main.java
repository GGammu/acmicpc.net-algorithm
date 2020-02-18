import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
		 * 1부터 n까지 합을 출력한다.
		 *
		 * 3
		 *
		 * 6
		 */

		Scanner sc = new Scanner(System.in);
		int value = Integer.parseInt(sc.nextLine());
		int sum = 0;

		for (int i = value; i > 0; i--) {
			sum += i;
		}

		System.out.println(sum);
	}

}
