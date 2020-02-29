import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
//		문제
//		N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
//
//		출력
//		첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
//
//		예제 입력 1 
//		5
//		5
//		2
//		3
//		4
//		1
//
//		예제 출력 1 
//		1
//		2
//		3
//		4
//		5		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		try {
			int N = Integer.parseInt(br.readLine());
		
			Integer[] num = new Integer[N];
		
			for (int i = 0; i < N; i++) {
				num[i] = Integer.parseInt(br.readLine());
			}
			
			// Bubble sort
//			int tmp = 0;
//			
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < N - 1 - i; j++) {
//					if(num[j] > num[j+1]) {
//						tmp = num[j+1];
//						num[j + 1] = num[j];
//						num[j] = tmp;
//					}
//				}
//			}
			
			// Insertion sort
			int key = 0;
			int i, j;
			for (i = 1; i < N; i++) {
				key = num[i];
				for (j = i - 1; j >= 0 && num[j] > key; j--) {
					num[j + 1] = num[j];
				}
				num[j + 1] = key;
			}
			
			for (int k = 0; k < N; k++) {
				bw.write(String.valueOf(num[k]));
				bw.newLine();
			}
			bw.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
