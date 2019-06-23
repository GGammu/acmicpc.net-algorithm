import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * ������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. �̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���. ����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.
		 * ����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�. ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
		 * �� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� ����̰� ĥ�ǿ� ���� �� �� A�� B�� �־�����. �� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ���� �ʴ�.
		 * ù° �ٿ� ����� ����� ����Ѵ�.
		 * 
		 * 734 893
		 * 
		 * 437
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] num = br.readLine().split(" ");
		int[] revNum = new int [2];
		
		for (int i = 0; i < num.length; i++) {
			String tmp = "";
			for (int j = num[i].length() - 1; j >= 0; j--) {
				tmp += num[i].charAt(j);
			}
			
			revNum[i] = Integer.parseInt(tmp);
		}
		
		if (revNum[0] > revNum[1]) {
			bw.write(String.valueOf(revNum[0]));
		} else {
			bw.write(String.valueOf(revNum[1]));
		}
		
		bw.flush();
	}
	
}
