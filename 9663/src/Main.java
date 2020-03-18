import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
//	문제
//	N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.
//
//	N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.
//
//	입력
//	첫째 줄에 N이 주어진다. (1 ≤ N < 15)
//
//	출력
//	첫째 줄에 퀸 N개를 서로 공격할 수 없게 놓는 경우의 수를 출력한다.
//
//	예제 입력 1 
//	8
//	예제 출력 1 
//	92
	
	static int[] table;
	static int cnt;
	static int N;
	
	public static void main(String[] args) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
			
			table = new int[N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					table[j] = -1;
				}
				table[0] = i;
				dfs(0);
			}
			
			bw.write(String.valueOf(cnt));
			bw.flush();
		} catch (Exception e) {
		}
	}

	private static void dfs(int row) {
		if (row == N - 1) {
			cnt++;
			return;
		}

		for (int i = 0; i < N; i++) {
			table[row + 1] = i;
			if (isPossible(row + 1)) {
				dfs(row + 1);
			} else {
				table[row + 1] = -1;
			}
		}
	}

	private static boolean isPossible(int row) {
		for (int i = 0; i < row; i++) {
			if (table[row] == table[i] || Math.abs(row - i) == Math.abs(table[row] - table[i])) {
				return false;
			}
		}

		return true;
	}

}
