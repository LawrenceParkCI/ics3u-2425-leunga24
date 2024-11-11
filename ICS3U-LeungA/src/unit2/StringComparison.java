package unit2;
import java.util.Scanner;
/**
 * Description: Teaches the programmer how to use compareTo(), equals() and equalsIgnoreCase()
 * Date: November 11, 2024
 * @author Adam Leung
 */
class StringComparison {
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String answer;

		System.out.println("What is the capital of Ontario?");
		answer = in.nextLine();

		if (answer == "Toronto") {
			System.out.println("Correct!");
		} else {
			System.out.println("Sorry, that's incorrect.");
		}

		//Run the code. What happens when you type the correct answer? The incorrect answer?
		//Prints "Sorry, that's incorrect" both times
		/*
      Strings are objects, not primitives and as such are a 
		 *reference* data type. These variables hold an address 
      to the value. (Scanner is also a reference data type)

      int, double, char, etc. are all *primitive* data types. 
      These variables hold the actual value.

      Look at the website:
      https://www.javatpoint.com/string-comparison-in-java

      Demonstrate the use of the functions:
        .compareTo()
        .equals()
        .equalsIgnoreCase()
		 */
		//compareTo()
		String s1, s2, s3, s4;
		s1 = "man";
		s2 = "MaN";
		s3 = "woman";
		s4 = "woman";
		System.out.println(s1.compareTo(s2));

		//equals()
		System.out.println(s3.equals(s4));

		//equalsIgnoreCase()
		System.out.println(s1.equalsIgnoreCase(s2));

		//What values does compareTo() return? How can we 
		//interpret the value?
		//compareTo() returns 1 of three things, a positive number, a negative number or 0. If s1=s2 it will display 0, if s1>s2 it will display a positive number and if s1<s2 it will display a negative number.

		//what value does equals() and equalsIgnoreCase() return? 
		//It returns either true or false
		//What is the difference between these two functions?
		//The difference is that equalsIgnoreCase() changes all letters in a string to lower case hence "IgnoreCase" and equals() keeps the string value unchanged
	}
}