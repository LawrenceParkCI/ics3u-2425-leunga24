package unit2;

import java.util.Scanner;
/**
 * Description: This program is a quiz!
 * Date: November 13, 2024
 * @author Adam Leung
 */
public class IfChallenge3 {
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//This is for the portfolio

		/*
	    Write an interactive quiz. It should ask the user three 
	    multiple-choice or true/false questions about something. 
	    It must keep track of how many they get wrong, and print 
	    out a "score" at the end.

	    Sample:

	    Are you ready for a quiz?  N
	    Okay, here it comes!

	    Q1) What is the capital of Alaska?
	      1) Melbourne
	      2) Anchorage
	      3) Juneau

	    > 3

	    That's right!
		 */
		Scanner sc = new Scanner (System.in);
		double points = 0;
		String q1, q2, q3, q4;
		String name;
		//Welcoming to the quiz!
		System.out.println("WELCOME TO THE COUNTRY QUIZ!");
		System.out.print("What is your name?");
		name = sc.next();
		System.out.println("Nice to meet you " + name);
		System.out.println("Today's country quiz will consist of 4 multiple choice questions!");
		System.out.println("The test will begin in 15 seconds. No talking, no cellphones and no leaving this tab! Good luck " + name);
		Thread.sleep(15000);
		//Question #1
		System.out.println("Question 1 (2 points):");
		System.out.println("                 -=-=++=-::.     ");                                
		System.out.println("                .:+.  .....*.                        ....  ");         
		System.out.println("               ..:*..    .=+-++-..::.      .:+.*+-=:.+:   ");      		
		System.out.println("              .*++.     .......=-.#.     .=+....-=-=+:.        ");
		System.out.println("                 ..#.           ...=- .:==*-.     ..=+==-...");     
		System.out.println("                ..#-..         .***+.+:..           ..=+=*:  ");   
		System.out.println("                  :=+++.            .....                  .:+..");   
		System.out.println("         ..=***+: .#...                                     ..#..   ");
		System.out.println("      .=+..  ..:*+:.                                       ..*..   ");
		System.out.println("      .*=..    ....                                         .+:.   ");
		System.out.println("       .+=.                                                  --.   ");
		System.out.println("        .+.                                                 ..==.");   
		System.out.println("       .:+.                                                .:=..    ");
		System.out.println("       .+:.                                                ..+-..   ");
		System.out.println("       .#.                                                  ...==.  ");
		System.out.println("      .#.                                                    ..*.  ");
		System.out.println("     .#.                                                     .+.. ");
		System.out.println("    :+..                                                     .:*..");
		System.out.println("  .-+.                                                       ..+:.");
		System.out.println("-+:+=...                                                      .=-. ");
		System.out.println("  *:.                                                            .==..");
		System.out.println("  .=:                                                            ...+.");
		System.out.println("  --                                                              ..+");
		System.out.println("  .--                                                               .*");
		System.out.println(" :=.                                                          ..:...*");
		System.out.println("  .=.                                                         ..*:+--=");
		System.out.println(" .=..                                                  ..:====:......");
		System.out.println("  .--                                                  .:*.           ");
		System.out.println("  ..+-.                                          .....-+:.            ");
		System.out.println("  ..*.                                        .=.#.....              ");
		System.out.println("  --..                                         -+..                  ");
		System.out.println("  .*..                                          .*:.                 ");
		System.out.println("  ..==.                                         .=-.                 ");
		System.out.println("  .-=.                                         .:+.                 ");
		System.out.println("  .+=.                                          .:+..               ");
		System.out.println("  :*... ...                                     .==...            ");
		System.out.println("  .:==+-=+=:...                                  ..=+..           ");
		System.out.println("      .... ...=*.                                    .-*:.         ");
		System.out.println("            .+:.                                      .-=.        ");
		System.out.println("           .*..                                     ....+.        ");
		System.out.println("          .+:                                       .-+=-.        ");
		System.out.println("         :=.                                    ...:*.           ");
		System.out.println("         =:                                    .+=:...           ");
		System.out.println("          =.                                    .--.              ");
		System.out.println("          =.   ........                     ......=.              ");
		System.out.println("         =.....+...:=*=:.... .....   ...:::=**++:=.              ");
		System.out.println("         :----:..    ...:--+..#:--+..:+:........-+-.             ");
		System.out.println("                         ..#=+.  :--..     				   ");
		System.out.println("Identify the country by the border above:");
		System.out.println("A: Poland");
		System.out.println("B: Bolivia");
		System.out.println("C: Germany");
		System.out.println("D: France");
		System.out.println("E:None of the above");
		System.out.print("Write your answer here:");
		q1 = sc.next();
		if (q1.equals('c') || q1.equals('C')) {
			points += 2;
		}
		else {
			points += 0;
		}
		System.out.println();
		//Question #2
		System.out.println("Question 2 (1 point):");
		System.out.println("####################################################################\r\n"
				+ "####################################################################\r\n"
				+ "####################################################################\r\n"
				+ "####################################################################\r\n"
				+ "####################################################################\r\n"
				+ "####################################################################\r\n"
				+ "##################**-....:=*########################################\r\n"
				+ "################-.    ..-==-:.=#####################################\r\n"
				+ "##############-     -*#########*+###################################\r\n"
				+ "#############:    :#################################################\r\n"
				+ "############.    :##################* *#############################\r\n"
				+ "###########*     +##################+  . .*#########################\r\n"
				+ "###########*    .*##############*-.     .*##########################\r\n"
				+ "###########*     +##################*  . .*#########################\r\n"
				+ "############:    :##################*.*#############################\r\n"
				+ "#############:    .#################################################\r\n"
				+ "##############-     -*#########*+###################################\r\n"
				+ "################=.    ..:---:.=#####################################\r\n"
				+ "##################*+=:...:=*########################################\r\n"
				+ "####################################################################\r\n"
				+ "####################################################################\r\n"
				+ "####################################################################\r\n"
				+ "####################################################################\r\n"
				+ "####################################################################\r\n"
				+ "####################################################################");
		System.out.println("Identify the country by the flag above:");
		System.out.println("A: Tunisia");
		System.out.println("B: Turkey");
		System.out.println("C: Pakistan");
		System.out.println("D: Azerbaijan");
		System.out.println("E: None of the above");
		System.out.print("Write your answer here:");
		q2 = sc.next();
		if (q2.equals('b') || q2.equals('B')) {
			points += 1;
		}
		else {
			points += 0;
		}
		System.out.println();
		//Question #3
		System.out.println("Question 3 (1 point):");
		System.out.println("What are the 5 largest countries ordered from largest to smallest?");
		System.out.println("A: Russia, China, Canada, Australia, Brazil ");
		System.out.println("B: Russia, China, U.S.A, Canada, Greenland");
		System.out.println("C: Russia, Canada, U.S.A, China, Brazil");
		System.out.println("D: Russia, Canada, China, U.S.A, Brazil");
		System.out.println("E:None of the above");
		System.out.print("Write your answer here:");
		q3 = sc.next();
		if (q3.equals('d') || q3.equals('D')) {
			points += 1;
		}
		else {
			points += 0;
		}
		System.out.println();
		//Question 4 
		System.out.println("Question 4 (2 points)");
		System.out.println("What country has the highest Gross Domestic Product (GDP) per capita as of 2024? ");
		System.out.println("A: Switzerland");
		System.out.println("B: U.S.A");
		System.out.println("C: Qatar");
		System.out.println("D: Norway");
		System.out.println("E: Singapore");
		System.out.println("F: Luxembourg");
		System.out.println("G: U.A.E");
		System.out.print("Write your answer here:");
		q4 = sc.next();
		if (q3.equals('f') || q3.equals('F')) {
			points += 2;
		}
		else {
			points += 0;
		}
		
	}	
}
