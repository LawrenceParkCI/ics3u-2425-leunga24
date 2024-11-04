package unit2;

import java.util.Scanner;
/**
 * Description: This program tests to see if the integer is positive or negative and if it is divisible by 7
 * Date: November 4, 2024
 * @author Adam Leung
 */
public class PositiveNegative {
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
		if(integer >=  0) {
			System.out.println(integer + " is a positive integer");
		}
		else {
			System.out.println(integer + " is a negative integer");
		}
		if(integer %  7 == 0) {
			System.out.println(integer + " is divisible by 7");
		}
		else {
			System.out.println(integer + " is not divisible by 7");
		}
		sc.close();
	}

}
