package unit2;
import java.util.Scanner;
/**
Description: This program teaches the programmer
Date: December 1, 2024
@author Adam Leung
*/
public class StringLengthAndChars {
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 */
  public static void main(String[] args) {
	  Scanner sc = new Scanner (System.in);
    /*
      Goal: Using string methods with a for loop
        .length()
        .charAt(<position>)
    */
    
    String name = "Ms. Kemp";

    //write comments for the following code - what does it print out, and why?
    System.out.println(name.length());
    //8 (length of the string)
    System.out.println(name.charAt(1));
    //s (character at index 1)
    System.out.println(name.charAt(2));
    //. (character at index 2)
    System.out.println(name.charAt(3));
    //' ' (character at index 3 which is just a space)
    //.length() gets the length of the sting which is 8. 
    //.charAt(position) gets the character at index 1 which is 's', gets the character at index 2 which is '.', and gets the character at index 3 which is ' '
        //counting starts at index 0 which is where character 'M' is

    /**
      Ask for user input for name. Print out each individual letter of the name on separate lines, using a for loop
    */
    String name1;
    int length;
    System.out.println("What is your name?");
    name1 = sc.nextLine();
    length = name1.length();
    for (int i = 0; i < length; i++) {
		System.out.println(name1.charAt(i));
	}
    sc.close();

  }
}