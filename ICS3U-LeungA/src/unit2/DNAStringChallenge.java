package unit2;
/**
Description: This program creates a DNA sequence
Date: December 2, 2024
@author: Adam Leung
 */
public class DNAStringChallenge {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		/**
      http://rosalind.info/problems/dna/
		 */
		// declaring the variables
		int A = 0;
		int C = 0;
		int G = 0;
		int T = 0;

		// printing out the DNA sequence
		for (int i = 1; i <= 21; i++) {
			if (Math.random() <= 0.25) {
				System.out.print("A");
				A++;
			}
			else if (Math.random() < 0.50 && Math.random() > 0.25) {
				System.out.print("C");
				C++;
			}
			else if (Math.random() < 0.75 && Math.random() > 0.50) {
				System.out.print("G");
				G++;
			}
			else {
				System.out.print("T");
				T++;
			}
		}
		System.out.println(" ");
		//Number of each base in the sequence
		System.out.println(A + " " + C + " " + G + " " + T);
	}
}