import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * ����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. �������忡�� ����� ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
		 * ����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
		 * ����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� N�� �־�����. (3 �� N �� 5000)
		 * ����̰� ����ϴ� ������ �ּ� ������ ����Ѵ�. ����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.
		 * 
		 * 18
		 * 
		 * 4
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int needSugar;
		int bigBag = 5;
		int smallBag = 3;
		int remainsugar = 0;
		
		int bagCnt = 0;
		
		try {
			needSugar = Integer.parseInt(br.readLine());
			
			for (int i = (needSugar / bigBag) ; i >= 0; i--) {
				remainsugar = needSugar;
				
				bagCnt = i;
				
				remainsugar -= bigBag * i;
				
				bagCnt +=  remainsugar / smallBag;
				remainsugar = remainsugar % smallBag;
				
				if (remainsugar == 0) break;
			}
			
			if (remainsugar != 0) {
				System.out.println(-1);
			} else {
				System.out.println(bagCnt);				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
