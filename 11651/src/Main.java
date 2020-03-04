import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
//		문제
//		2차원 평면 위의 점 N개가 주어진다. 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
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
//		0 4
//		1 2
//		1 -1
//		2 2
//		3 3
//		예제 출력 1 
//
//		1 -1
//		1 2
//		2 2
//		3 3
//		0 4
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int N = Integer.parseInt(br.readLine());
			int[][] values = new int[N][2];
			String[] tmp;
			int[] value;
			
			// 입력 값
			for (int i = 0; i < N; i++) {
				tmp = br.readLine().split(" ");
				value = new int[2];
				value[0] = Integer.parseInt(tmp[0]);
				value[1] = Integer.parseInt(tmp[1]);
				values[i] = value;
			}

			// heap sort
			heap_sort(values);
		
			for (int i = 0; i < values.length; i++) {
				bw.write(String.valueOf(values[i][0]) + " " + String.valueOf(values[i][1]) );
				bw.newLine();
			}
			bw.flush();
		} catch (Exception e) {
		}
	}

	private static void heap_sort(int[][] values) {
		int[][] heap = new int[values.length + 1][2];
		
		for (int i = 1; i <= values.length; i++) {
			maxInsertHeap(heap, i, values[i - 1]);
		}
		
		for (int i = values.length; i >= 1; i--) {
			values[i - 1] = maxDeleteHeap(heap, i);
		}
	}

	private static int[] maxDeleteHeap(int[][] heap, int lastIdx) {
		int[] item = heap[1];
		int[] tmp = heap[lastIdx]; 
		
		int parent = 1;
		int child = 2;
	
		heap[lastIdx] = item;
		while(child < lastIdx) {
			if (child + 1 < lastIdx && (
					heap[child][1] < heap[child + 1][1] 
					|| (heap[child][1] == heap[child + 1][1] && heap[child][0] < heap[child + 1][0]))) {
				child++;
			}
			if (tmp[1] > heap[child][1] || (tmp[1] == heap[child][1] && tmp[0] > heap[child][0])) {
				break;
			}

			heap[parent] = heap[child];
			parent = child;
			child = child * 2;
		}
		
		heap[parent] = tmp;

		return item;
	}

	private static void maxInsertHeap(int[][] heap, int newIdx, int[] element) {
		int i = newIdx;
		
		while(i != 1 
				&& ((element[1] > heap[i / 2][1]) 
						|| (element[1] == heap[i / 2][1] && element[0] > heap[i / 2][0]))) {
			heap[i] = heap[i/2];
			i /= 2;
		}
		
		heap[i] = element;
	}

}
