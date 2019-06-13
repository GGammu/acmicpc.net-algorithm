import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
		 * 첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
		 * 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
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
