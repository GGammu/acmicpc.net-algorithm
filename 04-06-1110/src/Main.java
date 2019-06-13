import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * 0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. ���� �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�. �� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�. ���� ���� ����.
		 * 26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 6+8 = 14�̴�. ���ο� ���� 84�̴�. 8+4 = 12�̴�. ���ο� ���� 42�̴�. 4+2 = 6�̴�. ���ο� ���� 26�̴�.
		 * ���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.
		 * N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� N�� �־�����. N�� 0���� ũ�ų� ����, 99���� �۰ų� ���� �����̴�.
		 * ù° �ٿ� N�� ����Ŭ ���̸� ����Ѵ�.
		 * 
		 * 26
		 * 
		 * 4
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String N = "";
		String result = "";
		String rtn = "";
		int cycle = 0;
		
		N = br.readLine();
		
		while (!N.equals(rtn)) {
			if (cycle == 0) rtn = N;
			
			if (rtn.length() <= 1) rtn = "0" + rtn;
			
			result = String.valueOf((Integer.parseInt(rtn.substring(0, 1)) + Integer.parseInt(rtn.substring(1, 2))));
			
			if (rtn.substring(1, 2).equals("0"))
				rtn = result.substring(result.length() -1, result.length());	
			else
				rtn = rtn.substring(1, 2) + result.substring(result.length() -1, result.length());
			
			cycle++;
		}
		
		bw.write(String.valueOf(cycle));
		bw.flush();
	}
	
}
