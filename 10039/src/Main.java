import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * �����̰� ����ġ�� ������ �� ���� ������ �������� ����, ����, ���, ��, �����̴�.
		 * ���� �� ������ �⸻��簡 �־���, �����̴� ���� �л����� �⸻��� �������� ä���ϰ� �ִ�. �⸻��� ������ 40�� �̻��� �л����� �� ���� �״�� �ڽ��� ������ �ȴ�. ������, 40�� �̸��� �л����� �����н��� ��� ������ �����ϸ� 40���� �ް� �ȴ�. �����н��� �ź��� �� ���� ������, 40�� �̸��� �л����� �׻� 40���� �ް� �ȴ�.
		 * �л� 5���� ������ �־����� ��, ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է��� �� 5�ٷ� �̷���� �ְ�, �������� ����, ������ ����, ������� ����, ������ ����, ������ ������ ������� �־�����.
		 * ������ ��� 0�� �̻�, 100�� ������ 5�� ����̴�. ����, ��� ������ �׻� �����̴�.
		 * ù° �ٿ� �л� 5���� ��� ������ ����Ѵ�.
		 * 
		 * 10
		 * 65
		 * 100
		 * 30
		 * 95
		 * 
		 * 68
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] scores = new int[5];
		int tmp = 0;
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			tmp = Integer.parseInt(br.readLine());
			
			if (tmp < 40) tmp = 40;
			
			sum += tmp;
		}
		
		bw.write(String.valueOf(sum / 5));
		bw.flush();
	}
	
}
