import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		/*
		 * N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
		 * ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
		 * 
		 * 5
		 * 20 10 35 30 7
		 * 
		 * 7 35
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] nums = br.readLine().split(" ");
		int tmp;
		int min = 1000000;
		int max = -1000000;
		
		for (int i = 0; i < N; i++) {
			tmp = Integer.parseInt(nums[i]);
			if (tmp < min) {
				min = tmp;
			}
			
			if (max < tmp) {
				max = tmp;
			}
		}
		
		bw.write(String.valueOf(min) + " " + String.valueOf(max));
		bw.flush();
	}
	

}
