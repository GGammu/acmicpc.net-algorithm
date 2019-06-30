import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		/*
		 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		 * 예를 들어, 서로 다른 9개의 자연수
		 * 3, 29, 38, 12, 57, 74, 40, 85, 61 
		 * 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
		 * 첫 째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
		 * 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
		 * 
		 * 3
		 * 29
		 * 38
		 * 12
		 * 57
		 * 74
		 * 40
		 * 85
		 * 61
		 * 
		 * 85
		 * 8
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nums = new int[9];
		int max = 0;
		int idx = 0;
		
		for (int i = 0; i < 9; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		max = nums[0];
		idx = 1;
		
		for (int i = 1; i < 9; i++) {
			if (max < nums[i]) {
				max = nums[i];
				idx = i + 1;
			}
		}
		
		bw.write(String.valueOf(max));
		bw.newLine();
		bw.write(String.valueOf(idx));
		bw.flush();
	}
}
