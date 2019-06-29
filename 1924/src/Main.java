import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * ������ 2007�� 1�� 1�� �������̴�. �׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? �̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� �� ĭ�� ���̿� �ΰ� x(1��x��12)�� y(1��y��31)�� �־�����. ����� 2007�⿡�� 1, 3, 5, 7, 8, 10, 12���� 31�ϱ���, 4, 6, 9, 11���� 30�ϱ���, 2���� 28�ϱ��� �ִ�.
		 * ù° �ٿ� x�� y���� ���� ���������� ���� SUN, MON, TUE, WED, THU, FRI, SAT�� �ϳ��� ����Ѵ�.
		 * 
		 * 1 1
		 * 
		 * MON
		 */
		Scanner sc = new Scanner(System.in);
		int countDays = 0;
		int days = 0;
		String weekly;
		
		String[] values = sc.nextLine().split(" ");
		
		for (int i = 1; i < Integer.parseInt(values[0]); i++) {
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				countDays += 31;
			} else if (i == 4 || i == 6 || i == 9 || i == 11){
				countDays += 30;
			} else {
				countDays += 28;
			}
		}
		
		
		countDays += Integer.parseInt(values[1]);
		
		days = countDays % 7;
		
		switch (days) {
			case 0:
				weekly = "SUN";
				break;
			case 1:
				weekly = "MON";
				break;
			case 2:
				weekly = "TUE";
				break;
			case 3:
				weekly = "WED";
				break;
			case 4:
				weekly = "THU";
				break;
			case 5:
				weekly = "FRI";
				break;
			case 6:
				weekly = "SAT";
				break;
			default:
				weekly = "";
				break;
		}
		
		System.out.println(weekly);
	}
	
}
