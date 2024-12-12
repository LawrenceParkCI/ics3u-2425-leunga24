package unit2;
import java.util.Scanner;
/**
 * Description: This program is my Unit 2 Assignment and it is on an Escape Room!
 * Date: December 12, 2024
 * @author Adam Leung 
 */
public class Unit2Assignment {
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//imported scanner
		Scanner sc = new Scanner (System.in);
		//declaring some variables
		String start;
		//Introducing the game
		System.out.println("Welcome to...");
		Thread.sleep(2000);
		System.out.println("  ___ ___         .__  .__  .__       .__      ___________                                   \r\n"
				+ " /   |   \\   ____ |  | |  | |__| _____|  |__   \\_   _____/ ______ ____ _____  ______   ____  \r\n"
				+ "/    ~    \\_/ __ \\|  | |  | |  |/  ___/  |  \\   |    __)_ /  ___// ___\\\\__  \\ \\____ \\_/ __ \\ \r\n"
				+ "\\    Y    /\\  ___/|  |_|  |_|  |\\___ \\|   Y  \\  |        \\\\___ \\\\  \\___ / __ \\|  |_> >  ___/ \r\n"
				+ " \\___|_  /  \\___  >____/____/__/____  >___|  / /_______  /____  >\\___  >____  /   __/ \\___  >\r\n"
				+ "       \\/       \\/                  \\/     \\/          \\/     \\/     \\/     \\/|__|        \\/ ");
		Thread.sleep(3000);
		System.out.println("\nSay \"Escape\" to play or \"Stop\" if you would not like to play");
		start = sc.nextLine();
		if (start.equalsIgnoreCase("Escape")) {
			System.out.println("Will you be able to escape from the fiery abyss below?");
			Thread.sleep(3000);
			System.out.println("\nLet's find out...");
			}else {
				System.out.println("\nYou're such a boring person!");
			    System.exit(0);
			}
		
		System.out.println("\nThere is only 1 rule! It is very important that you remember it!");
		System.out.println("A mysterious figure will occasionally appear in front of you. NEVER talk to it or something bad will happen...");
		System.out.println("\nI'm sure you'll be just fine!");
		System.out.println("");
	}
	

}
