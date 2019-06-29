import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * � ���� ���� X�� �ڸ����� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		 * ù° �ٿ� 1,000���� �۰ų� ���� �ڿ��� N�� �־�����.
		 * ù° �ٿ� 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����Ѵ�.
		 * 
		 * 110
		 * 
		 * 99
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String n = "";
		int cnt = 0;
		
		n = br.readLine();
		
		for (int i = 1; i <= Integer.parseInt(n); i++) {
			if (fun(i)) cnt++; 
		}
		
		bw.write(String.valueOf(cnt));
		bw.flush();
	}
	
	private static boolean fun(int n) {
		boolean rtn = true;
		String strN = "";
		int diff = 0;
				
		strN = String.valueOf(n);
		
		
		if (strN.length() < 3) rtn = true;
		else {
			for (int i = 0; i < strN.length() - 1 ; i++) {
				if (i == 0) 
					diff = Integer.parseInt(strN.substring(i, i + 1)) - Integer.parseInt(strN.substring(i + 1, i + 2));
				else {
					if (diff != Integer.parseInt(strN.substring(i, i + 1)) - Integer.parseInt(strN.substring(i + 1, i + 2))) {
							rtn = false;
							break;
					}
				}
			}
		}
		
		return rtn;
	}
	
}
