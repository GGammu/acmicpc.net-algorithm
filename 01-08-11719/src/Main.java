import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
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
