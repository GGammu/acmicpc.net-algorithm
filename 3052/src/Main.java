import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		/*
		 * �� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
		 * �� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٺ��� ����° �� ���� ���ڰ� �� �ٿ� �ϳ��� �־�����. �� ���ڴ� 1,000���� �۰ų� ����, ���� �ƴ� �����̴�.
		 * ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.
		 * 
		 * 39
		 * 40
		 * 41
		 * 42
		 * 43
		 * 44
		 * 82
		 * 83
		 * 84
		 * 85
		 * 
		 * 6
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nums = new int[10];
		int cnt = 0;
		boolean exist = false;
		
		for (int i = 0; i < 10; i++) {
			nums[i] = Integer.parseInt(br.readLine()) % 42;
		}
		
		for (int i = 0; i < nums.length; i++) {
			exist = false;
			for (int j = 0; j < i; j++) {
				if (nums[j] == nums[i]) {
					exist = true;
					break;
				}
			}
			
			if(!exist) {
				cnt++;
			}
		}
		
		bw.write(String.valueOf(cnt));
		bw.flush();
	}
	
}
