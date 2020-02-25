import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
//		문제
//		세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
//
//		입력
//		세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
//
//		출력
//		직사각형의 네 번째 점의 좌표를 출력한다.
//
//		예제 입력 1 
//		30 20
//		10 10
//		10 20
//		
//		예제 출력 1 
//		30 10
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String tmp = "";
			String[] values;
			
			Integer[] x = new Integer[3];
			Integer[] y = new Integer[3];

			for (int i = 0; i < 3; i++) {
				tmp = br.readLine();
				values = tmp.split(" ");
				
				x[i] = Integer.parseInt(values[0]);
				y[i] = Integer.parseInt(values[1]);
			}
			
			if (x[0].equals(x[1])) 
				bw.write(String.valueOf(x[2]) + " ");
			else if (x[1].equals(x[2]))
				bw.write(String.valueOf(x[0]) + " ");
			else
				bw.write(String.valueOf(x[1]) + " ");

			if (y[0].equals(y[1])) 
				bw.write(String.valueOf(y[2]));
			else if (y[1].equals(y[2]))
				bw.write(String.valueOf(y[0]));
			else
				bw.write(String.valueOf(y[1]));
			
			
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
