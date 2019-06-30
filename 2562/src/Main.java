import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		/*
		 * 9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ���� ���, ���� �ٸ� 9���� �ڿ���
		 * 3, 29, 38, 12, 57, 74, 40, 85, 61 
		 * �� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
		 * ù ° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�.
		 * ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.
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
