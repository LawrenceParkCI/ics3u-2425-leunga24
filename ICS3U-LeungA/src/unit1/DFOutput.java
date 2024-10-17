package unit1;
/**
 * Description: This program teaches me how to learn about parameters and decimal formatting
 * Date: October 16, 2024
 * @author Adam Leung 
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class DFOutput {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Run the following program with a cost of 10.00.
		//What value is displayed in the output? = 11.3

		final double TAX_RATE = 0.13;
		DecimalFormat money = new DecimalFormat("$#,###,##0.00");
		DecimalFormat percent = new DecimalFormat("#.#%");

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);

		System.out.println("The cost of your item with tax is " + money.format(total));

		//Change the above print statement on line 23 to:
		//System.out.println("The cost of your item with tax is " + money.format(total));
		//Run the program again, how is the output different? Why?

		//The new output is 11.30 and it is different because the money decimal format is different. It contains another decimal point.

		//Modify the parameter for the DecimalFormat on line 15 to be "$0.00"
		//Run the program again with the cost of 10, how is the output different?

		//The new output is $11.30 and the format is different because the output now contains a dollar sign in front of the number

		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Run the program again with the cost of 10, how is the output different?

		//The new output is $11.3 because it doesn't display trailing zeros in decimal numbers

		//Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
		//Calculate 10.50 x 1.13 = $11.865
		//Run the program again with the cost of 10.50, what is happening?

		//The output is $11.87 because it always rounds to 2 decimal places 

		//Modify the parameter for the DecimalFormat on line 15 as you think is appropriate for money.
		//Run the program again with the cost of 123456, what is displayed?

		//The output is $139505.28


		//Modify the parameter for the DecimalFormat on line 15 to be "$#,###,##0.00"
		//Run the program again with the cost of 123456, how is the output different? Explain what is happening.

		//The output is $139,505.28 this is because we are adding comma's to the decimal format 

		//Uncomment the following print line, and run the program with any value for the cost.
		//What value is printed for the TAX_RATE?
		System.out.println("The tax rate is " + percent.format(TAX_RATE));

		//The tax rate is 0.13

		//Change the above print statement to format the TAX_RATE using the percent DecimalFormat instance.
		//Run the program again with any cost, how is the TAX_RATE displayed differently?

		//The tax rate is now 13% because we are converting the tax rate into a percent



		sc.close();
	}

}
