import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		/* 
		 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
		 * 첫째 줄에 N이 주어진다. N은 항상 3의 제곱꼴인 수이다. (3, 9, 27, ...) (N=3k, 1 ≤ k < 8)
		 * 첫째 줄부터 N번째 줄까지 별을 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = sc.nextInt();
		char[][] list = new char[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				list[i][j] = ' ';
			}
		}
		
		draw(list, N, 0, 0);
		
		for (int i = 0; i < N; i++) {
			bw.write(list[i]);
			bw.newLine();
		}
		bw.flush();
	}
	
	private static void draw(char[][] list, int n, int x, int y) {
		int a = n / 3;
		
		if (a == 1) {
			list[x][y] = '*';
			list[x + 1][y] = '*';
			list[x + 2][y] = '*';
			list[x][y + 1] = '*';
			list[x + 2][y + 1] = '*';
			list[x][y + 2] = '*';
			list[x + 1][y + 2] = '*';
			list[x + 2][y + 2] = '*';
		} else {
			draw(list, a, x, y);
			draw(list, a, x + a, y);
			draw(list, a, x + a * 2, y);
			draw(list, a, x, y + a);
			draw(list, a, x + a * 2, y + a);
			draw(list, a, x, y + a * 2);
			draw(list, a, x + a, y + a * 2);
			draw(list, a, x + a * 2, y + a * 2);
		}
	}
	
}
