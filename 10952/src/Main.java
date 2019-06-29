import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		/*
		 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
		 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		 * �Է��� ���������� 0 �� ���� ���´�.
		 * �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
		 * 
		 * 1 1
		 * 2 3
		 * 3 4
		 * 9 8
		 * 5 2
		 * 0 0
		 * 
		 * 2
		 * 5
		 * 7
		 * 17
		 * 7
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String temp = "";
		String[] nums = new String[2];
		
		while(!(temp =br.readLine()).equals("0 0")) {
			nums = temp.split(" ");
			bw.write(String.valueOf(Integer.parseInt(nums[0]) + Integer.parseInt(nums[1])));
			bw.newLine();
		}
		
		bw.flush();
	}
	
}