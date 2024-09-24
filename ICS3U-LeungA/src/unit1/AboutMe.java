package unit1;
/**
 * Description: This program prints information about the author, Adam Leung
 * Date: Sept 20, 2024
 * Authour: @authour Adam Leung
 */
public class AboutMe {

	public static void main(String[] args) {
		// These following statements give information about who I am
		System.out.println("Hi, my name is Adam Leung");
		System.out.println("I am a 15 year old boy in grade 11");
		System.out.println("I was born on September 25th, 2008");
		System.out.println("My teacher is awesome and her name is Ms. Kemp");
		System.out.println("I go to Lawrence Park Collegiate Institute in Toronto, Canada");
		System.out.println("\"GO LPCI PANTHERS!");
		System.out.println("------------------------------------------------------------------");
		// The next several statements display my course schedule for the week of September 23rd
		System.out.println("My course schedule for the week of September 23rd");
		System.out.println("\n__________________________________________________________________________________");
		System.out.printf("%-19s%-20s%-20s%-20s%-20s", "Monday (September 23)", "Tuesday (September 24)", "Wednesday (September 25 *My B-Day*)", "Thursday (September 26)", "Friday (September 27)");
		System.out.println("\n__________________________________________________________________________________");
		System.out.printf("%-19s%-20s%-20s%-20s%-20s", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday");
	}
}
