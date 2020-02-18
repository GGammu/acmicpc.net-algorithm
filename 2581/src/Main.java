import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		/*
		 * 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
		 * 
		 * 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총
		 * 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.
		 * 
		 * 입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
		 * 
		 * M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
		 * 
		 * M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.
		 * 
		 * 단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
		 *
		 * - 
		 * 60
		 * 100
		 * 
		 * 620
		 * 61
		 * -
		 * 
		 * -
		 * 64
		 * 65 
		 * 
		 * -1
		 * -
		 */	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int M = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			
			ArrayList<Boolean> arr = new ArrayList<Boolean>(N + 1);
			
			arr.add(false);
			arr.add(false);
			
			for (int i = 2; i <= N; i++) {
				arr.add(true);
			}
			
			for (int i = 2; i * i <= N; i++) {
				if (arr.get(i))
					for (int j = i * 2; j <= N; j += i) {
						arr.set(j, false);
					}
			}
			
			int sum = 0;
			int min = 0;
			
			for (int i = M; i <= N; i++) {
				if (!arr.get(i)) continue;
				if (min == 0) min = i;
				sum += i;
			}
			
			if (min == 0) 
				bw.write("-1");
			else {
				bw.write(String.valueOf(sum));
				bw.newLine();
				bw.write(String.valueOf(min));
			}
			bw.flush();
		} catch (Exception e) {
		}
	}

}
