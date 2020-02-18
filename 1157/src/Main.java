import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
		 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
		 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
		 *
		 * Mississipi
		 *
		 * ?
		 */

		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] counts = new int[alpha.length()];

		String value = br.readLine().toUpperCase();

		for (int i = 0; i < alpha.length(); i++) {
			for (int j = 0; j < value.length(); j++) {
				if (alpha.charAt(i) != value.charAt(j)) continue;
				counts[i]++;
			}
		}

		int maxCount = 0;
		int maxIdx = 0;

		for (int i = 0; i < counts.length; i++) {
			if (counts[i] == 0) continue;

			if (counts[i] > maxCount) {
				maxCount = counts[i];
				maxIdx = i;
			} else if (counts[i] == maxCount) {
				maxIdx = -1;
			}
		}

		if (maxIdx == -1) {
			bw.write("?");
		} else {
			bw.write(alpha.charAt(maxIdx));
		}
		bw.flush();
	}

}
