package unit1;
/**
 * Description: This program prints both the rules of BINGO and a BINGO card
 * Date: September 26, 2024
 *@author Adam Leung
 */
public class Bingo {

	public static void main(String[] args) {
		// These are the rules and steps of the game BINGO
		System.out.printf("%25s", "BINGO Rules:");
		System.out.println("\n1. The caller randomly pulls a numbered BINGO ball.");
		System.out.println("2. The number is placed on the BINGO board and called out.");
		System.out.println("3. Players look for the called number on their BINGO card.");
		System.out.println("4. If the number is located, it is marked off.");
		System.out.println("5. Steps 1-4 are repeated until a player matches the BINGO pattern.");
		System.out.println("6. The winning player yells \"BINGO!\"");
		System.out.println("__________________________________________________________________");
		System.out.println("  ");
		// The following lines of code print out Adam's BINGO card
		System.out.printf("\n%29s", "Adam's BINGO Card!");
		System.out.println("\n________________________________________");
		System.out.printf("|%5s|%5s|%5s|%5s|%5s|", "B	", "I	", "N	", "G	", "O	");
		System.out.println("\n|_______|_______|_______|_______|_______|");
		System.out.printf("|%5s|%5s|%5s|%5s|%5s|", "10	", "20	", "36	", "47	", "71	");
		System.out.println("\n|_______|_______|_______|_______|_______|");
		System.out.printf("|%5s|%5s|%5s|%5s|%5s|", "4	", "16	", "35	", "53	", "70	");
		System.out.println("\n|_______|_______|_______|_______|_______|");
		System.out.printf("|%5s|%5s|%5s|%5s|%5s|"," 11	", "29	", " FREE!	", "54	", "64	");
		System.out.println("\n|_______|_______|_______|_______|_______|");
		System.out.printf("|%5s|%5s|%5s|%5s|%5s|"," 15	", "24	", "34	", "49	", "75	");
		System.out.println("\n|_______|_______|_______|_______|_______|");
		System.out.printf("|%5s|%5s|%5s|%5s|%5s|"," 12	", "18	", "40	", "58	", "72	");
		System.out.println("\n|_______|_______|_______|_______|_______|");
	}

}
