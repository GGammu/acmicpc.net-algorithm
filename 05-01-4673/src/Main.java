import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * ���� �ѹ��� 1949�� �ε� ������ D.R. Kaprekar�� �̸� �ٿ���. ���� ���� n�� ���ؼ� d(n)�� n�� n�� �� �ڸ����� ���ϴ� �Լ���� ��������. ���� ���, d(75) = 75+7+5 = 87�̴�.
		 * ���� ���� n�� �־����� ��, �� ���� �����ؼ� n, d(n), d(d(n)), d(d(d(n))), ...�� ���� ���� ������ ���� �� �ִ�. 
		 * ���� ���, 33���� �����Ѵٸ� ���� ���� 33 + 3 + 3 = 39�̰�, �� ���� ���� 39 + 3 + 9 = 51, ���� ���� 51 + 5 + 1 = 57�̴�. �̷������� ������ ���� ������ ���� �� �ִ�.
		 * 33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...
		 * n�� d(n)�� �����ڶ�� �Ѵ�. ���� �������� 33�� 39�� �������̰�, 39�� 51�� ������, 51�� 57�� �������̴�. �����ڰ� �� ������ ���� ��쵵 �ִ�. ���� ���, 101�� �����ڰ� 2��(91�� 100) �ִ�. 
		 * �����ڰ� ���� ���ڸ� ���� �ѹ���� �Ѵ�. 100���� ���� ���� �ѹ��� �� 13���� �ִ�. 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
		 * 10000���� �۰ų� ���� ���� �ѹ��� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է��� ����.
		 * 10,000���� �۰ų� ���� ���� �ѹ��� �� �ٿ� �ϳ��� �����ϴ� ������ ����Ѵ�.
		 * 
		 * 1
		 * 3
		 * 5
		 * 7
		 * 9
		 * 20
		 * 31
		 * 42
		 * 53
		 * 64
		 *  |
		 *  |       <-- a lot more numbers
		 *  |
		 * 9903
		 * 9914
		 * 9925
		 * 9927
		 * 9938
		 * 9949
		 * 9960
		 * 9971
		 * 9982
		 * 9993
		 */
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 1; i <= 10000; i++) {
			list.add(d(i));
		}
		
		for (int i = 1; i < 10000; i++) {
			if (list.contains(i))
				continue;
			
			bw.write(String.valueOf(i));
			bw.newLine();
		}
		bw.flush();
	}
	
	private static int d(int n) {
		int rtn = 0;
		String strN = "";
		
		strN = String.valueOf(n);
		
		for (int i = 0; i < strN.length(); i++) {
			rtn += Integer.parseInt(strN.substring(i, i + 1));
		}
		
		rtn += n;
		
		return rtn;	
	}
}
