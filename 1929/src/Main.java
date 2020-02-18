import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			String[] input = br.readLine().split(" ");
			int m = Integer.parseInt(input[0]);
			int n = Integer.parseInt(input[1]);
			
			ArrayList<Boolean> list = new ArrayList<Boolean>(n + 1);
			
			list.add(false);
			list.add(false);
			for (int i = 2; i <= n; i++) {
				list.add(true);
			}


		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
