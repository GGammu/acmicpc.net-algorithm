import java.util.Scanner;

class Main {
	
	public static void main(String[] args) throws java.io.IOException {
		/*
		 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�.
		 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		 * �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�.
		 * 1 1
		 * 2 3
		 * 3 4
		 * 9 8
		 * 5 2
		 * 
		 * 2
		 * 5
		 * 7
		 * 17
		 * 7 
		 */
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}
	
}