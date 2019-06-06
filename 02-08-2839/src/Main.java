import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int needSugar;
		int bigBag = 5;
		int smallBag = 3;
		int remainsugar = 0;
		
		int bagCnt = 0;
		
		try {
			needSugar = Integer.parseInt(br.readLine());
			
			for (int i = (needSugar / bigBag) ; i >= 0; i--) {
				remainsugar = needSugar;
				
				bagCnt = i;
				
				remainsugar -= bigBag * i;
				
				bagCnt +=  remainsugar / smallBag;
				remainsugar = remainsugar % smallBag;
				
				if (remainsugar == 0) break;
			}
			
			if (remainsugar != 0) {
				System.out.println(-1);
			} else {
				System.out.println(bagCnt);				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
