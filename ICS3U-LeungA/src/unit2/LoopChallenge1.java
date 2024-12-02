package unit2;
import java.util.Scanner;
/**
Description: This program asks for a password and you only have 3 attempts 
Date: December 1, 2024
@author Adam Leung
 */
public class LoopChallenge1 {
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		/*
     Create a program that will ask for the password.  If they answer 
     incorrectly, tell them, and repeat. If they answer correctly, 
     welcome them in.

     Extra: if they don't give a proper answer within 3 
     Decide on whether you should use the while or do while loop.
		 */
		//declaring variables
		String password;	
		int counter = 0;
		int attempts = 3;
		//I decided to use a do while loop
		do {
			//asks for password
			System.out.print("What is the password.");
			password = in.nextLine();
			//if the password isn't BANANA then is displays wrong password and displays amount of attempts left
			if (!password.equals("BANANA")) {
				counter =  counter + 1;
				attempts = attempts -1;
				System.out.println("Incorrect password. You have " + attempts + " attempts left.");
			}
			//displays "Welcome in banana lover!" when password typed in is BANANA
			else {
				System.out.println("Welcome in banana lover!");
			}
			//loop keeps going when the password typed in isn't "BANANA" and while counter is below 3
		} while (!password.equals("BANANA") && (counter < 3));
		//displays message when all attempts are used up
		if (counter == 3) {
			System.out.println("You are not welcome in!");
		}
		in.close();
	}
}