package unit1;

import java.util.Scanner;

/**
 * Description: This program 
 * Date: October 3, 2024
 * @author Adam Leung
 */
public class InputFP {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		double num1, num2;
		// Receives user input
		System.out.println("Floating-Point");
		System.out.print("Type in the number and <Enter>: ");
		num1 = sc.nextDouble();
		
		System.out.print("Type in the number and <Enter>: ");
		num2 = sc.nextDouble();
		
		//Print the output
		System.out.println();
		System.out.println("The first number entered was " + num1);
		System.out.println("The second number entered was " + num2);
		sc.close();
	}

}
