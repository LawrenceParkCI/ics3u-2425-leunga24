package unit2;
import java.util.Scanner;
/**
 * Description: This program is my Unit 2 Assignment and it is on Escaping Hell!
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
		//declaring my variables
		String start, name, open, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, code;
		int fall = 0;
		int coin, die1, die2;
		int times = 0;
		int count = 0;
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
		System.out.println("What is your name?");
		name = sc.nextLine();
		System.out.println("\nSay \"Escape\" to play or \"Stop\" if you would not like to play");
		start = sc.nextLine();
		if (start.equalsIgnoreCase("Escape")) {
			System.out.println(name + ", will you be able to escape from the fiery abyss below?");
			Thread.sleep(3000);
			System.out.println("Let's find out...");
			Thread.sleep(3000);
		}else if (start.equalsIgnoreCase("Stop")){
			System.out.println(name + ", you're such a boring person!");
			System.exit(0);
		}else {
			System.out.println(name + " you did not follow the rules. YOU ARE NOT ALLOWED TO PLAY!");
			System.exit(0);
		}
		//rule of the game
		System.out.println("\nBefore you start your escape...");
		Thread.sleep(3000);
		System.out.println("\nThere is only 1 rule you need to know and it is very important that you remember it!");
		Thread.sleep(4000);
		System.out.println("\nA mysterious figure will occasionally appear in front of you. NEVER talk to it or touch it");
		Thread.sleep(4000);
		System.out.println("Or else....");
		Thread.sleep(3000);
		//the escape is starting
		System.out.println("\nYour escape will begin 5 seconds! Good luck and have fun in the depths of despair... ");
		Thread.sleep(5000);
		//the escape starts
		//Three choices
		System.out.println("\nYou are now inside a small room. A red door and a timer that is counting down from 10 seconds appears infront of you. The word \"run\" is written on the door in a red liquid. Blood.");
		Thread.sleep(5000);
		System.out.println("\nYou turn around and another red door appears infront of you. This door has the word \"swim\" written on it in the same red liquid.");
		Thread.sleep(5000);
		System.out.println("\nYou need to make a desicion. Say \"run\" if you would like to go through the run door, say \"swim\" to go through the swim door, or say \"look\" to look for clues in the room.");
		d1 = sc.nextLine();
		//right choice
		if (d1.equalsIgnoreCase("run")) {
			System.out.println("You open the door. It is just a hallway with a door at the end. What will you do?");
			Thread.sleep(3000);
			System.out.println("If you want to walk to the end of the hallway say \"walk\" if you want to run to the end of the hallway say \"run\"");
			d2 = sc.nextLine();
			if (d2.equalsIgnoreCase("run")) {
				System.out.println("\nWell done! You remembered what the door said.");
				Thread.sleep(3000);
				System.out.println("\nYou make it to the door at the end of the hall.");
				Thread.sleep(3000);
				System.out.println("\nWould you like to open the door? Yes or No.");
				d3 = sc.nextLine();
				//right choice
				if (d3.equalsIgnoreCase("Yes")) {
					System.out.println("Good choice. You open the door...");
					Thread.sleep(3000);
					//wrong choice
				}else if (d3.equalsIgnoreCase("No")){
					System.out.println("\nYou forgot about the timer in the room...");
					Thread.sleep(3000);
					System.out.println("Both the hallway and the room blew up...");
					Thread.sleep(3000);
					System.out.println("Game over.");
					System.exit(0);
					//wrong choice
				}else {
					System.out.println("\nYou didn't follow instructions...");
					Thread.sleep(3000);
					System.out.println("Automatic game over.");
					System.exit(0);
				}
				//wrong choice
			}else if (d2.equalsIgnoreCase("walk")){
				System.out.println("\nWhat did the door say? You forgot...");
				Thread.sleep(3000); 
				System.out.println("You should've ran. The timer in the room ended. The place blew up.");
				Thread.sleep(3000);
				System.out.println("Game over.");
				System.exit(0);
				//wrong choice
			}else {
				System.out.println("\nYou didn't follow instructions...");
				Thread.sleep(3000);
				System.out.println("Automatic game over.");
				System.exit(0);
			}
			//wrong choice
		}else if (d1.equalsIgnoreCase("swim")){
			System.out.println("\nYou open the door. And suddenly you realize...");
			Thread.sleep(3000);
			System.out.println("There isn't any water in hell. It's too late. You are already falling...");
			Thread.sleep(3000);
			System.out.println("You're falling into an endless abyss. It's over for you. You keep falling.");
			Thread.sleep(3000);
			while (fall==0) 
				System.out.println("falling"); 
			System.exit(0);
			//wrong choice
		}else if (d1.equalsIgnoreCase("look")){
			System.out.println("\nYou start to look around for anything in the room. That wasn't very smart...");
			Thread.sleep(3000);
			System.out.println("You forgot about the timer. The timer ends. You hope nothing happens...");
			Thread.sleep(3000);
			System.out.println("In a bright flash a burning pain is inflicted onto you...");
			Thread.sleep(3000);
			System.out.println("The room blew up...");
			Thread.sleep(2000);
			System.out.println("Game over.");
			System.exit(0);
			//wrong choice
		}else {
			System.out.println("\nYou didn't follow instructions...");
			Thread.sleep(3000);
			System.out.println("Automatic game over.");
			System.exit(0);
		}
		System.out.println("\nThe door shuts behinds you and disappears, But you are now trembling with fear...");
		Thread.sleep(3000);
		System.out.println("\nInfront of you stands a mysterious looking figure. It has no eyes but for some reason it feels like it's watching you.");
		Thread.sleep(5000);
		System.out.println("\nDo you want to talk to it? It could benefit you.");
		Thread.sleep(2000);
		System.out.println("\nYes or No");
		d4 = sc.nextLine();
		//right choice
		if (d4.equalsIgnoreCase("No")){
			System.out.println("\nGood job. You listened to the only rule!");
			//wrong choice
		}else if (d4.equalsIgnoreCase("Yes")){
			System.out.println("\nTHE GAME ONLY HAD ONE RULE!");
			Thread.sleep(3000);
			System.out.println("\nTO NOT TALK TO THE MYSTERIOUS FIGURE!");
			Thread.sleep(3000);
			System.out.println("\nThe mysterious figure approaches you...");
			Thread.sleep(3000);
			System.out.println("\nand in the blink of an eye...");
			Thread.sleep(3000);
			System.out.println("\nyou are ripped to shreds.");
			Thread.sleep(3000);
			System.out.println("\nYou did this to yourself. All you needed to do was listen.");
			Thread.sleep(3000);
			System.out.println("\nGame over.");
			System.exit(0);
			//wrong choice
		}else {
			System.out.println("\nYou didn't follow instructions...");
			Thread.sleep(3000);
			System.out.println("Automatic game over.");
			System.exit(0);
		}
		Thread.sleep(3000);
		System.out.println("\nThe figure disappears and leaves a note.");
		Thread.sleep(3000);
		System.out.println("\nYou open the note. It is a sequence of numbers.");
		Thread.sleep(3000);
		System.out.println("\n 3 6 9 5 1");
		Thread.sleep(3000);
		System.out.println("\nWhat does it mean? No time to think about. You slide it into your pocket.");
		Thread.sleep(3000);
		System.out.println("\nYou finally look at your surroundings.");
		Thread.sleep(3000);
		System.out.println("\nYou are now on a small island surrounded by lava.");
		Thread.sleep(3000);
		System.out.println("\nOn the island there is both a cave and a little cabin.");
		Thread.sleep(3000);
		System.out.println("\nWhich would you like to explore?");
		Thread.sleep(3000);
		System.out.println("\nSay \"Cave\" to explore the cave or say \"Cabin\" to explore the cabin");
		d5 = sc.nextLine();
		//Cave Path
		if (d5.equalsIgnoreCase("Cave")){
			System.out.println("\nYou decided to enter the cave. ");
			Thread.sleep(3000);
			System.out.println("It is pitch black in here. You can't see a thing.");
			Thread.sleep(3000);
			System.out.println("Suddenly, torches in the cave light up illuminating the place.");
			Thread.sleep(3000);
			System.out.println("You look around and see a man chained to the wall.");
			Thread.sleep(3000);
			System.out.println("Would you like to approach him? Yes or No.");
			d6 = sc.nextLine();
			//wrong choice
			if (d6.equalsIgnoreCase("Yes")){
				System.out.println("\nYou approach the man...");
				Thread.sleep(3000);
				System.out.println("He begins to murmur the words...");
				Thread.sleep(3000);
				System.out.println("\"Bad desicion\"");
				Thread.sleep(3000);
				System.out.println("He breaks from his chains and grabs you...");
				Thread.sleep(3000);
				Thread.sleep(3000);
				System.out.println("Game over.");
				System.exit(0);
				//right choice
			}else if (d6.equalsIgnoreCase("No")){
				System.out.println("\nYou decide to look around the cave more. Avoiding the chained man.");
				Thread.sleep(3000);
				System.out.println("Something catches your eye. A small shiny object on the ground.");
				Thread.sleep(3000);
				System.out.println("It's a coin. You pick it up and the chained man begins to talk.");
				Thread.sleep(3000);
				System.out.println("He tells you to flip the coin. He says if you flip heads he will grant you safe passage. If you don't he will lock you up here forever.");
				Thread.sleep(3000);
				System.out.println("Will you flip the coin? Yes or No.");
				d7 = sc.nextLine();
				//Coin flip
				if (d7.equalsIgnoreCase("Yes")) {
					System.out.println("\nYou flip the coin hopping for heads...");
					Thread.sleep(3000);
					System.out.println("\nThe coin lands on the ground and it is...");
					coin=(int)((Math.random()*2)+1);
					Thread.sleep(5000);
					//Winning the coin flip
					if (coin == 1) {
						System.out.println("\nHeads!");
						Thread.sleep(3000);
						System.out.println("The man says \"You got lucky.\"");
						Thread.sleep(3000);
						System.out.println("As promised the man grants safe passage and directs you to a hidden door in the cave.");
						Thread.sleep(3000);
						System.out.println("He tells you to say open 5 times.");
						while (times < 5) {
							open = sc.nextLine();
							if (open.equalsIgnoreCase("Open")){
								times = times + 1;
							}else{
								times = times + 0;
							}
						}
						System.out.println("\nThe hidden door slowly opens and the mysterious figure lies infront of you once again.");
						Thread.sleep(3000);
						System.out.println("It speaks this time. It asks you if you would like to go home.");
						Thread.sleep(3000);
						System.out.println("Yes or No");
						d8 = sc.nextLine();
						//wrong choice
						if (d8.equalsIgnoreCase("Yes")) {
							System.out.println("\nTHE GAME ONLY HAD ONE RULE!");
							Thread.sleep(3000);
							System.out.println("\nTO NOT TALK TO THE MYSTERIOUS FIGURE!");
							Thread.sleep(3000);
							System.out.println("\nThe mysterious figure approaches you...");
							Thread.sleep(3000);
							System.out.println("\nand in the blink of an eye...");
							Thread.sleep(3000);
							System.out.println("\nyou are ripped to shreds.");
							Thread.sleep(3000);
							System.out.println("\nYou did this to yourself. All you needed to do was listen.");
							Thread.sleep(3000);
							System.out.println("\nGame over.");
							//right choice
						}else if (d8.equalsIgnoreCase("No")) {
							System.out.println("\nYou remembered the rule!");
							Thread.sleep(3000);
							System.out.println("The mysterious figure disappears once again and now a door appears in front of you.");
							Thread.sleep(3000);
							System.out.println("A shining gold door.");
							Thread.sleep(3000);
							System.out.println("You approach the door and there seems to be a lock on it.");
							Thread.sleep(3000);
							System.out.println("The lock is a sequence of 5 numbers. Which numbers will you plug in? You get 3 chances...");
							//Unlocking the door
							do { 
								code = sc.nextLine();
								count = count + 1;
								if (code.equals("36951") || code.equals("3 6 9 5 1") || code.equals(" 3 6 9 5 1")){
									System.out.println("\nThe lock opened...");
									Thread.sleep(3000);
									System.out.println("The door slowly opens...");
									Thread.sleep(3000);
									System.out.println("CONGRATULATIONS " + name + ". YOU COMPLETED THE GAME \"HELLISH ESCAPE\"! YOU HAVE ACHIEVED THE CAVE ENDING!");
									System.exit(0);
								}
							}while (count < 3);
							//Password wrong 3 times...
							System.out.println("\nYou got the code wrong 3 times...");
							Thread.sleep(3000);
							System.out.println("You're stuck in hell forever now...");
							Thread.sleep(3000);
							System.out.println("Game over.");
							System.exit(0);
							//wrong choice
						}else {
							System.out.println("\nYou didn't follow instructions...");
							Thread.sleep(3000);
							System.out.println("Automatic game over.");
							System.exit(0);
						}
						//Loss the coin flip
					}else {
						System.out.println("\nTails...");
						Thread.sleep(3000);
						System.out.println("Game over.");
						System.exit(0);
					}
					//wrong choice
				}else if (d7.equalsIgnoreCase("No")) {
					System.out.println("\nHe lunges at you, breaking the chains from the wall.");
					Thread.sleep(3000);
					System.out.println("Game over.");
					System.exit(0);
					//wrong choice
				}else {
					System.out.println("\nYou didn't follow instructions...");
					Thread.sleep(3000);
					System.out.println("Automatic game over.");
					System.exit(0);
				}
				//wrong choice
			}else {
				System.out.println("\nYou didn't follow instructions...");
				Thread.sleep(3000);
				System.out.println("Automatic game over.");
				System.exit(0);
			}
			//Cabin Path
		}else if (d5.equalsIgnoreCase("Cabin")){
			System.out.println("\nYou open the door to the cabin.");
			Thread.sleep(3000);
			System.out.println("A man is sitting at a table and says \"Sit down.\"");
			Thread.sleep(3000);
			System.out.println("He tells you that you will be playing a dice game.");
			Thread.sleep(3000);
			System.out.println("His presence makes you tremble, making you sit down.");
			Thread.sleep(3000);
			System.out.println("He hands you a 6 sided dice and tells you to roll it. Rules are simple. Highest dice roll wins.");
			Thread.sleep(3000);
			System.out.println("He tells you that if you win you will be granted safe passage. If he wins or ties with you, he will trap you in the cabin for eternity.");
			Thread.sleep(3000);
			System.out.println("Will you roll the dice? Yes or No?");
			d9 = sc.nextLine();
			//Dice game
			if (d9.equalsIgnoreCase("Yes")){
				System.out.println("\nYou roll your die hopping for a high number...");
				Thread.sleep(3000);
				die1=(int)((Math.random()*6)+1);
				System.out.println("You rolled a " + die1);
				Thread.sleep(3000);
				System.out.println("Now it is his turn");
				Thread.sleep(3000);
				System.out.println("He rolls his die...");
				Thread.sleep(3000);
				die2=(int)((Math.random()*6)+1);
				System.out.println("He rolled a " + die2);
				Thread.sleep(3000);
				//Losing dice game
				if (die2 >= die1) {
					System.out.println("\nHe wins...");
					Thread.sleep(3000);
					System.out.println("Game over.");
					System.exit(0);
					//Winning dice game
				}else if (die2 < die1);
				System.out.println("\nYou Win!");
				Thread.sleep(3000);
				System.out.println("He fulfills his promise and directs you to a door in the cabin.");
				Thread.sleep(3000);
				System.out.println("You open the door...");
				Thread.sleep(3000);
				System.out.println("and there stands the myterious figure once again.");
				Thread.sleep(3000);
				System.out.println("It speaks this time. It asks you if you would like to go home.");
				Thread.sleep(3000);
				System.out.println("Yes or No");
				d10 = sc.nextLine();
				//wrong choice
				if (d10.equalsIgnoreCase("Yes")) {
					System.out.println("\nTHE GAME ONLY HAD ONE RULE!");
					Thread.sleep(3000);
					System.out.println("\nTO NOT TALK TO THE MYSTERIOUS FIGURE!");
					Thread.sleep(3000);
					System.out.println("\nThe mysterious figure approaches you...");
					Thread.sleep(3000);
					System.out.println("\nand in the blink of an eye...");
					Thread.sleep(3000);
					System.out.println("\nyou are ripped to shreds.");
					Thread.sleep(3000);
					System.out.println("\nYou did this to yourself. All you needed to do was listen.");
					Thread.sleep(3000);
					System.out.println("\nGame over.");
					//right choice
				}else if (d10.equalsIgnoreCase("No")) {
					System.out.println("\nYou remembered the rule!");
					Thread.sleep(3000);
					System.out.println("The mysterious figure dissapears once again and now a door appears in front of you.");
					Thread.sleep(3000);
					System.out.println("A shining gold door.");
					Thread.sleep(3000);
					System.out.println("You approach the door and there seems to be a lock on it.");
					Thread.sleep(3000);
					System.out.println("The lock is a sequence of 5 numbers. Which numbers will you plug in? You get 3 chances...");
					//Unlocking the door
					do { 
						code = sc.nextLine();
						count = count + 1;
						if (code.equals("36951") || code.equals("3 6 9 5 1") || code.equals(" 3 6 9 5 1")){
							System.out.println("\nThe lock opened...");
							Thread.sleep(3000);
							System.out.println("The door slowly opens...");
							Thread.sleep(3000);
							System.out.println("CONGRATULATIONS " + name + ". YOU COMPLETED THE GAME \"HELLISH ESCAPE\"! YOU HAVE ACHIEVED THE CABIN ENDING!");
							System.exit(0);
						}
					}while (count < 3);
					//Password wrong 3 times...
					System.out.println("\nYou got the code wrong 3 times...");
					Thread.sleep(3000);
					System.out.println("You're stuck in hell forever now...");
					Thread.sleep(3000);
					System.out.println("Game over.");
					System.exit(0);
					//wrong choice
				}else {
					System.out.println("\nYou didn't follow instructions...");
					Thread.sleep(3000);
					System.out.println("Automatic game over.");
					System.exit(0);
				}
				//wrong choice
			}else if (d9.equalsIgnoreCase("No")){
				System.out.println("\nThe man gets mad that you did not play with him.");
				Thread.sleep(3000);
				System.out.println("He pushes a button...");
				Thread.sleep(3000);
				System.out.println("It explodes the cabin...");
				Thread.sleep(3000);
				System.out.println("Game over.");
				System.exit(0);
				//wrong choice
			}else {
				System.out.println("\nYou didn't follow instructions...");
				Thread.sleep(3000);
				System.out.println("Automatic game over.");
				System.exit(0);
			}
			//wrong choice
		}else {
			System.out.println("\nYou didn't follow instructions...");
			Thread.sleep(3000);
			System.out.println("Automatic game over.");
			System.exit(0);
		}

		sc.close();
	}


}
