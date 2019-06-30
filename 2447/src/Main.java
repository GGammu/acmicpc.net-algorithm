import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		/* 
		 * ������ ���� ��Ģ�� ������ �ڿ� ���� ��� ������.
		 * ù° �ٿ� N�� �־�����. N�� �׻� 3�� �������� ���̴�. (3, 9, 27, ...) (N=3k, 1 �� k < 8)
		 * ù° �ٺ��� N��° �ٱ��� ���� ����Ѵ�.
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
