import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		/*
		 * ���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
		 * ���� ������ ����Ѵ�.
		 * 
		 * 100
		 * 
		 * A
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int value = 0;
		String rtn = "";
		
		try {
			value = Integer.parseInt(br.readLine());
			
			if (90 <= value && value <= 100) {
				rtn = "A";
			} else if (80 <= value && value <= 89) {
				rtn = "B";
			} else if (70 <= value && value <= 79) {
				rtn = "C";
			} else if (60 <= value && value <= 69) {
				rtn = "D";
			} else {
				rtn = "F";
			}
			
			System.out.println(rtn);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
