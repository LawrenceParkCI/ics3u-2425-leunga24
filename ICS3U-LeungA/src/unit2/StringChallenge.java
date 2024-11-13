package unit2;
import java.util.Scanner;
/**
 * Description: Fun game and teaches the programmer how to use compareTo(), equals(), equalsIgnoreCase(), Explicit and Implicit Casting
 * Date: November 11, 2024
 * @author Adam Leung
 */
public class StringChallenge {
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		//This is for the portfolio

		/*
    Create a program that demonstrates the use of .equals(), .equalsIgnoreCase(), .compareTo().  You should be using if statements for this program.
    Also, include an example of explicit and implicit casting.

    Comment to explain:
      -when you use the different String functions
      -when you are casting and how the value is changed
		 */
		//imported scanner
		Scanner sc = new Scanner (System.in);
		//declaring variables
		String s1, s2, s3, s4, s5, s6;
		//receiving input
		System.out.print("Type in your first name:");
		s1 = sc.next();
		System.out.print("Type in your first name exactly the same way you just did:");
		s2 = sc.next();
		//using if and else statements
		if (s1.compareTo(s2)==0) {//Playing a game by using if statements and compareTo()
			System.out.println("Wow im suprised! You followed the rules! :)");
		}
		else {
			System.out.println("You did not follow the rules! :(");
		}
		//receiving input
		System.out.println();
		System.out.print("Type in your last name in all lower case:");
		s3 = sc.next();
		System.out.print("Type in your last name again but however you would like:");
		s4 = sc.next();
		//using if and else statements
		if (s3.equalsIgnoreCase(s4)) {//Playing a game by using if statements and equalsIgnoreCase()
			System.out.println("You are a good citizen! You will make it to places in life! :)");
		}
		else {
			System.out.println("You didn't type your last name in all lowercase when I asked! :(");
		}
		//receiving input
		System.out.println();
		System.out.print("Type in your favourite colour:");
		s5 = sc.next();
		System.out.print("Type in your least favourite colour:");
		s6 = sc.next();
		//using if, else if, and else statements
		if (s5.compareTo(s6)>0) {//Playing a game by using if statements and compareTo()
			System.out.println("You have good taste! :)");
		}
		else if (s5.equals(s6))	{	//Playing a game by using if statements and equals()
			System.out.println("WHY WOULD YOU TYPE IN THE SAME COLOUR AGAIN!");
		}
		else if(s5.compareTo(s6)<0) {//Playing a game by using if statements and compareTo()
			System.out.println("Your least favourite colour is better than your favourite colour! :(");
		}
		//declaring variables
		int num1, num2;
		String s7;
		s7 = "7";
		//receiving input
		System.out.println();
		System.out.println("Type in your favourite number:");
		num1 = sc.nextInt();
		//displaying out
		System.out.println();
		System.out.println("Your favourite number is " + num1);//implicit casting. The Integer num1 is converted into a string for only this line of code!
		System.out.println("Your favourite number added with my favourite number is " + (num1 + Integer.parseInt(s7)));//explicit casting. I am changing the data type of s7 from a string into an integer!
		System.out.println();
		System.out.println("This is the last question! If you get this right you win the entire game! If you get it wrong you lose the entire game!");
		System.out.print("What is MY favoutire number?");
		num2 = sc.nextInt();
		//using if and else statements
		if (num2 ==7) {
			System.out.println("YOU ARE OFFICIALLY AMAZING!");
		}else {
			System.out.println("I am so dissapointed in you");
				
			}
		sc.close();
		}
		
	}
	