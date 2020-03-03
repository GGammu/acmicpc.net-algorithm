import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		문제
//		배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
//
//		입력
//		첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
//
//		출력
//		첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
//
//		예제 입력 1 
//		2143
//
//		예제 출력 1 
//		4321		
		
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		char[] cN = N.toCharArray();
		char tmp;
		
		for (int i = 0; i < cN.length; i++) {
			for (int j = 0; j < cN.length - 1 - i; j++) {
				if (cN[j] > cN[j + 1]) continue; 

				tmp = cN[j + 1];
				cN[j + 1] = cN[j];
				cN[j] = tmp;
			}
		}
		
		System.out.println(String.valueOf(cN));
	}

}
