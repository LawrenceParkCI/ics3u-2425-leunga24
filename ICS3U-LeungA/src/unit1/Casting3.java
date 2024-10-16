package unit1;

/**
* Description: This program teaches me how to calculate the numbers in strings
* Date: October 16, 2024
* @author Adam Leung
*/
public class Casting3 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
 public static void main(String[] args) {
    /* 
    * Strings and Back Again
    */
    //Recall:
    System.out.println("Part 1");
    System.out.println("1 + 2 + 3" + 4 + 5);
    //why did it print out this way?
    //It printed out this way because it converts the integers into a string meaning it won't calculate the numbers as a math equation. The 1 + 2 + 3 is in quotations meaning you want it to be said and not calculated.
    //Demonstrate casting a double value to a String in this way
    System.out.println("1.45 + 4.75 + 5.74" + 5.76 + 4.98);
    //Demonstrate casting a boolean value to a String in this way
    System.out.println("True" + false);
    //Demonstrate casting a char value to a String in this way
	System.out.println(" a + b + c" + 'a');

    System.out.println("Part 2");
    //In order to change a String into an integer, we need another set of code
    
    String strNum = "-5";
    int myNum = Integer.parseInt(strNum);

    System.out.println(strNum + " x 2 = " + (myNum + myNum));

    /*Change strNum to the following values, and see if they work:
     * "25.2" No
     * "23c" No
     * "2 3" No
     * "Lol23" No
     * "-5" Yes = -10
    */
    //What can you say about how we can use the function, Integer.parseInt()?
    //It Converts a string into a integer value

    // What do you think the code to change a String to double would look like?
    //All thats needed to change a string to a double would be to change int into double (double myNum = Double.parseDouble(strNum);
    String strNum2 = "-8.4";
    double myNum2 = Double.parseDouble(strNum2);
    
    System.out.println(strNum2 + " x 2.4 = " + (myNum2 + myNum2));
    //When do you think it might be necessary to change a string value into an integer value/double value?
    //If you would ever need to calculate strings with numbers in it. In some cases in is more efficient than other ways
  }
}