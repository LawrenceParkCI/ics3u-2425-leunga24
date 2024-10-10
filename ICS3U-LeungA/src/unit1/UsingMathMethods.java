package unit1;

import java.util.Scanner;

/**
 * Description: This program teaches me how to use math methods
 * Date: October 10, 2024
 * @author Adam Leung
 */
public class UsingMathMethods {

	/**
	 * This is the entry point to the program.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;

		System.out.println("Part A");

		//Write code to ask the user for any real number to be input.

		System.out.print("Type in any real number:");
		num = sc.nextDouble();
		//Store their input into the num variable

		System.out.println(Math.round(num)); 
		System.out.println(Math.rint(num));
		System.out.println(Math.sqrt(num));
		System.out.println(Math.abs(num));
		System.out.println(Math.pow(num, 2));
		System.out.println(Math.pow(num,  num));
		System.out.println(Math.pow(num, 3));
		/*
		 * Run the program and write down the output that is produced
		 * when each of the following values are input:
		 * 
		 *      num = 16.75  | num = 4.0  | num = -23.45
		 *      -----------------------------------------------
		 * Math.round(num) 17|4|-23
		 * Math.rint(num) 17.0|4.0|-23.0
		 * Math.sqrt(num) 4.092676385936225|2.0|NaN
		 * Math.abs(num) 16.75|4.0|23.45
		 * Math.pow(num, 2) 280.5625|16.0|549.9024999999999
		 * Math.pow(num, num) 3.178689376746782E20|256.0|NaN
		 * Math.pow(num, 3)4699.421875|64.0|-12895.213624999999
		 * 
		 */

		//Why does the last value(-23.45) give strange output for Math.sqrt(num)?
		//Nan stands for Not a number!

		//In your own words describe what the following Math methods does
		/*
		 * round: Round, rounds the number to the closest integer excluding the decimal point
		 * rint: Rint rounds the number to the closest integer but it keeps the decimal point
		 * sqrt: It calculates the square root of the number
		 * abs: Calculates the Absolute value
		 * pow: Calculates using exponents and it leaves it as floating point
		 */

		//The methods round, sqrt and abs only have one parameter (which is in the brackets).
		//Why does the pow method have 2 parameters? Explain the purpose of these 2 parameters.
		
		System.out.println("The pow method has 2 parameters beacuse one digit is the number and the other is the exponent for that number. The first digit is the number and the second is the exponent. eg. (2,3) this is saying 2 to the power of 3 which is 2 x 2 x 2 = 8");


		System.out.println("Part B");
		//Ask the user for any real number and an integer to be input. Display the real number,
		
		double real, integer;
		
		System.out.print("Type in any real number:");
		real = sc.nextDouble();
		
		System.out.print("Type in any integer:");
		integer = sc.nextDouble();
		
		
		
		//and its square root. Also determine and display the real number raised to the integer power.
		
		//Use suitable headings, displaying the results across the screen.\
		//
		//Eg. If the real number 13.5 nad the integer 2 are input, display
		//REAL NUMBER 		SQUARE ROOT  	RAISED TO POWER 2 <- display power here
		//   13.5     		3.6742           182.25
		System.out.printf("\n%25s%25s%25s", "REAL NUMBER", "SQUARE ROOT", "RAISED TO POWER " + integer);
		System.out.printf("\n%25s%25s%25s", real, Math.sqrt(real), Math.pow(real, integer));
		


		//Write down the results produced by your program when the real number 7.8985 and
		//the integer 3 are input.
		
		// REAL NUMBER = 7.8985       SQUARE ROOT = 2.8104270138183627         RAISED TO POWER 3 = 492.75820832162503
                



		//Change your program so that instead of inputting an integer power, a real number
		//power can be input.
		//Write down the results produced by your program when the following are input:
		//a) the number 16 and the real number power 0.5
		// REAL NUMBER = 16.0      SQUARE ROOT = 4.0     RAISED TO POWER 0.5 = 4.0
                     
      	//b) the number 8 and the real number power 0.33
		//   REAL NUMBER = 8.0           SQUARE ROOT = 2.8284271247461903    RAISED TO POWER 0.33 = 1.9861849908740719
                     
		//Does your program give a different answer if 0.3333333 is input instead of 0.33 for the power?
		//Yes the raised to power 0.3333333 changes from 1.986 to 1.99999 making the answer more precise
		
		sc.close();



	}

}


