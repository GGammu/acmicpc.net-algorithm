import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/*
		 * �Է� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է��� �־�����. �Է��� �ִ� 100�ٷ� �̷���� �ְ�, ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷���� �ִ�. �� ���� 100���ڸ� ���� ������, �� ���� �־��� ���� �ְ�, �� ���� �� �ڿ� ������ ���� ���� �ִ�.
		 * �Է¹��� �״�� ����Ѵ�.
		 * 
		 *    Hello
		 * 
		 * Baekjoon 
		 * Online Judge
		 * 
		 *    Hello
		 * 
		 * Baekjoon 
		 * Online Judge
		 */
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> values = new ArrayList<String>();
		String value;
		
		try {
			int i = 0;
			while (i++ <= 100) {
				value = sc.nextLine();
				values.add(value);
			}	
		} catch (NoSuchElementException e) {
			for (String string : values) {
				System.out.println(string);
			} 
		}
	}
	
}
