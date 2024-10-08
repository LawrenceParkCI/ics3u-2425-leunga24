package unit1;

import java.util.Scanner;
/**
 * Description: This program calculates the price of a carpet
 * Date: October 8, 2024
 * @author Adam Leung
 */
public class Carpet {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		double length, width;
		double cost;
		
		
		//Get user input
		System.out.println("Carpet Cost:");
		System.out.print("Type in the length of the carpet in meters and <Enter>: ");
		length = sc.nextDouble();
		
		System.out.print("Type in the width of the carpet in meters and <Enter>: ");
		width = sc.nextDouble();
		
		System.out.println("Type in the cost of the carpet per square-meter and <Enter>: ");
		cost = sc.nextDouble();
		
		//Output
		System.out.println("The total cost of the carpet is $" + (length * width * cost));
		
		
		sc.close();
		
	}

}
