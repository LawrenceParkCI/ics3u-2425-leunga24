package unit1;
/**
 * Description: This program calculates Net Pay
 * Date: October 7, 2024
 * @author Adam Leung
 */
public class NetPay {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {

		// input
		double hours;
		hours = 40.0;

		double wage;
		wage = 5.00;

		double insurance;
		insurance = 2.00;

		double tax;
		tax = 0.22;

		//output
		double netPay; 
		System.out.println("The Net Pay= " + (netPay = (hours * wage - insurance) - tax*(hours * wage - insurance)));





	}

}
