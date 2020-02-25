import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
//		문제
//		베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
//
//		이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
//
//		예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
//
//		n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 
//
//		입력
//		입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하며, 한 줄로 이루어져 있다. (n ≤ 123456)
//
//		입력의 마지막에는 0이 주어진다.
//
//		출력
//		각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
//
//		예제 입력 1 
//		1
//		10
//		13
//		100
//		1000
//		10000
//		100000
//		0
//		예제 출력 1 
//		1
//		4
//		3
//		21
//		135
//		1033
//		8392
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Integer tmp;
		ArrayList<Integer> inputList = new ArrayList<Integer>(0);
		ArrayList<Boolean> primeList;
		int max = 0;
		int cnt = 0;
		
		try {
			// 입력 값 저장
			while (true) {
				tmp = Integer.parseInt(br.readLine());
				if (tmp == 0) break;
				if (max < tmp * 2) max = tmp * 2;
				
				inputList.add(tmp);
			}

			// 소수 리스트 생성
			primeList = new ArrayList<Boolean>(max + 1);
			
			primeList.add(false);
			primeList.add(false);
			
			for (int i = 2; i <= max; i++) 
				primeList.add(true);

			for (int i = 2; i * i <= max; i++) {
				if (primeList.get(i))
					for (int j = i * 2; j <= max; j += i) 
						primeList.set(j, false);
			}
			
			// 소수 출력
			for (int i = 0; i < inputList.size(); i++) {
				cnt = 0;
				for (int j = inputList.get(i) + 1; j <= 2 * inputList.get(i); j++) {
					if(primeList.get(j)) 
						cnt++;
				}
				if (cnt == 0) continue;
				
				bw.write(String.valueOf(cnt));
				if (i != inputList.size()) bw.newLine(); 
			}

			bw.flush();
		} catch (Exception e) {
		}
	}

}
