import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
		 * "OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
		 * OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. ���ڿ��� O�� X������ �̷���� �ִ�.
		 * �� �׽�Ʈ ���̽����� ������ ����Ѵ�.
		 * 
		 * 5
		 * OOXXOXXOOO
		 * OOXXOOXXOO
		 * OXOXOXOXOXOXOX
		 * OOOOOOOOOO
		 * OOOOXOOOOXOOOOX
		 * 
		 * 10
		 * 9
		 * 7
		 * 55
		 * 30
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] answers = new String[n];
		int score = 1;
		int[] scores = new int[n]; 
		
		for (int i = 0; i < n; i++) {
			answers[i] = br.readLine();
		}
		
		for (int i = 0; i < n; i++) {			
			score = 1;
			for (int j = 0; j < answers[i].length(); j++) {
				if (answers[i].charAt(j) == 'O') {
					scores[i] += score;
					score++;
				} else {
					score = 1;
				}
			}
		}
		
		for (int i = 0; i < scores.length; i++) {
			bw.write(String.valueOf(scores[i]));
			bw.newLine();
		}
		
		bw.flush();
	}
	
}
