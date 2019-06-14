import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) throws Exception {
		/*
		 * ���� ��ҹ��ڿ� ���⸸���� �̷���� ���ڿ��� �־�����. �� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.
		 * ù �ٿ� ���� ��ҹ��ڿ� ����� �̷���� ���ڿ��� �־�����. �� ���ڿ��� ���̴� 1,000,000�� ���� �ʴ´�. �ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����. ���� ���ڿ��� �հ� �ڿ��� ������ ���� ���� �ִ�.
		 * ù° �ٿ� �ܾ��� ������ ����Ѵ�.
		 * 
		 * The Curious Case of Benjamin Button
		 * 
		 * 6
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String n = br.readLine();
		char[] words = n.trim().toCharArray();
		int wordCnt = 0;
		boolean word = false;
		
		for (int i = 0; i < words.length; i++) {
			if (words[i] == ' ') {
				word = false;
			} else {
				if (!word) {
					wordCnt++;
					word = true;
				}
			}
			
		}
		
		bw.write(String.valueOf(wordCnt));
		bw.newLine();
		bw.flush();
	}
	
}
