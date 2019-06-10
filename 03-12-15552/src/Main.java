import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<String> al = new ArrayList<String>();
		String tmpStr = "";
		
		try {
			while (true) {
				tmpStr = br.readLine();
				if (tmpStr.equals("")) break;
				al.add(tmpStr);
			}	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			for (int i = 1; i <= Integer.parseInt(al.get(0)); i++) {
				String[] values = al.get(i).split(" ");
				String sum = String.valueOf((Integer.parseInt(values[0]) + Integer.parseInt(values[1])));
				
				bw.write(sum);
				bw.newLine();
			}
			
			bw.flush();
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	
}
