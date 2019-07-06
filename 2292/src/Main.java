import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		/*
		 * ���� �׸��� ���� ���������� �̷���� ������ �ִ�. �׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�. ���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ���, 13������ 3��, 58������ 5���� ������.
		 * ù° �ٿ� N(1 �� N �� 1,000,000,000)�� �־�����.
		 * �Է����� �־��� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� �������� ����Ѵ�.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long N = Long.parseLong(br.readLine());
		
		long lastValue = 1;
		long value = 0; 
		long cnt = 1;
		
		while (true) {
			if (N == 1) {
				bw.write(String.valueOf(1));
				break;
			}
			
			value = lastValue + (6 * cnt);
			if (lastValue < N && N <= value) {
				bw.write(String.valueOf(cnt + 1));
				break;
			} else {
				lastValue = value;
				cnt++;
			}
			
		}

		bw.flush();
		
	}
	
}
