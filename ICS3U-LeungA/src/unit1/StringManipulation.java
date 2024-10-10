package unit1;

import java.util.Scanner;

/**
 * Description: This program displays a sentence in multiple different ways
 * Date: October 7, 2024
 * @author Adam Leung
 */
public class StringManipulation {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// User Input
		
		String sentence;
		
		System.out.print("Write any sentence you would like:");
		sentence = sc.nextLine();
		
		//Output
		System.out.println(sentence);
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence.toLowerCase());
		System.out.println(sentence.length());
		System.out.println(sentence.charAt(5));
		
		
		//bonus
		System.out.println("\nBONUS");
		
		//First Word
		System.out.println(sentence.substring(0, sentence.indexOf(" ")));
		
		//Last Word
		System.out.println(sentence.lastIndexOf(sentence.substring(sentence.indexOf(" "))));
		
		sc.close();
		
		
		
		
		
	}

}


