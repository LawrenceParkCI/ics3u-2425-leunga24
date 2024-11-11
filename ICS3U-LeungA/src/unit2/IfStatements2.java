package unit2;
import java.util.Scanner;
/**
 * Description: This program determines if you are an adult or not
 * Date: November 05, 2024
 * @author Adam Leung
 */
public class IfStatements2 {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*
    if (userAge > 18) { //If they're over 18, they are titled an adult
      String title = "Adult";
    } else {  //if they're not over 18, I don't want a title
      System.out.println("Sorry, not quite yet.");
    }

    System.out.println(title);
		 */
		//Looking at the logic above, why do you think the 
		//program won't work? 
		//Because the code only exists in the brackets so once the bracket ends it doesn't "save". thats why the system.out.println(title); that is outside the brackets won't work because the variable doesn't exist.

		//Copy the code below, and try to find a solution.
		//Comment the code above to avoid compilation errors.

		System.out.println("What is your age?");
		int userAge = in.nextInt();

		if (userAge > 18) { //If they're over 18, they are titled an adult
			String title = "Adult";
			System.out.println(title);
		} else {  //if they're not over 18, I don't want a title
			System.out.println("Sorry, not quite yet.");
		}

		in.close();
	}
}