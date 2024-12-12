package unit2;
import java.util.Scanner;
/**
 * Description: This program checks if numbers are in order 
 * Date: November 11, 2024
 * @author Adam Leung
 */
public class IfChallenge2 {
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		//This is for the portfolio

		/*Create a program that asks for three numbers.
	    Tell the user if the numbers are strictly in order.
	    ie.  2 5 11 or 5 6 7 are strictly in order.
	    ie.  6 5 7 or 5 5 7 are not
		 */
		Scanner sc = new Scanner (System.in);
		int num1, num2, num3;
		System.out.print("Type in an number:");
		num1 = sc.nextInt();

		System.out.print("Type in a second number:");
		num2 = sc.nextInt();

		System.out.print("Type in a third number:");
		num3 = sc.nextInt();

		if (num1 < num2 && num2 < num3) {
			System.out.println("Your numbers are in order");
		}else {
			System.out.println("Your numbers are not in order");
		}
		sc.close();
	}  
}