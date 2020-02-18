import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		/*
		 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
		 * 
		 * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
		 * 
		 * 주어진 수들 중 소수의 개수를 출력한다.
		 * 
		 * 4
		 * 1 3 5 7
		 * 
		 * 3
		 */		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int nCount = Integer.parseInt(br.readLine());
			String[] arrList = new String[nCount];
			
			arrList = br.readLine().split(" ");
			
			int cnt = 0;
			
			for (String n : arrList) {
				if (isPrime(Integer.parseInt(n))) cnt++;
			}
			
			bw.write(String.valueOf(cnt));
			bw.flush();
		} catch (Exception e) {

		}
	}
	
	public static boolean isPrime(int n) {
		if ( n == 1 ) return false;

		for (int i = 2; i <= Math.sqrt(n); ++i) {
			if ( n % i == 0) return false;
		}

		return true;
	}

}
