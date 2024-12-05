package unit2;
import java.util.Scanner;
/**
 Description: This program takes a positive number and displays the number's square root
 Date: December 1, 2024
 @author Adam Leung
 */
public class LoopChallenge2 {
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		/*
      Write a program to take the square root of a number typed in by 
      the user. Your program should use a loop to ensure that the number 
      they typed in is positive. If the number is negative, you should 
      print out some sort of warning and make them type it in again.

      You can get the square root of a number n with Math.sqrt(n). Make 
      sure you don't do this until the loop is done and you know for 
      sure you've got a positive number.

      Use the loop that you didn't use in LoopChallenge1
		 */
		//declaring variables
		double num;
		//receiving user input
		System.out.println("Type in any number:");
		num = sc.nextDouble();
		while (num < 0) {
			//changing number from negative to positive
			System.out.println("Warning! Your number is negative. Please make it a positive number.");
			System.out.println("Type in different number:");
			num = sc.nextDouble();
		}
		//displaying the square root of the number
		System.out.println("The square root of your number is " + Math.sqrt(num));
		sc.close();
	}
}