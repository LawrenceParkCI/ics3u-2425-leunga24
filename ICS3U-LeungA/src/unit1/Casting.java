package unit1;

import java.util.Scanner;

/**
 * Description: This program teaches me how to use casting
 * Date: October 15, 2024
 * @author Adam Leung
 */
public class Casting {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
		 *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
		 */

		System.out.println("Part 1");

		int intNum;
		intNum = 10;

		double doubleNum;

		//implicit casting
		doubleNum = intNum;

		//What type of data is printed here? Why?
		System.out.println(doubleNum);
		//The data printed here remains a floating point (double). This is because only the variable on the left of the equal sign transforms to a new data type. This means intNum is now a double and doubleNum stays a double

		//can you explain what is happening in this code?
		doubleNum = doubleNum + 2.2;
		//The doubleNum value is changing and it changes by 2.2

		//explicit casting
		intNum = (int) doubleNum;

		//What type of data is printed here? Why?
		System.out.println(intNum);
		//The data printed out is an integer because the data type (int) is typed out telling that doubleNum is now an integer which will make intNum an integer as well
		/*
    Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      int to double
      double to int
      int to long
      long to int
    Why do you think these are implicit/explicit? (Hint: Think about the size of each data and the type of data)
		 */

		doubleNum = (double) intNum;
		System.out.println(doubleNum);
		intNum = (int) doubleNum;
		System.out.println(intNum);
		doubleNum = (long) intNum;
		System.out.println(doubleNum);
		intNum = (int) doubleNum;
		System.out.println(intNum);

		System.out.println("Part 2");

		//understanding what you can do with casting, can you round the following variable to the nearest 10th?
		double myNum;

		Scanner in = new Scanner(System.in);
		System.out.println("Give me decimal number up to the hundredth");

		//code
		myNum = in.nextDouble();

		System.out.print("Rounding down to the nearest tenth, it is: ");
		myNum = myNum * 10;
		myNum= Math.rint(myNum);
		myNum = myNum / 10;
		System.out.println(myNum);


		in.close();
	}
}