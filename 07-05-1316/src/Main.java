
public class Main {

	public static void main(String[] args) {
		/*
		 * �׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�. ���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������, aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.
		 * �ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ù° �ٿ� �ܾ��� ���� N�� ���´�. N�� 100���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� N���� �ٿ� �ܾ ���´�. �ܾ�� ���ĺ� �ҹ��ڷθ� �Ǿ��ְ� �ߺ����� ������, ���̴� �ִ� 100�̴�.
		 * ù° �ٿ� �׷� �ܾ��� ������ ����Ѵ�.
		 * 
		 * 3
		 * happy
		 * new
		 * year
		 * 
		 * 3
		 */
		
		String a = "test";
		String checked = "";
		int groupCnt = 0;
		String position = "";
		
		for (int i = 0; i < a.length(); i++) {
			if (checked.contains(String.valueOf(a.charAt(i)))) continue;
			
			position = "";
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j)) {
					position = position.concat("1");
				} else {
					position = position.concat("0");
				}
			}
			checked = checked.concat(String.valueOf(a.charAt(i)));
			
			if (position.indexOf(a.charAt(i))) {
				
			}
					
			System.out.println(position);
		}
		
	}
	
}
