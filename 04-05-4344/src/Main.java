import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
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
