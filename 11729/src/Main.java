import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		/*
		 * �� ���� ��밡 �ְ� ù ��° ��뿡�� �ݰ��� ���� �ٸ� n���� ������ �׿� �ִ�. �� ������ �ݰ��� ū ������� �׿��ִ�. ���� �����µ��� ���� ��Ģ�� ���� ù ��° ��뿡�� �� ��° ���� �ű�� �Ѵ�.
		 * �� ���� �� ���� ���Ǹ��� �ٸ� ž���� �ű� �� �ִ�.
		 * �׾� ���� ������ �׻� ���� ���� �Ʒ��� �ͺ��� �۾ƾ� �Ѵ�.
		 * �� �۾��� �����ϴµ� �ʿ��� �̵� ������ ����ϴ� ���α׷��� �ۼ��϶�. ��, �̵� Ƚ���� �ּҰ� �Ǿ�� �Ѵ�.
		 * �Ʒ� �׸��� ������ 5���� ����� �����̴�.
		 * 
		 * 3
		 * 
		 * 7
		 * 1 3
		 * 1 2
		 * 3 2
		 * 1 3
		 * 2 1
		 * 2 3
		 * 1 3
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		String from = "1";
		String sub = "2";
		String to = "3";
		
		bw.write(String.valueOf((int)Math.pow(2, n) - 1));
		
		bw.newLine();
		hanoi(n, from, to, sub, bw);
		bw.flush();
	}

	private static void hanoi(int n, String from, String to, String sub, BufferedWriter bw) throws IOException {
		if (n == 1) {
			bw.write(from + " " + to);
			bw.newLine();
			return;
		}
		
		hanoi(n - 1, from, sub, to, bw);
		
		bw.write(from + " " + to);
		bw.newLine();
		
		hanoi(n - 1, sub, to, from, bw);
	}
	
	
	
	
	
}
