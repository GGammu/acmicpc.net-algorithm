import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 * 첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
		 * 첫째 줄에 A+B를 출력한다.
		 * 
		 * 1
		 * 2
		 * 
		 * 3
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			
			System.out.println(a + b);
		} catch (Exception e) {
		}
	}
	
}
