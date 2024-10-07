package unit1;

import java.util.Scanner;
/**
 * Description: This program teaches the programmer about Inputing Characters
 * Date: October 3, 2024
 * @author Adam Leung
 */
public class InputChars {
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Declare variables
		char ch1, ch2, ch3;
		//get user input
		System.out.println("Type in any three characters on the keyboard");
		System.out.println("Press <Enter> after each.");
		ch1 = sc.nextLine().charAt(0);
		ch2 = sc.nextLine().charAt(0);
		ch3 = sc.nextLine().charAt(0);
		System.out.println();
		//Calculate and prints output
		System.out.println("Together these 3 letters spell: " + (ch1 + ch2 + ch3));
		sc.close();
	}

}
