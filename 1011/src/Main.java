import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		/*
		 * �����̴� � ����, ���� ���� �ٸ� �༺������ �η����� ��ư� �� �ִ� �̷��� ������ �Ͼ���. �׸��� �װ� ������� ���� ���� ���� ���� �� 23���� ���� ����, ���� �ֿ��� ASNA ���� ����簡 �Ǿ� ���ο� ���迡 ���� ���� ���� ������ ������ ��ٸ��� �ִ�.
		 * �װ� ž���ϰ� �� ���ּ��� Alpha Centauri��� ���ο� �η��� �����ڸ��� ��ô�ϱ� ���� ��Ը� ��Ȱ ���� �ý����� ž���ϰ� �ֱ� ������, �� ũ��� ������ ��û�� ������ �ֽű������ �� �����Ͽ� ������ �����̵� ��ġ�� ž���Ͽ���. ������ �� �����̵� ��ġ�� �̵� �Ÿ��� �ް��ϰ� �ø� ��� ��迡 �ɰ��� ������ �߻��ϴ� ������ �־, ���� �۵��ñ⿡ k������ �̵��Ͽ��� ���� k-1 , k Ȥ�� k+1 ���⸸�� �ٽ� �̵��� �� �ִ�. ���� ���, �� ��ġ�� ó�� �۵���ų ��� -1 , 0 , 1 ������ �̷л� �̵��� �� ������ ��ǻ� ���� Ȥ�� 0 �Ÿ���ŭ�� �̵��� �ǹ̰� �����Ƿ� 1 ������ �̵��� �� ������, �� �������� 0 , 1 , 2 ������ �̵��� �� �ִ� ���̴�. ( ���⼭ �ٽ� 2������ �̵��Ѵٸ� ���� �ñ⿣ 1, 2, 3 ������ �̵��� �� �ִ�. )
		 * ������� �����̵� ��ġ �۵����� ������ �Ҹ� ũ�ٴ� ���� �� �˰� �ֱ� ������ x�������� y������ ���� �ּ����� �۵� Ƚ���� �̵��Ϸ� �Ѵ�. ������ y������ �����ؼ��� ���� �̵���ġ�� �������� ���Ͽ� y������ �����ϱ� �ٷ� ������ �̵��Ÿ��� �ݵ�� 1�������� �Ϸ� �Ѵ�.
		 * ������� ���� x�������� ��Ȯ�� y�������� �̵��ϴµ� �ʿ��� ���� �̵� ��ġ �۵� Ƚ���� �ּڰ��� ���ϴ� ���α׷��� �ۼ��϶�.
		 * �Է��� ù �ٿ��� �׽�Ʈ���̽��� ���� T�� �־�����. ������ �׽�Ʈ ���̽��� ���� ���� ��ġ x �� ��ǥ ��ġ y �� ������ �־�����, x�� �׻� y���� ���� ���� ���´�. ( 0 �� x < y < 231)
		 * �� �׽�Ʈ ���̽��� ���� x�������κ��� y�������� ��Ȯ�� �����ϴµ� �ʿ��� �ּ����� �����̵� ��ġ �۵� ȸ���� ����Ѵ�.
		 * 
		 * 3
		 * 0 3
		 * 1 5
		 * 45 50
		 * 
		 * 3
		 * 3
		 * 4
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		String[] value = new String[2];
		long X = 0;
		long Y = 0;
		long tmp;
		long distance = 0;
		long speed = 0;
		long lastspeed = 0;
		long cnt = 1;

		for (int i = 0; i < T; i++) {
			value = br.readLine().split(" ");
			
			X = Long.parseLong(value[0]);
			Y = Long.parseLong(value[1]);
			
			distance = Y - X;
			speed = 0;
			lastspeed = 0;
			
			while(true) {
				speed++;
				tmp = (long)Math.pow(speed, 2);
				
				if (distance >= tmp) {
					lastspeed = speed;
					continue;
				} else {
					cnt = 2 * lastspeed - 1 + (long)Math.ceil((distance - Math.pow(lastspeed, 2)) / lastspeed);
					bw.write(String.valueOf(cnt));
					break;
				}
			}

			bw.newLine();
		}
		
		bw.flush();

	}
	
}
