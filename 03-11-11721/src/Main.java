import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.
		 * �� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� �ܾ �־�����. �ܾ�� ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ������, ���̴� 100�� ���� �ʴ´�. ���̰� 0�� �ܾ�� �־����� �ʴ´�.
		 * �Է����� �־��� �ܾ �� ���� ��� �� �ٿ� �ϳ��� ����Ѵ�. �ܾ��� ���̰� 10�� ����� �ƴ� ��쿡�� ������ �ٿ��� 10�� �̸��� ���ڸ� ����� ���� �ִ�.
		 * 
		 * BaekjoonOnlineJudge
		 * 
		 * BaekjoonOn
		 * lineJudge
		 */
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		int strCnt = value.length();
		
		for (int i = 0; i < strCnt; i++) {
			if (i % 10 == 0 && i != 0) {
				System.out.println();
			}
			
			System.out.print(value.charAt(i));
		}
	}
	
}
