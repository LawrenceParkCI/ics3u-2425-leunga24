package unit2;
/**
 * Description: This program teaches me more about if and else statements
 * Date: November 05, 2024
 * @author Adam Leung
 */

public class IfStatements1 {
	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		int firstNum = 10;
		int secondNum = 30;

		System.out.println("Part 1: If");
		System.out.println("----------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGLUL");
		}    

		//What prints out? Why?
		//Nothing prints out because there is no else code. The firstNum is not larger than the secondNum and there is no else code so nothing gets printed
		System.out.println("\nPart 2: If, Else");
		System.out.println("----------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		//"XQCL" prints out because the firsNum is not larger than the secondNum and now there is code for else

		System.out.println("\nPart 3: If, Else if, Else");
		System.out.println("-------------------------");
		if (firstNum > secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		//"sykSHY" prints out because the firstNum isn't larger than the secondNum and firstNum is divisible by 2 and secondNum is divisible by 3

		System.out.println("\nPart 4: What's the difference?");
		System.out.println("------------------------------");
		System.out.println(1);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		} else if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		} else {
			System.out.println("XQCL");
		}

		System.out.println(2);
		if (firstNum < secondNum) {
			System.out.println("KEKW");
			System.out.println("OMEGALUL");
		}

		if (firstNum % 2 == 0 && secondNum % 3 == 0){
			System.out.println("sykSHY");
		}

		if (!(firstNum < secondNum)) {
			System.out.println("XQCL");
		}

		//What prints out? Why?
		/*
		1
		KEKW
		OMEGALUL
		2
		KEKW
		OMEGALUL
		sykSHY
		This prints out because firstNum IS smaller than secondNum and firstNum is divisible by 2 and secondNum is divisible by 3 
		 */

		//What is the difference between the first and second part?
		//There is another if statement in the second part that would display "XQCL" if firstNum was not smaller than secondNum

	}
}