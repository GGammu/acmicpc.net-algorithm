import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		/*
		 * N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
		 * �Է����� �־��� ���� N���� ���� ����Ѵ�.
		 * 
		 * 1
		 * 1
		 * 
		 * 1
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		String inputNum = "";
		int sum = 0;
		
		
		try {
			cnt = Integer.parseInt(br.readLine());
			inputNum = br.readLine();
			
			for (int i = 0; i < cnt; i++) {
				sum += Integer.parseInt(inputNum.substring(i, i + 1));
			}
			
			System.out.println(sum);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
