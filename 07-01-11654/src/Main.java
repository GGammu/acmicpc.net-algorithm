import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * ���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� �־����� ��, �־��� ������ �ƽ�Ű �ڵ尪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ���ĺ� �ҹ���, �빮��, ���� 0-9 �� �ϳ��� ù° �ٿ� �־�����.
		 * �Է����� �־��� ������ �ƽ�Ű �ڵ� ���� ����Ѵ�.
		 * 
		 * A
		 * 
		 * 65
		 */
		
		Scanner sc = new Scanner(System.in);
		char value = sc.next().charAt(0);
		int ascii = (int)value;
		
		System.out.println(ascii);
	}
	
}
