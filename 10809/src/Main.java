import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
		 * ������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� ��ġ�� �������� �����ؼ� ����Ѵ�.
		 * ����, � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ����Ѵ�. �ܾ��� ù ��° ���ڴ� 0��° ��ġ�̰�, �� ��° ���ڴ� 1��° ��ġ�̴�.
		 * 
		 * baekjoon
		 * 
		 * 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
		 */
		
		Scanner sc = new Scanner(System.in);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String value = sc.nextLine();
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		int[] rtn = new int[alpha.length()];
		
		for (int i = 0; i < alpha.length(); i++) {
			rtn[i] = -1;
		}
		
		for (int i = 0; i < alpha.length(); i++) {

			for (int j = 0; j < value.length(); j++) {
				if (alpha.charAt(i) != value.charAt(j)) continue;
				
				if (rtn[i] != -1) continue;
				
				rtn[i] = j;
			}
		}

		for (int i = 0; i < rtn.length; i++) {
			bw.write(String.valueOf(rtn[i]) + " ");
		}
		bw.flush();
	}
	
}
