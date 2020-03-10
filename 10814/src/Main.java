import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
//		문제
//		온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 
//		이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
//		둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다. 
//		나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다. 
//		입력은 가입한 순서로 주어진다.
//
//		출력
//		첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.
//
//		예제 입력 1 
//		3
//		21 Junkyu
//		21 Dohyun
//		20 Sunyoung
//
//		예제 출력 1 
//		20 Sunyoung
//		21 Junkyu
//		21 Dohyun		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N;
		User[] users;  
		String[] temp;
		
		try {
			N = Integer.parseInt(br.readLine());
			users = new User[N];
			
			for (int i = 0; i < N; i++) {
				temp = br.readLine().split(" ");
				users[i] = new User();
				users[i].setSeq(i);
				users[i].setAge(Integer.parseInt(temp[0]));
				users[i].setName(temp[1]);
			}
			
			heapSort(users);
			
			for (int i = 0; i < N; i++) {
				bw.write(users[i].toString());
				bw.newLine();
			}
			bw.flush();
		} catch (Exception e) {
		}
	}

	private static void heapSort(User[] users) {
		User[] sorted = new User[users.length + 1];
		
		for (int i = 1; i <= users.length; i++) {
			maxInesertHeap(sorted, i, users[i - 1]);
		}
		
		for (int i = users.length; i > 0; i--) {
			users[i - 1] = maxDeleteHeap(sorted, i);
		}
	}

	private static User maxDeleteHeap(User[] sorted, int lastIdx) {
		User item = sorted[1];
		User tmp = sorted[lastIdx];
		int parent = 1;
		int child = 2;
		
		sorted[lastIdx] = item;
		while(child < lastIdx) {
			if (child + 1 < lastIdx 
					&& (sorted[child].getAge() < sorted[child + 1].getAge()
							|| (sorted[child].getAge() == sorted[child + 1].getAge() && sorted[child].getSeq() < sorted[child + 1].getSeq())))
				child++;
			
			if (sorted[child].getAge() < tmp.getAge() ||
					(sorted[child].getAge() == tmp.getAge() && sorted[child].getSeq() < tmp.getSeq())) 
				break;

			sorted[parent] = sorted[child];
			parent = child;
			child *= 2;
			
		}
		sorted[parent] = tmp;
		
		return item;
	}

	private static void maxInesertHeap(User[] sorted, int idx, User user) {
		int i = idx;
		
		while(i != 1
				&& (sorted[i / 2].getAge() < user.getAge()
						||	(sorted[i / 2].getAge() == user.getAge() && sorted[i / 2].getSeq() < user.getSeq()))) {
			sorted[i] = sorted[i / 2];
			i /= 2;
		}
		
		sorted[i] = user;
	}

	public static class User {
		private int seq;
		private int age;
		private String name;

		public int getSeq() {
			return seq;
		}

		public void setSeq(int seq) {
			this.seq = seq;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return age + " " + name;
		}
		
	}

}
