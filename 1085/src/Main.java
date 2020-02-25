import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) {
//		문제
//		한수는 지금 (x, y)에 있다. 직사각형의 왼쪽 아래 꼭짓점은 (0, 0)에 있고, 오른쪽 위 꼭짓점은 (w, h)에 있다. 
//		직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 x y w h가 주어진다. w와 h는 1,000보다 작거나 같은 자연수이고, x는 1보다 크거나 같고, w-1보다 작거나 같은 자연수이고, 
//		y는 1보다 크거나 같고, h-1보다 작거나 같은 자연수이다.
//
//		출력
//		첫째 줄에 문제의 정답을 출력한다.
//
//		예제 입력 1 
//		6 2 10 3
//
//		예제 출력 1 
//		1		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String tmp = br.readLine();
			String[] values = tmp.split(" ");
			int x = Integer.parseInt(values[0]);
			int y = Integer.parseInt(values[1]);
			int w = Integer.parseInt(values[2]);
			int h = Integer.parseInt(values[3]);
			
			int disX = x > w - x ? w - x : x;
			int disY = y > h - y ? h - y : y;
		
			if (disX > disY) 
				bw.write(String.valueOf(disY));
			else
				bw.write(String.valueOf(disX));
			bw.flush();
		} catch (Exception e) {
		}
	}

}
