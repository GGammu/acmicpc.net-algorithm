import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
		 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		 * 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
		 *
		 * 5
		 * 5 50 50 70 80 100
		 * 7 100 95 90 80 70 60 50
		 * 3 70 90 80
		 * 3 70 90 81
		 * 9 100 99 98 97 96 95 94 93 91
		 *
		 * 40.000%
		 * 57.143%
		 * 33.333%
		 * 66.667%
		 * 55.556%
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int cnt = 0;
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<Double> scores = new ArrayList<Double>();

		String[] tmpScore = null;

		Double studenstsCnt = 0.0D;
		Double sum = 0.0D;
		Double avg = 0.0D;
		Double goodCnt = 0.0D;
		Double goodAvg = 0.0D;
		Double pi = Math.pow(10, 3);
		DecimalFormat df = new DecimalFormat("0.000");

		cnt = Integer.parseInt(br.readLine());

		for (int i = 0; i < cnt; i++) {
			al.add(br.readLine());
		}

		for (int i = 0; i < cnt; i++) {
			tmpScore = al.get(i).split(" ");

			studenstsCnt = Double.parseDouble(tmpScore[0]);
			sum = 0.0D;
			scores.clear();
			for (int j = 1; j <= studenstsCnt; j++) {
				scores.add(Double.parseDouble(tmpScore[j]));
				sum +=  Double.parseDouble(tmpScore[j]);
			}

			avg = Math.round(sum / studenstsCnt * pi) / pi;
			goodCnt = 0.0D;
			goodAvg = 0.0D;
			for (int j = 0; j < studenstsCnt; j++) {
				if (scores.get(j) > avg) goodCnt++;
			}

			goodAvg = Math.round(goodCnt / studenstsCnt * 100 * pi) / pi;
			if (i != 0) bw.newLine();
			bw.write(df.format(goodAvg) + "%");
		}
		bw.flush();
	}

}
