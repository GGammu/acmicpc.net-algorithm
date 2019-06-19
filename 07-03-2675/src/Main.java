import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * ���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
		 * QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.
		 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. �� �׽�Ʈ ���̽��� �ݺ� Ƚ�� R(1 �� R �� 8), ���ڿ� S�� �������� ���еǾ� �־�����. S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�. 
		 * �� �׽�Ʈ ���̽��� ���� P�� ����Ѵ�.
		 * 
		 * 2
		 * 3 ABC
		 * 5 /HTP
		 * 
		 * AAABBBCCC
		 * /////HHHHHTTTTTPPPPP
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int lineCnt = Integer.parseInt(br.readLine());
		String[] rows = new String[lineCnt];
		String[] tmp = null;
		
		for (int i = 0; i < lineCnt; i++) {
			rows[i] = br.readLine();
		}
		
		for (int i = 0; i < rows.length; i++) {
			tmp = rows[i].split(" ");
			
			for (int j = 0; j < tmp[1].length(); j++) {
				for (int k = 0; k < Integer.parseInt(tmp[0]); k++) {
					bw.write(tmp[1].charAt(j));
				}
			}
			
			bw.newLine();
		}
		
		bw.flush();
	}
	
}
