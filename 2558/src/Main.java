import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� A, ��° �ٿ� B�� �־�����. (0 < A, B < 10)
		 * ù° �ٿ� A+B�� ����Ѵ�.
		 * 
		 * 1
		 * 2
		 * 
		 * 3
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			
			System.out.println(a + b);
		} catch (Exception e) {
		}
	}
	
}