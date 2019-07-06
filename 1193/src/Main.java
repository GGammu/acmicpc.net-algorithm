import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		/*
		 * ������ ū �迭�� ������ ���� �м����� �����ִ�.
		 * 1/1	1/2	1/3	1/4	1/5	��
		 * 2/1	2/2	2/3	2/4	��	��
		 * 3/1	3/2	3/3	��	��	��
		 * 4/1	4/2	��	��	��	��
		 * 5/1	��	��	��	��	��
		 * ��	��	��	��	��	��
		 * �̿� ���� ������ �м����� 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> �� �� ���� ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.
		 * X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� X(1 �� X �� 10,000,000)�� �־�����.
		 * ù° �ٿ� �м��� ����Ѵ�.
		 * 
		 * 14
		 * 
		 * 2/4
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long last = 0;
		long now = 0;
		long cnt = 1;
		long diff = 0;
		
		long X = Long.parseLong(br.readLine());
		
		while(true) {
			now += cnt;
			if (last < X & X <= now) {
				diff = now - X;
				
				if (cnt % 2 == 1) {
					bw.write(String.valueOf(1 + diff) +  "/" + String.valueOf(cnt - diff));
				} else {
					bw.write(String.valueOf(cnt - diff) +  "/" + String.valueOf(1 + diff));
				}
				break;
			}
			
			last = now;
			cnt++;
		}
		
		bw.flush();
	}
	
}
