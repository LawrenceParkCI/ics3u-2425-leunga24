package unit2;
/**
 * Description: This program rolls two dice
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
		System.out.println("Welcome to the Double Dice Contest!");
		System.out.println("The point of the game is for you an the computer to roll 2 dice and the higher sum wins!");
		System.out.println("Your dice are being rolled... May the odd be ever in your favour!");
		Thread.sleep(3000);
		int die1, die2, die3, die4;
		die1=(int)((Math.random()*6)+1);
		die2=(int)((Math.random()*6)+1);
		System.out.println("The sum of both of your dice is " + (die1 + die2));
		System.out.println("For you to win, the computer needs to get below a sum of " + (die1 + die2));
		System.out.println("Now it is the computer's turn");
		System.out.println("The computer's dice are being rolled... May the odd be ever in your favour!");
		die3=(int)((Math.random()*6)+1);
		die4=(int)((Math.random()*6)+1);
		System.out.println("The sum of both of the computer's dice is " + (die3 + die4));

	}

}

