package unit1;

/**
* Description: This program teaches me more about Casting
* Date: October 15, 2024
* @author Adam Leung
*/
public class Casting2 {
  
  /**
   * This is the entry point to the program.
   * @param args unused
   */
  public static void main(String[] args) {
    /*
    Char and int
    */
    char myChar = 'a';
    System.out.println(myChar);
    System.out.println(myChar + 1);

    char myChar2 = (char) (myChar + 1);

    System.out.println(myChar2);

    //Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?
    // The system print the letter a because myChar = "a" and then it prints the number 98 (myChar + 1) and then the letter b (char) (myChar + 1). There is implicit casting used when (myChar + 1) making it convert from a letter to a number. There is explicit casting used when converting the number back into a letter.  
    //Why do you think this happens?
    //It happens because of ASCII
    //Investigate what is ASCII. What is it?
    //ASCII stands for  American Standard Code for Information Interchange, which represents text in computers, telecommunications equipment, and other devices.
    //Can you find the number value for 'a'? Does it match with your findings above?
    //The value for a small "a" is 97 which does match with the findings above because b is one more than that (98)
    //create a new character myCharCap, and transform myChar into a capital 'A' and print it
   
    char myCharCap;
    myCharCap = myChar;
    myCharCap = (char) (myCharCap - 32);
    System.out.println(myCharCap);
    

    

  }
}
