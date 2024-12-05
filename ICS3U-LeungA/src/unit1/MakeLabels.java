package unit1;
/**
 * Description: This program makes labels
 * Date: October 2, 2024
 * @author Adam Leung
 */
import java.util.Scanner;

public class MakeLabels {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);


		String subject;
		String name;
		
		System.out.println("Type in the subject and press <Enter>");
		subject = sc.nextLine();

		System.out.println("Type in the name and press <Enter>");
		name = sc.nextLine();
	
		
		System.out.println();
		System.out.println("******************************");
		System.out.println(name);
		System.out.println(subject);
		System.out.println("******************************");
		sc.close();
	}

}
