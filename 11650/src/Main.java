import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static int[][] sorted;
	
	public static void main(String[] args) {
//		문제
//		2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. 
//		(-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
//
//		출력
//		첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
//
//		예제 입력 1 
//		5
//		3 4
//		1 1
//		1 -1
//		2 2
//		3 3
//
//		예제 출력 1 
//		1 -1
//		1 1
//		2 2
//		3 3
//		3 4		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			
			int[][] values = new int[N][2];
			String[] temp;
			int[] value;
			// 값 입력
			for (int i = 0; i < N; i++) {
				temp = br.readLine().split(" ");
				value = new int[2];
				for (int j = 0; j < 2; j++) {
					value[j] = Integer.parseInt(temp[j]);
				}
				values[i] = value;
			}

			// Bubble Sort
//			int[] tmp;
//			for (int i = 0; i < N; i++) {
//				for (int j = 0; j < N - 1 - i; j++) {
//					if (values[j][0] > values[j + 1][0] 
//							|| (values[j][0] == values[j + 1][0] && values[j][1] > values[j + 1][1])) {
//						tmp = values[j];
//						values[j] = values[j + 1];
//						values[j + 1] = tmp;
//					}
//				}
//			}

			// Merge Sort
			sorted = new int[N][2];
			merge_sort(values, 0, N - 1);
			
			for (int i = 0; i < N; i++) {
				bw.write(String.valueOf(values[i][0]) + " " + String.valueOf(values[i][1]));
				bw.newLine();
			}
			bw.flush();
		} catch (Exception e) {
		}
	}

	private static void merge_sort(int[][] values, int left, int right) {
		int mid;
		
		if (left < right) {
			mid = (right + left) / 2;
			merge_sort(values, left, mid);
			merge_sort(values, mid + 1, right);
			merge(values, left, mid, right);
		}
	}

	private static void merge(int[][] values, int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int k = left;
		
		while(i <= mid && j <= right) {
			if (values[i][0] < values[j][0] 
					|| (values[i][0] == values[j][0]) && values[i][1] <= values[j][1] ) {
				sorted[k++] = values[i++];
			} else {
				sorted[k++] = values[j++];
			}
		}
		
		if (i > mid) {
			for (int l = j; l <= right; l++) 
				sorted[k++] = values[l];
		} else {
			for (int l = i; l <= mid; l++) 
				sorted[k++] = values[l];
		}
		
		for (int l = left; l <= right; l++) {
			values[l] = sorted[l];
		}
	}

}
