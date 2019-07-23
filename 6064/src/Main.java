import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		/*
		 * �ֱٿ� ICPC Ž���� ���Ƹ޸�ī�� ��ī ������ ���� ������ ���� ī�� ������ ���� �Ͽ� �������ٴ� ����� �߰��ߴ�. ī�� ������ �鼺���� Ư���� �޷��� ����� ������ �˷��� �ִ�. �׵��� M�� N���� �۰ų� ���� �� ���� �ڿ��� x, y�� ������ �� �⵵�� <x:y>�� ���� �������� ǥ���Ͽ���. �׵��� �� ������ ���ʿ� �ش��ϴ� ù ��° �ظ� <1:1>�� ǥ���ϰ�, �� ��° �ظ� <2:2>�� ǥ���Ͽ���. <x:y>�� ���� �ظ� ǥ���� ���� <x':y'>�̶�� ����. ���� x < M �̸� x' = x + 1�̰�, �׷��� ������ x' = 1�̴�. ���� ������� ���� y < N�̸� y' = y + 1�̰�, �׷��� ������ y' = 1�̴�. <M:N>�� �׵� �޷��� ������ �طμ�, �� �ؿ� ������ ������ �����Ѵٴ� ������ ���� �´�. 
		 * ���� ���, M = 10 �̰� N = 12��� ����. ù ��° �ش� <1:1>�� ǥ���ǰ�, 11��° �ش� <1:11>�� ǥ���ȴ�. <3:1>�� 13��° �ظ� ��Ÿ����, <10:12>�� �������� 60��° �ظ� ��Ÿ����. 
		 * �� ���� ���� M, N, x�� y�� �־��� ��, <M:N>�� ī�� �޷��� ������ �ض�� �ϸ� <x:y>�� �� ��° �ظ� ��Ÿ������ ���ϴ� ���α׷��� �ۼ��϶�. 
		 * �Է� �����ʹ� ǥ�� �Է��� ����Ѵ�. �Է��� T���� �׽�Ʈ �����ͷ� �����ȴ�. �Է��� ù ��° �ٿ��� �Է� �������� ���� ��Ÿ���� ���� T�� �־�����. �� �׽�Ʈ �����ʹ� �� �ٷ� �����ȴ�. �� �ٿ��� �� ���� ���� M, N, x�� y�� �־�����. (1 �� M, N �� 40,000, 1 �� x �� M, 1 �� y �� N) ���⼭ <M:N>�� ī�� �޷��� ������ �ظ� ��Ÿ����.
		 * ����� ǥ�� ����� ����Ѵ�. �� �׽�Ʈ �����Ϳ� ����, ���� k�� �� �ٿ� ����Ѵ�. ���⼭ k�� <x:y>�� k��° �ظ� ��Ÿ���� ���� �ǹ��Ѵ�. ���� <x:y>�� ���� ǥ���Ǵ� �ذ� ���ٸ�, ��, <x:y>�� ��ȿ���� ���� ǥ���̸�, -1�� ����Ѵ�.
		 * 
		 * 3
		 * 10 12 3 9
		 * 10 12 7 2
		 * 13 11 5 6
		 * 	
		 * 33
		 * -1
		 * 83
		 */
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			String[] values =  br.readLine().split(" ");
			int M = Integer.parseInt(values[0]);
			int N = Integer.parseInt(values[1]);
			int x = Integer.parseInt(values[2]);
			int y = Integer.parseInt(values[3]);
			int year = 0;
			int tmp = 0;
			int find = 0;
			int m = 0;
			int n = 0;
			int a = 0;
			int b = 0;
			
			if (M > N) {
				m = M;
				n = N;
				a = x;
				b = y;
			} else {
				m = N;
				n = M;
				a = y;
				b = x;
			}
			
			for (int j = 0; j < m; j++) {
				year = m * j + a;
				
				tmp = (year % n == 0 ? n : year % n);
				if (b == tmp ) {
					find = 1;
					break;
				}
			}
			
			if (find == 1) {
				bw.write(String.valueOf(year));				
			} else {
				bw.write("-1");
			}
			
			bw.newLine();
		}
		bw.flush();
	}

}

