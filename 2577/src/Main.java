import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * �� ���� �ڿ��� A, B, C�� �־��� �� A��B��C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ���� ��� A = 150, B = 266, C = 427 �̶�� 
		 * A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
		 * ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
		 * ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. A, B, C�� ��� 100���� ���ų� ũ��, 1,000���� ���� �ڿ����̴�.
		 * ù° �ٿ��� A��B��C�� ����� 0 �� �� �� �������� ����Ѵ�. ���������� ��° �ٺ��� �� ��° �ٱ��� A��B��C�� ����� 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.
		 * 
		 * 150
		 * 266
		 * 427
		 * 
		 * 3
		 * 1
		 * 0
		 * 2
		 * 0
		 * 0
		 * 0
		 * 2
		 * 0
		 * 0
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int value = A * B * C;
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 0;
		}
		
		String[] valueArray = String.valueOf(value).split("");
		
		for (int i = 0; i < valueArray.length; i++) {
			numbers[Integer.parseInt(valueArray[i])]++; 
		}
		
		for (int i = 0; i < numbers.length; i++) {
			bw.write(String.valueOf(numbers[i]));
			bw.newLine();
		}
		bw.flush();
	}
	
}
