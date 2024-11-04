package unit2;
/**
* Description: This program
* Date: November 04, 2024
* @author Adam Leung
*/

public class BasicBoolean {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
  public static void main(String[] args) {
    //we've declared a variable called isPurple of boolean type
    //Recall: boolean holds either True or False
    boolean isPurple = false;


    /*
      Boolean Operators, Expressions
    */

    //boolean expressions are ways we can "calculate" whether
    //something is true or false

    int firstNum = 5;
    int secondNum = 10;
    double thirdNum = 5.5;

    //this prints out True because secondNum is 10 which is greater than firstNum which is 5 making the statement true
    System.out.println("1: " + (firstNum < secondNum)); 

    //this prints out False because secondNum is 10 which is greater than firstNum which is 5 making the statement false
    System.out.println("2: " + (firstNum > secondNum)); 

    //this prints out True because thirdNum is 5.5 which gets converted to 5 which is equal to firstNum which is 5 making the statement true
    System.out.println("3: " + (firstNum <= (int)thirdNum)); 
    //this prints out True because thirdNum is 5.5 which is greater than firstNum which is 5 making the statement true
    System.out.println("4: " + (firstNum <= thirdNum)); 

    /*Test out these boolean operators. Figure out the meaning
      * > means: Greater than
      * < means: Less than
      * <= means: Less than or equal to
      * >= means: Greater than or equal to
      * == means: Equal to
      * != means: Does not equal to
    */

  }
}