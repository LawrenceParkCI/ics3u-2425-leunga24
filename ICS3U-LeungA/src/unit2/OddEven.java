package unit2;

import java.util.Scanner;
/**
 * Description: This program tests to see if the integer is an odd or an even number
 * Date: November 4, 2024
 * @author Adam Leung
 */
public class OddEven {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		//receives input
		int integer;
		System.out.print("Type in any integer:");
		integer = sc.nextInt();

		//Calculates and displays output
		if(integer % 2 == 0) {
			System.out.println(integer + " is an even integer");
		}
		else {
			System.out.println(integer + " is an odd integer");
		}
		sc.close();
	}

}
