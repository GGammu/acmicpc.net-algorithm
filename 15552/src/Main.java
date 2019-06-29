import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		 * 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
		 * 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
		 * 
		 * 5
		 * 1 1
		 * 12 34
		 * 5 500
		 * 40 60
		 * 1000 1000
		 * 
		 * 2
		 * 46
		 * 505
		 * 100
		 * 2000
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<String> al = new ArrayList<String>();
		String tmpStr = "";
		
		try {
			while (true) {
				tmpStr = br.readLine();
				if (tmpStr.equals("")) break;
				al.add(tmpStr);
			}	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			for (int i = 1; i <= Integer.parseInt(al.get(0)); i++) {
				String[] values = al.get(i).split(" ");
				String sum = String.valueOf((Integer.parseInt(values[0]) + Integer.parseInt(values[1])));
				
				bw.write(sum);
				bw.newLine();
			}
			
			bw.flush();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
}
