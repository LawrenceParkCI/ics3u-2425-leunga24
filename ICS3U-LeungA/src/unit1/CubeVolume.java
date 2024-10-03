package unit1;

import java.util.Scanner;
/**
 * Description: This program calculates the volume of a cube
 * Date: October 2, 2024
 * @author Adam Leung
 */
public class CubeVolume {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		//declare variables
		int length, width, depth;
		
		//get user input
		System.out.println("Volume PROGRAM");
		System.out.print("Type in the length of the cube and <Enter>: ");
		length = sc.nextInt();
		
		System.out.print("Type in the width of the cube and <Enter>: ");
		width = sc.nextInt();
		
		System.out.print("Type in the depth of the cube and <Enter>: ");
		depth = sc.nextInt();
		
		//calculate the volume
		int volume = length * width * depth;
		
		//print the output
		System.out.println("The volume of your cube is " + volume);
		sc.close();
	}

}
