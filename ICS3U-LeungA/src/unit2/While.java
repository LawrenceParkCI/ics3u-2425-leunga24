package unit2;
import java.util.Scanner;
/**
Description: This program teaches the programmer about while loops
Date: November 27, 2024
@author Adam Leung
 */
public class While {
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//Why do you think I coded it this way?
		//Because you only wanted to display the line above once and the other lines as many times of how many people there are

		//Why do you think the variable is declared here?
		//It is declared here because the code wants it to be repeated for every person 

		//Run the code Using the debugger. 
		//Explain the code in your own words
		//The code asks for amount of people and then asks for the names of those people and displays "Welcome," + their name until every single person as greeted

		//What code is repeated?
		//The line "What is this person's name", the name variable being declared, displaying "welcome," + their name and minusing the variable numPeople by 1

		//When does it decide whether to repeat or not?
		//It will keep repeating until the variable numPeople is 0 

		//What is the condition for repeating?
		//The while condition


		//What is the difference between a while loop and a do-while loop?
		//A while loop checks the condition before executing statements and a do-while loop executes the statements at least once before checking the condition


		//Create a while loop that asks for a word, 
		//and prints it out 20 times.
		//I removed the code above to make the loop below clearer 
		int num = 0;
		String word;
		System.out.print("Write any word?");
		word = in.nextLine();
		while (num < 20) {
			System.out.println(word);
			num = num + 1;
		}
		in.close();
	}
}