import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		/*
		 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
		 *
		 * 5
		 * 20 10 35 30 7
		 *
		 * 7 35
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String[] nums = br.readLine().split(" ");
		int tmp;
		int min = 1000000;
		int max = -1000000;

		for (int i = 0; i < N; i++) {
			tmp = Integer.parseInt(nums[i]);
			if (tmp < min) {
				min = tmp;
			}

			if (max < tmp) {
				max = tmp;
			}
		}

		bw.write(String.valueOf(min) + " " + String.valueOf(max));
		bw.flush();
	}


}
