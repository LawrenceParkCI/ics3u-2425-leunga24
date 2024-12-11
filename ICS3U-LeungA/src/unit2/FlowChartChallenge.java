package unit2;
import java.util.Scanner;
/**
 Description: This program is used to create a flow chart
 Date: December 1, 2024
 @author Adam Leung
 */
public class FlowChartChallenge {
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*Create a flow chart for this program. Add the Share link
    to your flowchart as a comment in this program.
    How would the flow chart of the do-while loop
     and while loop differ?
		 */
		//https://drive.google.com/file/d/11oYIgzjGQEWtLcww4YtZ7BIHPdwPGZ2n/view?usp=sharing
		//The do-while flow chart and while loop flow chart differ as the while loop runs the condition first and the do-while loop is run at least once before running the condition

		Scanner in = new Scanner(System.in);
		String name;
		do {
			System.out.print("What is your name? ");
			name = in.nextLine();
		} while (!name.equals("Ms. Kemp"));

		System.out.println("You are welcome into the secret secret pogchamp club.");

		in.close();

	}
}