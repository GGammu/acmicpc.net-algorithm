import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
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
