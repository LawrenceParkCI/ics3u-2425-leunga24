package unit1;

import java.util.Scanner;

/**
 * Description: This program calculates the amount of sleep and amount of days someone has been alive for
 * Date: October 7, 2024
 * @author Adam Leung
 */
public class Alive {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in); 
		
		//Receives User Input
		int Year, Month, Day;
		
		System.out.println("Enter your Birthdate:");
		System.out.print("Year:");
		Year = sc.nextInt();
		
		System.out.print("Month:");
		Month = sc.nextInt();
		
		System.out.print("Day:");
		Day = sc.nextInt();
		
		int bYear, bMonth, bDay; 
		
		System.out.println("Enter today's date:");
		System.out.print("Year:");
		bYear = sc.nextInt();
		
		System.out.print("Month:");
		bMonth = sc.nextInt();
		
		System.out.print("Day:");
		bDay = sc.nextInt();
		
		//Output
		int sleep, alive;
		
		alive = (bYear - Year)*(365) + (bMonth - Month)*(30) + (bDay - Day);
		System.out.println("You have been alive for " + alive + " day(s).");
		
		sleep = (alive * 8);
		System.out.println("In your lifetime, you have slept a total of around " + sleep + " hours.");
		
		sc.close();

	}

}
