import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
//		문제
//		N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 
//		이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
//
//		출력
//		첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
//
//		예제 입력 1 
//		5
//		5
//		4
//		3
//		2
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
			ArrayList<Integer> nums = new ArrayList<Integer>();
		
			int N = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < N; i++) {
				nums.add(Integer.parseInt(br.readLine()));
			}

			Collections.sort(nums, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					return o1.compareTo(o2); 
				}
			
			});
			
			for (Integer integer : nums) {
				bw.write(String.valueOf(integer));
				bw.newLine();
			}
			bw.flush();
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
