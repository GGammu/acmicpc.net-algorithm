import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		/*
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
		 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		 * 입력의 마지막에는 0 두 개가 들어온다.
		 * 각 테스트 케이스마다 A+B를 출력한다.
		 *
		 * 1 1
		 * 2 3
		 * 3 4
		 * 9 8
		 * 5 2
		 * 0 0
		 *
		 * 2
		 * 5
		 * 7
		 * 17
		 * 7
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String temp = "";
		String[] nums = new String[2];

		while(!(temp =br.readLine()).equals("0 0")) {
			nums = temp.split(" ");
			bw.write(String.valueOf(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1])));
			bw.newLine();
		}

		bw.flush();
	}

}