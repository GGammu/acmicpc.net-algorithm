import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * �׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�. ���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������, aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.
		 * �ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� �ܾ��� ���� N�� ���´�. N�� 100���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� N���� �ٿ� �ܾ ���´�. �ܾ�� ���ĺ� �ҹ��ڷθ� �Ǿ��ְ� �ߺ����� ������, ���̴� �ִ� 100�̴�.
		 * ù° �ٿ� �׷� �ܾ��� ������ ����Ѵ�.
		 * 
		 * 3
		 * happy
		 * new
		 * year
		 * 
		 * 3
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] words = new String[N];
		int groupCnt = 0;
		
		for (int i = 0; i < N; i++) {
			words[i] = br.readLine();
		}
		
		for (int i = 0; i < words.length; i++) {
			int[] alphabet = new int[26];
			String word = words[i];
			boolean group = true;
			
			for (int j = 0; j < word.length(); j++) {
				int al = word.charAt(j) - 97;
				alphabet[al]++;
				
				if (j != 0 && word.charAt(j-1) != word.charAt(j) && alphabet[al] > 1) {
					group = false;
					continue;
				}
			}
			
			if (group) groupCnt++;
		}
		
		bw.write(String.valueOf(groupCnt));
		bw.flush();
	}
	
}
