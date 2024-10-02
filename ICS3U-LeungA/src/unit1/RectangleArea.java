package unit1;

import java.util.Scanner;

/**
 * Description: This program calculates the area of a rectangle
 * Date: October 2, 2024
 * @author Adam Leung
 */
public class RectangleArea {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		//declare variables
		int length, width;
		
		//get user input
		System.out.println("AREA PROGRAM");
		System.out.print("Type in the length of the rectangle and <Enter>: ");
		length = sc.nextInt();
		
		System.out.print("Type in the width of the rectangle and <Enter>: ");
		width = sc.nextInt();
		
		//calculate the area
		int area = length * width;
		
		//print the output
		System.out.println("The area of your rectangle is" + area);
		sc.close();
	}

}
