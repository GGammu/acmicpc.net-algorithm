import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		 * 문제 
		 * M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
		 * 
		 * 입력 
		 * 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000)
		 * 
		 * 출력 
		 * 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
		 * 
		 * 예제 입력 1 
		 * 3 16
		 * 
		 * 예제 출력 1 
		 * 3 
		 * 5 
		 * 7 
		 * 11 
		 * 13
		 */		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String[] input = br.readLine().split(" ");
			int m = Integer.parseInt(input[0]);
			int n = Integer.parseInt(input[1]);
			
			ArrayList<Boolean> list = new ArrayList<Boolean>(n + 1);
			
			list.add(false);
			list.add(false);
			for (int i = 2; i <= n; i++) {
				list.add(true);
			}

			for (int i = 2; i * i <= n; i++)
				if (list.get(i))
					for (int j = i * 2; j <= n; j += i) 
						list.set(j, false);

			Boolean first = false;
			for (int i = m; i <= n; i++) {
				if (!list.get(i)) continue;
				if (first) {
					bw.newLine();
				}
				first = true;
				bw.write(String.valueOf(i));
			}
			
			bw.flush();
		} catch (Exception e) {
		}
	}

}
