import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
		 * ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.
		 * ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
		 * 
		 * Mississipi
		 * 
		 * ?
		 */
		
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] counts = new int[alpha.length()];
		
		String value = br.readLine().toUpperCase();
		
		for (int i = 0; i < alpha.length(); i++) {
			for (int j = 0; j < value.length(); j++) {
				if (alpha.charAt(i) != value.charAt(j)) continue;
				counts[i]++;
			}
		}
		
		int maxCount = 0;
		int maxIdx = 0;
		
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] == 0) continue;
			
			if (counts[i] > maxCount) {
				maxCount = counts[i];
				maxIdx = i;
			} else if (counts[i] == maxCount) {
				maxIdx = -1;
			}
		}
		
		if (maxIdx == -1) {
			bw.write("?");
		} else {
			bw.write(alpha.charAt(maxIdx));
		}
		bw.flush();
	}
	
}
