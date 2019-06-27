import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * �����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
		 * ���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
 		 * �������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 		 * ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����. �� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.
 		 * ù° �ٿ� ���ο� ����� ����Ѵ�. ������� ����/��� ������ 10-2���� ����Ѵ�.
 		 * 
 		 * 3
		 * 40 80 60
		 * 
		 * 75.00
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int subjectCnt = 0;
		
		StringTokenizer st = null;
		
		ArrayList<Integer> subjectPoints = new ArrayList<Integer>();
		
		int maxPoint = 0;
		Double totalPoints = 0.00D;
		
		try {
			subjectCnt= Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			
			for (int i = 0; i < subjectCnt; i++) {
				subjectPoints.add(Integer.parseInt(st.nextToken())); 
			}
			
			maxPoint = subjectPoints.get(0);
			for (int i = 1; i < subjectCnt; i++) {
				if (maxPoint < subjectPoints.get(i)) maxPoint = subjectPoints.get(i);
			}
			
			for (int i = 0; i < subjectCnt; i++) {
				totalPoints += (double) subjectPoints.get(i) / maxPoint * 100;
			}
			
			System.out.println(totalPoints / subjectCnt);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
