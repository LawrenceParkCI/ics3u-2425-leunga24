package unit2;
/**
Description: This program teaches the user how to use variables in loops and how to calculate sums using loops
Date: December 1, 2024
@author Adam Leung
 */
public class For2 {
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		//Recall - create a for loop printing 1 to 10:
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("\n");

		//though we are repeating a certain number of times, we can use variables in our for loops as well

		int times = 20;

		for (int i = 15; i < times; i++) {
			System.out.println(i);
		}
		System.out.println("\n");

		//In addition, the counter doesn't necessarily have to be an integer
		double increment = 0.1;
		for (double i = 0; i < 2; i += increment) {
			System.out.println(i);
		}
		System.out.println("\n");
		//create a variable to store the starting number, and use it in a for loop. Be able to use a double value:
		double start = 0.5;
		for (double i = start; i < 4.5; i += start) {
			System.out.println(i);
		}


		System.out.println("\n");
		//Look at the following code. Explain what is happening?
		//45 is displayed because sum is equal to 0 and the 'for loop' calculates i which goes up by 1 every time and every time the loop happens the new value of i gets added to the sum until the loop ends. It goes 1+2+3+4+5+6+7+8+9 which is equal to 45.
		int sum = 0; 

		for (int i = 1; i < 10; i++) {
			sum += i;
		}

		System.out.println(sum);



	}
}