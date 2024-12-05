package unit2;
import java.util.Scanner;
/**
Description: This program counts based on the user's input
Date: December 1, 2024
@author Adam Leung
 */
public class ForChallenge1 {
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		/*
      Create a program that asks for the starting number, the ending number, and how much you should count by. Then print out the numbers using a for loop.  You should be able to count by decimals.
      ie.

      Starting Num: 
        0
      Ending Num: 
        1
      Count by: 
        0.1
      Result: 
        0 0.1 0.2 0.3 0.4 0.5 0.6 0.7 0.8 0.9 1.0
		 */
		//declare variables
		double start, end, count;
		//receive user input
		System.out.print("What number would you like the count to start from?");
		start = sc.nextDouble();
		System.out.print("\n");
		System.out.print("What number would you like the count to end at?");
		end = sc.nextDouble();
		System.out.print("\n");
		System.out.print("What would you like to count by?");
		count = sc.nextDouble();
		System.out.print("\n");
		//for loop using user's input. it can count down or up
		if (end > start) {
			for (double i = start; i <= end; i += count) {
				System.out.println(i);
			}}else {
				for (double i = start; i >= end; i -= count) {
					System.out.println(i);
				}}
		sc.close();
	}
}