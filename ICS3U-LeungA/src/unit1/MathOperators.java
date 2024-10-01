package unit1;
/**
 * Description: This program teaches the programmer how to use Math Operators in java
 * Date: October 1, 2024
 * @author Adam Leung
 */
public class MathOperators {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		/*
		         Pre: Kind of Math, but not really
		         What do you notice is happening?
		 */

		System.out.println("Butter" + "fly");

		System.out.println("1 + 2 + 3 + 4 + 5");

		System.out.println(1 + 2 + 3 + 4 + 5);

		System.out.println(1 + 2 + "3 + 4 + 5");

		System.out.println("1 + 2 + 3" + 4 + 5);


		//Why do you think the last two outputs act so differently?
		System.out.println("The last two outputs act so differently because the placement of the quotations are different");

		//Summary: What are two possible roles of the + operator?


		/*
		         Part 1 
		         Figure out what is the meaning of each operator. Use print statements
		         to verify your answer and explain.
		 */

		// + means:
		System.out.println("The operator \"+\" means addition");
		// - means:
		System.out.println("The operator \"-\" means subtraction");
		// * means:
		System.out.println("The operator \"*\" means multiplication");
		// / means: 
		System.out.println("The operator \"/\" means division");


		//Print the following expression: (3 + 2) * 5
		System.out.println((3 + 2) * 5);
		//Print the following expression: 3 + 2 * 5
		System.out.println(3 + 2 * 5);
		//Was this expected? Why or why not?
		System.out.println("The system uses order of operations which was expected");
		/*
		         Part 2 - Calculate Using Operators
		         Print out, using one println statement, what 45 degrees Celsius is in Fahrenheit
		       
		         Print out, using a print and a println statement, what 900 Fahrenheit is in Celsius
		 */     
		double celsius;
		celsius= 45.0;
		System.out.println(celsius * 9.0/5.0 + 32.0);
		
		double fahrenheit;
		fahrenheit= 900.0;
		System.out.println((fahrenheit - 32.0) * 5.0/9.0 );
		/*
		         Part 3
		         Figure out what is the meaning of % as a math operator. Use print statements
		         to check your answer.
		 */

		//I think % means:
		System.out.println("I think \"%\" means the remaining interger after doing interger division");
		int number;
		number=15;
		System.out.println(number % 4);
		System.out.println("The previous equation equals 3 which would be the remainder after diving 15 by 4, making my previous statment correct");
		


	}

}
