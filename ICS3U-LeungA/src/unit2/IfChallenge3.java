package unit2;

import java.text.NumberFormat;
import java.util.Scanner;
/**
 * Description: This program is a country quiz!
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
		String q1, q2, q3, q4, q5, q6;
		String name;
		//Welcoming to the quiz!
		System.out.println("WELCOME TO THE COUNTRY QUIZ!");
		System.out.print("What is your name?");
		name = sc.next();
		System.out.println("Nice to meet you " + name);
		Thread.sleep(2000);
		System.out.println("Today's country quiz will consist of 4 multiple choice and 2 true or false questions! You need at least a 50% to pass.");
		Thread.sleep(3000);
		System.out.println("The test will begin in 5 seconds. No talking, no cellphones and no leaving this tab! Good luck " + name);
		//Sleeping the following threads
		Thread.sleep(5000);
		//Question #1 guess the border of the country
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
		System.out.print("Write the letter correspoding with your answer here:");
		q1 = sc.next();
		if (q1.equalsIgnoreCase("C") || q1.equalsIgnoreCase("Germany")){
			points += 2;
		}
		else {
			
		}
		System.out.println();
		//Question #2 guess the flag
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
		System.out.print("Write the letter correspoding with your answer here:");
		q2 = sc.next();
		if (q2.equalsIgnoreCase("B") || q2.equalsIgnoreCase("Turkey")) {
			points += 1;
		}
		else {
			
		}
		System.out.println();
		//Question #3 largest countries
		System.out.println("Question 3 (1 point):");
		System.out.println("What are the 5 largest countries ordered from largest to smallest by land area?");
		System.out.println("A: Russia, China, Canada, Australia, Brazil ");
		System.out.println("B: Russia, China, U.S.A, Canada, Greenland");
		System.out.println("C: Russia, Canada, U.S.A, China, Brazil");
		System.out.println("D: Russia, Canada, China, U.S.A, Brazil");
		System.out.println("E:None of the above");
		System.out.print("Write the letter correspoding with your answer here:");
		q3 = sc.next();
		if (q3.equalsIgnoreCase("C") || q3.equalsIgnoreCase("Russia, Canada, U.S.A, China, Brazil")) {
			points += 1;
		}
		else {
			
		}
		System.out.println();
		//Question 4 country with the highest GDP per capita
		System.out.println("Question 4 (2 points)");
		System.out.println("What country has the highest Gross Domestic Product (GDP) per capita as of 2024? ");
		System.out.println("A: Switzerland");
		System.out.println("B: U.S.A");
		System.out.println("C: Qatar");
		System.out.println("D: Norway");
		System.out.println("E: Singapore");
		System.out.println("F: Luxembourg");
		System.out.println("G: U.A.E");
		System.out.print("Write the letter correspoding with your answer here:");
		q4 = sc.next();
		if (q4.equalsIgnoreCase("F") || q4.equalsIgnoreCase("Luxembourg")) {
			points += 2;
		}
		else {
			
		}
		System.out.println();
		//Question 5 largest mountain in North America
		System.out.println("Question 5 (1 point)");
		System.out.println("Mount Logan is the largest mountain in North America");
		System.out.println("T: True");
		System.out.println("F: False");
		System.out.print("Write F for false or T for true:");
		q5 = sc.next();
		if (q5.equalsIgnoreCase("F") || q5.equalsIgnoreCase("False")) {
			points += 1;
		}
		else {
			
		}
		System.out.println();
		//Question 6 deepest Fresh water lake
		System.out.println("Final Question: Question 6 (1 point)");
		System.out.println("Lake Baikal in russia is the deepest freshwater lake in the world");
		System.out.println("T: True");
		System.out.println("F: False");
		System.out.print("Write F for false or T for true:");
		q6 = sc.next();
		if (q6.equalsIgnoreCase("T")|| q6.equalsIgnoreCase("True")) {
			points += 1;
		}
		else {
			
		}
		//Calculating the score of the test
		System.out.println();
		System.out.println("Loading your results...");
		Thread.sleep(2000);
		double score;
		NumberFormat percent = NumberFormat.getPercentInstance();
		if (points==8) {
			score = points/8;
			System.out.println(name + ", congrats! I am super impressed! You recieved a score of 8/8 on the test! You recieved a " + percent.format(score));
		}
		else if (points==7){
			score = points/8;
			System.out.println(name + ", well done! You recieved a score of 7/8 on the test! You recieved a " + percent.format(score));
		}

		else if (points==6){
			score = points/8;
			System.out.println(name + ", good job! You recieved a score of 6/8 on the test! You recieved a " + percent.format(score));
		}

		else if (points==5){
			score = points/8;
			System.out.println(name + ", you passed! You recieved a score of 5/8 on the test! You recieved a " + percent.format(score));
		}

		else if (points==4){
			score = points/8;
			System.out.println(name + ", you barely passed! You recieved a score of 4/8 on the test! You recieved a " + percent.format(score));
		}

		else if (points==3){
			score = points/8;
			System.out.println(name + ", you did not pass! You should've studied more! You recieved a score of 3/8 on the test! You recieved a " + percent.format(score));
		}
		else if (points==2){
			score = points/8;
			System.out.println(name + ", you did not pass! You should be dissapointed in yourself! You recieved a score of 2/8 on the test! You recieved a " + percent.format(score));
		}
		else if (points==1){
			score = points/8;
			System.out.println(name + ", you did not pass! You either have an IQ of 10 or you did this on purpose! You recieved a score of 1/8 on the test! You recieved a " + percent.format(score));
		}
		else if (points==0){
			score = points/8;
			System.out.println(name + ", you did not pass! If you didn't do this on purpose I feel sorry for you! You recieved a score of 0/8 on the test! You recieved a " + percent.format(score));
		}
		System.out.println("Thank you for playing the country quiz! I hope you enjoyed it! :)");
		sc.close();
	}	
}
