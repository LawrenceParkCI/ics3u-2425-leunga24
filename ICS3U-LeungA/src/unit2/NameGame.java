package unit2;

import java.util.Scanner;
/**
 * Description:This program is a name game using math.random
 * Date: November 25, 2024
 * @author Adam Leung
 */
public class NameGame {
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
		 * The application should prompt the user for their name. 
		 * 70% of the time the program should output that the user's name is their favourite, 
		 * and 30% of the time says they hate that name.
		 * */
		Scanner sc = new Scanner (System.in);
		//declaring variables
		String Name; 
		int percent;
		//receives user input
		System.out.print("Type in your name here:");
		Name = sc.nextLine();
		//using math.random to do percentage 1/10 is 10% and so on
		percent = (int)((Math.random()*10)+1);
		if (percent <= 3) {
			System.out.println("You hate the name " + Name);
		} else {
			System.out.println("Your favourite name is " + Name);
		}
		sc.close();

	}
}
