import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		/*
		 * ���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
		 * ��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.
		 * X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
		 * 
		 * 10 5
		 * 1 10 4 9 2 3 8 5 7 6
		 * 
		 * 1 4 2 3
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] firstValues = null;
		String[] secondValues = null;
		
		try {
			firstValues = br.readLine().split(" ");
			secondValues = br.readLine().split(" ");
			
			for (int i = 0; i < Integer.parseInt(firstValues[0]); i++) {
				if (Integer.parseInt(secondValues[i]) >= Integer.parseInt(firstValues[1])) continue;
				
				bw.write(secondValues[i] + " ");
			}
			
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
