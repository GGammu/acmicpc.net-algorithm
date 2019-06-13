import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
		 * 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 단어가 주어진다. 단어는 알파벳 소문자와 대문자로만 이루어져 있으며, 길이는 100을 넘지 않는다. 길이가 0인 단어는 주어지지 않는다.
		 * 입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력한다. 단어의 길이가 10의 배수가 아닌 경우에는 마지막 줄에는 10개 미만의 글자만 출력할 수도 있다.
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
