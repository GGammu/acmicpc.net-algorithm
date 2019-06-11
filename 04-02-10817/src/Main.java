import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] values = null;
		int tmp1 = 0;
		int tmp2 = 0;
		int tmp3 = 0;
		int rtn = 0;
		try {
			values = br.readLine().split(" ");
		
			tmp1 = Integer.parseInt(values[0]);
			tmp2 = Integer.parseInt(values[1]);
			tmp3 = Integer.parseInt(values[2]);
			
			if ((tmp1 <= tmp3 && tmp3 <= tmp2) || (tmp2 <= tmp3 && tmp3 <= tmp1)) {
				rtn = tmp3;
			} else if ((tmp1 <= tmp2 && tmp2 <= tmp3) || (tmp3 <= tmp2 && tmp2 <= tmp1)) {
				rtn = tmp2;
			} else {
				rtn = tmp1;
			}
			
			bw.write(String.valueOf(rtn));
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
