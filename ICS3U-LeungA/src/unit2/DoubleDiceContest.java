package unit2;

import java.util.Scanner;
/**
 * Description: This program is a game against the computer using 2 dice 
 * Date: November 21, 2024
 * @author Adam Leung
 */
public class DoubleDiceContest {
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) throws InterruptedException {
		/*
		 * Write code that simulates rolling two dice for the user and then two dice for the computer. 
		 * The program should output the total of the two dice for both the user and the computer, 
		 * then announce who won: the computer, the user, or say it was a tie.
		 */
		Scanner sc = new Scanner (System.in);
		//rules of the game
		String roll;
		System.out.println("Welcome to the Double Dice Contest!");
		Thread.sleep(2000);
		System.out.println("You and the computer will both roll 2 dice and whoever receives the higher sum wins!");
		Thread.sleep(4000);
		System.out.println("Write your lucky words and press <Enter> to roll your dice:");
		roll = sc.nextLine();
		System.out.println("Your dice are being rolled... May the odds be ever in your favour!");
		System.out.println("");
		Thread.sleep(6000);
		//declaring variables
		int die1, die2, die3, die4, total1, total2, point, point1;
		//rolling the dice for user
		die1=(int)((Math.random()*6)+1);
		die2=(int)((Math.random()*6)+1);
		total1=die1 + die2;
		//displaying sum of users dice
		System.out.println("The sum of of your dice is " + (total1));
		System.out.println("For you to win, the computer needs to get below a sum of " + (total1));
		System.out.println("");
		Thread.sleep(4000);
		System.out.println("Now it is the computer's turn");
		Thread.sleep(2000);
		System.out.println("The computer's dice are being rolled...");
		Thread.sleep(3000);
		//rolling the dice for computer
		die3=(int)((Math.random()*6)+1);
		die4=(int)((Math.random()*6)+1);
		total2=die3 + die4;
		point = total1-total2;
		point1 = total2-total1;
		//if statements displaying output
		System.out.println("");
		System.out.println("The sum of the computer's dice is " + (total2));
		if (point == 1) {
			System.out.println("Wow! You barely won! You won by only 1 point :)");
		}else if (point1 == 1) {
			System.out.println("Yikes! You were so close! You lost by only 1 point :(");
		}else if (total1>total2) {
			System.out.println("Congratulations! You won by " + (total1 - total2) + (" points!"));
		}else if (total1==total2) {
			System.out.println("Wow! You and the computer tied for " + (total1) + (" points!"));
		}else {
			System.out.println("Sorry! The computer won by " + (total2 - total1) + (" points. Better luck next time!"));

		}
		sc.close();
	}
}

