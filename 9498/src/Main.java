import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		/*
		 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		 * 시험 성적을 출력한다.
		 *
		 * 100
		 *
		 * A
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int value = 0;
		String rtn = "";

		try {
			value = Integer.parseInt(br.readLine());

			if (90 <= value && value <= 100) {
				rtn = "A";
			} else if (80 <= value && value <= 89) {
				rtn = "B";
			} else if (70 <= value && value <= 79) {
				rtn = "C";
			} else if (60 <= value && value <= 69) {
				rtn = "D";
			} else {
				rtn = "F";
			}

			System.out.println(rtn);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
