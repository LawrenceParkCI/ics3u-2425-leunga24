package unit2;
// TODO Auto-generated method stub
/**
		Name: Mr. Lee
		Date: Oct 29, 2021
		Description: Tracing through code
 */
public class Main {
	public static void main(String[] args) {
		int num = 0;
		String word = "Que";

		while (num < 15) {
			System.out.println(word);
			num = num + 1;
		}
		word = word + word;
		while (num > 0) {
			System.out.println(word);
			num = num - 1;
		}
	}
}

