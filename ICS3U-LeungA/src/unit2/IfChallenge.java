package unit2;
import java.util.Scanner;

/**
 * Description: This program teacher the programmer more about if, else, and else if
 * Date: November 07, 2024
 * @author Adam Leung
 */

public class IfChallenge {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/*

    (IF)

    ask for the user's favourite number.
    if the number is negative, say that they need to look on
    the bright side.  If their number is odd, say that it's a 
    bit strange.

    (IF, ELSE)

    If their number is divisible by 3 and by 2, 
    say that they should really consider thinking about 6, 
    otherwise say they can keep wholesome.  

    (IF, ELSE IF, ELSE)

    Finally, if the 
    ones digit of the number is 8, say that you too are full, 
    if the ones digit is 9, say Canada is a nice country, 
    and any other number should result in "don't count on 
    it". 
		 */

		int favourite;
		System.out.print("Type in your favourite number:");
		favourite = in.nextInt();

		if ( favourite < 0 ) { 
			System.out.println("You need to look on the bright side.");
		}
		if ( favourite % 2 != 0) {
			System.out.println("That is a bit strange.");
		}
		if ( favourite % 6 == 0) {
			System.out.println("You should really consider thinking about 6.");
		}else {
			System.out.println("You can keep wholesome.");
		}
		if ( favourite % 10 == 8) {
			System.out.println("You too are full");
		}else if ( favourite % 10 == 9) {
			System.out.println("Canada is a nice country");
		}else {
			System.out.println("don't count on it");
		}
	}
}