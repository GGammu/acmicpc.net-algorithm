import java.awt.SecondaryLoop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
//		문제
//		수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.
//
//		1. 산술평균 : N개의 수들의 합을 N으로 나눈 값
//		2. 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
//		3. 최빈값 : N개의 수들 중 가장 많이 나타나는 값
//		4. 범위 : N개의 수들 중 최댓값과 최솟값의 차이
//		N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 그 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절댓값은 4,000을 넘지 않는다.
//
//		출력
//		첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
//		둘째 줄에는 중앙값을 출력한다.
//		셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
//		넷째 줄에는 범위를 출력한다.		
//		
//		예제 입력 1 
//		5
//		1
//		3
//		8
//		-2
//		2
//
//		예제 출력 1 
//		2
//		2
//		1
//		10
//
//		예제 입력 2 
//		1
//		4000
//		예제 출력 2 
//		4000
//		4000
//		4000
//		0
//
//		예제 입력 3 
//		5
//		-1
//		-2
//		-3
//		-1
//		-2
//
//		예제 출력 3 
//		-2
//		-2
//		-1
//		2
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] nums;
		int[] counts = new int[8001];
		double sum = 0d;
		int tmp = 0;
		
		try {
			// 값 입력
			Integer N = Integer.parseInt(br.readLine());
			nums = new int[N];
			int min = 40001;
			int max = -40001;
			
			for (int i = 0; i < N; i++) {
				nums[i] = Integer.parseInt(br.readLine());
				sum += (double)nums[i];
				if (min > nums[i]) min = nums[i];
				if (max < nums[i]) max = nums[i];
				counts[nums[i] + 4000]++;
			}
		
			// 최빈값 구하기 
			int showCnt = 0;
			double midPos = Math.round((double)N / 2d);
			int cntSum = 0;
			boolean midflag = false;
			int mid = 0;

			for (int i = 0; i < counts.length; i++) {
				if (showCnt < counts[i]) showCnt = counts[i];

				cntSum += counts[i];

				if (!midflag && cntSum >= midPos && counts[i] != 0) {
					mid = i - 4000;
					midflag = true;
				}
			}

			int maxCnt = 0;
			int showValue = 0;

			for (int i = 0; i < counts.length; i++) {
				if (counts[i] != showCnt) 
					continue;
					
				showValue = i - 4000;
				maxCnt++;

				if (maxCnt == 2) {
					break;
				}
			}

			bw.write(String.valueOf(Math.round(sum / N)));
			bw.newLine();
			bw.write(String.valueOf(mid));
			bw.newLine();
			bw.write(String.valueOf(String.valueOf(showValue)));
			bw.newLine();
			bw.write(String.valueOf(max - min));
			bw.flush();
		} catch (Exception e) {
		}
	}

}
