package unit2;

import java.util.Scanner;
/**
Description: This Program teaches the programmer about do-while Loops
Date: November 26, 2024
@author Adam Leung
 */
public class DoWhile {
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
   A loop is another control structure that allows for repetition. It 
   does not make a decision on which branch to go on, like the 
   conditional.
   It makes a decision whether it should go back to redo a set of code.
		 */
		Scanner in = new Scanner(System.in);

		//Run the code. Explain the code in your own words
		//The code is repeated until the specific word or phrase is inputed. In this case it repeats "What is your name?" every time until you input the name Mr. Lee

		//What code is repeated?
		//"What is your name" is repeated when the name Mr. Lee is not inputed

		//When does it decide whether to repeat or not?
		//When the input doesn't equal the string "Mr. Lee"

		//What is the condition for repeating?
		//The While condition 


		/*
    Note:Pay attention to the brackets, and the semicolon
		 */

		/*
     When constructing a loop, there are many strategies. I like to 
     break down the problems this way:
       1. What commands am I going to repeat?
       2. How many times/until when will I repeat the code?
		 */

		//Create a do-while loop that asks for a word, and 
		//prints it out 20 times.
		//I removed the code above to make the loop below clearer 
		String word;
		int counter = 0;
		System.out.print("Type in any word:");
		word = in.nextLine();
		do {
			System.out.println(word);
			counter += 1;
		} while (counter < 20);

		in.close();
	}
}
