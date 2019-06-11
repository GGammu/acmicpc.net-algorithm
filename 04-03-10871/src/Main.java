import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] firstValues = null;
		String[] secondValues = null;
		
		try {
			firstValues = br.readLine().split(" ");
			secondValues = br.readLine().split(" ");
			
			for (int i = 0; i < Integer.parseInt(firstValues[0]); i++) {
				if (Integer.parseInt(secondValues[i]) >= Integer.parseInt(firstValues[1])) continue;
				
				bw.write(secondValues[i] + " ");
			}
			
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
