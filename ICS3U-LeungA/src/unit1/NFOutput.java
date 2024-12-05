package unit1;
import java.text.NumberFormat;
import java.util.Scanner;
/**
 * Description: This program teaches me about NumberFormat
 * Date: October 17, 2024
 * @author Adam Leung 
 */
public class NFOutput {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double TAX_RATE = 0.13;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();

		double cost;
		System.out.print("Please enter the cost of an item then press <Enter>: $");
		cost = sc.nextDouble();
		double total = cost + (cost * TAX_RATE);
		System.out.println("The cost of your item with tax is " + money.format(total));
		System.out.println("The tax rate is " + percent.format(TAX_RATE));

		//How can you change how your value is displayed?
		/*I am able to change how the output is displayed by changing the number formats for money and percent. 
		 *I can change the value of the output by changing the value of the tax rate.
		 */

		//What other formats does NumberFormat offer?

		/* getIntegerInstance() - Returns an integer number format for the current default FORMAT locale. The returned number format is configured to round floating point numbers to the nearest integer using half-even rounding.
		 * getNumberInstance() - Returns a general-purpose number format for the current default FORMAT locale. 
		 * getCompactNumberInstance() - Returns a compact number format for the default FORMAT locale with "SHORT" format style.
		 * getCurrencyInstance() - Returns a compact number format for the default FORMAT locale with "SHORT" format style.
		 * getInstance() - Returns a general-purpose number format for the current default FORMAT locale. This is the same as calling getNumberInstance().
		 * getPercentInstance() - Returns a general-purpose number format for the current default FORMAT locale. This is the same as calling getNumberInstance().
		 * 
		 */
		sc.close();
	}

}
