import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * 어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
		 * 첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
		 * 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
		 * 
		 * 110
		 * 
		 * 99
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String n = "";
		int cnt = 0;
		
		n = br.readLine();
		
		for (int i = 1; i <= Integer.parseInt(n); i++) {
			if (fun(i)) cnt++; 
		}
		
		bw.write(String.valueOf(cnt));
		bw.flush();
	}
	
	private static boolean fun(int n) {
		boolean rtn = true;
		String strN = "";
		int diff = 0;
				
		strN = String.valueOf(n);
		
		
		if (strN.length() < 3) rtn = true;
		else {
			for (int i = 0; i < strN.length() - 1 ; i++) {
				if (i == 0) 
					diff = Integer.parseInt(strN.substring(i, i + 1)) - Integer.parseInt(strN.substring(i + 1, i + 2));
				else {
					if (diff != Integer.parseInt(strN.substring(i, i + 1)) - Integer.parseInt(strN.substring(i + 1, i + 2))) {
							rtn = false;
							break;
					}
				}
			}
		}
		
		return rtn;
	}
	
}
