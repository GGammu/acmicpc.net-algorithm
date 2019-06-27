import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		/*
		 * �������� c d e f g a b C, �� 8�� ������ �̷�����ִ�. �� �������� 8�� ���� ������ ���� ���ڷ� �ٲپ� ǥ���Ѵ�. c�� 1��, d�� 2��, ..., C�� 8�� �ٲ۴�.
		 * 1���� 8���� ���ʴ�� �����Ѵٸ� ascending, 8���� 1���� ���ʴ�� �����Ѵٸ� descending, �� �� �ƴ϶�� mixed �̴�.
		 * ������ ������ �־����� ��, �̰��� ascending����, descending����, �ƴϸ� mixed���� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� 8�� ���ڰ� �־�����. �� ���ڴ� ���� ������ ������ ���̸�, 1���� 8���� ���ڰ� �� ���� �����Ѵ�.
		 * ù° �ٿ� ascending, descending, mixed �� �ϳ��� ����Ѵ�.
		 * 
		 * 1 2 3 4 5 6 7 8
		 * 
		 * ascending
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String value = br.readLine();
		String[] values = value.split(" ");
		
		char lastChr = ' ';
		char curChr = ' ';
		
		for (int i = 0; i < values.length - 1; i++) {
			lastChr = curChr;
			
			if ((Integer.parseInt(values[i]) - Integer.parseInt(values[i + 1])) > 0) {
				curChr = '-';
			} else if ((Integer.parseInt(values[i]) - Integer.parseInt(values[i + 1])) < 0) {
				curChr = '+';
			} else {
				curChr = ' ';
			}
			
			if (i == 0) continue;
			
			if (lastChr != curChr) {
				lastChr = ' '; 
				break;
			}
		}
		
		switch (lastChr) {
			case '+':
				bw.write("ascending");
				break;
			case '-':
				bw.write("descending");
				break;
			case ' ':
				bw.write("mixed");
				break;
			default:
				break;
		}
		
		bw.flush();
	}
	
}
