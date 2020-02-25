import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		문제
//		과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 
//		주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
//
//		입력
//		입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다. 
//		각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.
//
//		출력
//		각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.
//
//		예제 입력 1 
//		6 8 10
//		25 52 60
//		5 12 13
//		0 0 0
//		
//		예제 출력 1 
//		right
//		wrong
//		right	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String tmp;
		ArrayList<String> values = new ArrayList<String>();

		try {
			
			while(true) {
				tmp = br.readLine();
				if (tmp.equals("0 0 0"))
					break;
				values.add(tmp);
			}
			
			String[] len;
			int x, y, z;

			for (String value : values) {
				len = value.split(" ");
				x = Integer.parseInt(len[0]);
				y = Integer.parseInt(len[1]);
				z = Integer.parseInt(len[2]);
				
				if (x * x == y * y + z * z) {
					bw.write("right");
				} else if (y * y == x * x + z * z) {
					bw.write("right");
				} else if (z * z == x * x + y * y) {
					bw.write("right");
				} else {
					bw.write("wrong");
				}
				bw.newLine();
			}
			bw.flush();
		} catch (Exception e) {
		}
	}

}
