package unit3;
/**
Description:This program has many methods that do math calculations
Date: January 18, 2024
@author Adam Leung
 */
public class MathPlus {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		System.out.println(distance(3, 4, 5, 7));
		System.out.println(hypotenuse(21, 16));
		System.out.println(numOfFactors(256));
		System.out.println(isPrime(2));

		int [] arrayInt = {9, 4, 3, 66, 99};
		System.out.println(sum(arrayInt));
		System.out.println(min(arrayInt));
		System.out.println(max(arrayInt));
		System.out.println(bigDifference(arrayInt));

		double [] arrayDouble = {4.6, 78.5, 15.2, 0.1, 41.1};
		System.out.println(sum(arrayDouble));
		System.out.println(min(arrayDouble));
		System.out.println(max(arrayDouble));
		System.out.println(bigDifference(arrayDouble));
	}


	/**
	 *Description: This method finds the distance between two (x, y) coordinates 
	 *@param x1 -> x value of first coordinate
	 *@param y1 -> y value of first coordinate
	 *@param x2 -> x value of second coordinate
	 *@param y2 -> y value of second coordinate
	 *@return distance between the two (x, y) coordinates 
	 */
	public static double distance(int x1, int y1, int x2, int y2 ){
		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return distance;
	}
	/**
	 *Description: This method finds the length of the hypotenuse using the other two lengths of the triangle 
	 *@param length1 -> The length of first arm of the right angle triangle
	 *@param length1 -> The length of second arm of the right angle triangle
	 *@return length of the hypotenuse of the triangle created by the two lengths
	 */
	public static double hypotenuse(double length1, double length2){
		double hypotenuse = Math.sqrt(Math.pow(length1, 2) + Math.pow(length2, 2));
		return hypotenuse;
	}
	/**
	 *Description: This method finds the number of factors the integer has
	 *@param num -> any integer
	 *@return number of factors the integer has
	 */
	public static int numOfFactors(int num){
		int numOfFactors = 0;
		for(int i = num; i > 0; i --) {
			if(num % i == 0) {
				numOfFactors ++;
			}
		}
		return numOfFactors;
	}
	/**
	 *Description: This method finds if the integer is prime or not
	 *@param num -> any integer
	 *@return true if prime and false if not
	 */
	public static boolean isPrime(int num){
		boolean isPrime = numOfFactors(num) <= 2;
		return isPrime;
	}

	/**
	 *Description: This method finds the sum of all the ints (data type) in the array 
	 *@param nums -> an array of integers
	 *@return the sum of all integers in the nums array
	 */
	public static int sum(int[] array) {
		int total = 0;
		for (int i = array.length - 1; i >= 0; i-- ) {
			total += array[i];
		}
		return total;
	}
	/**
	 *Description: This method finds the sum of all the doubles (date type) in the array 
	 *@param nums -> an array of doubles
	 *@return sum of all doubles in the nums array
	 */
	public static double sum(double[] array) {
		double total = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			total += array[i];
		}
		return total;
	}
	/**
	 *Description: This method finds the smallest number (int data type) in the array returning its index 
	 *@param nums -> an array of integers
	 *@return index of smallest number in the nums array
	 */
	public static int min(int[] array) {
		int min = 0;

		for (int i = array.length; i > 0; i--) {
			if (array[i-1] < array[min]) {
				min = i-1;
			}
		}
		return min;
	}
	/**
	 *Description: This method finds the smallest number (double data type) in the array and returns its index 
	 *@param nums -> an array of doubles
	 *@return index of smallest number in the nums array
	 */
	public static double min(double[] array) {
		int min = 0;

		for (int i = array.length; i > 0; i--) {
			if (array[i-1] < array[min]) {
				min = i-1;
			}
		}
		return min;
	}
	/**
	 *Description: This method finds the largest number in the array and returns its index 
	 *@param nums -> an array of integer
	 *@return index of biggest number in the nums array
	 */
	public static int max(int[] array) {
		int max = 0;

		for (int i = array.length; i > 0; i--) {
			if (array[i-1] > array[max])
				max = i-1;
		}
		return max;
	}
	/**
	 *Description: This method finds the largest number in the array and returns its index 
	 *@param nums -> an array of doubles
	 *@return index of biggest number in the nums array
	 */
	public static int max(double[] array) {
		int max = 0;

		for (int i = array.length; i > 0; i--) {
			if (array[i-1] > array[max]) {
				max = i-1;
			}
		}
		return max;
	}
	/**
	 *Description: This method finds both the largest (int data type) and smallest (int data type) numbers in the array and returns the difference between the two
	 *@param nums -> an array of integers
	 *@return index of biggest number in the nums array
	 */
	public static int bigDifference(int[] array) {
		int max = 0;
		for (int i = array.length; i > 0; i--) {
			if (array[i-1] > array[max])
				max = i-1;
		}

		int min = 0;
		for (int i = array.length; i > 0; i--) {
			if (array[i-1] < array[min]) {
				min = i-1;
			}
		}
		int diff = array[max] - array[min];
		return diff;
	}

	/**
	 *Description: This method finds both the biggest (double data type) and smallest (double data type) numbers in the array and returns the difference between the two
	 *@param nums -> an array of doubles
	 *@return index of biggest number in the nums array
	 */
	public static double bigDifference(double[] array) {
		int max = 0;
		for (int i = array.length; i > 0; i--) {
			if (array[i-1] > array[max])
				max = i-1;
		}
		int min = 0;
		for (int i = array.length; i > 0; i--) {
			if (array[i-1] < array[min]) {
				min = i-1;
			}
		}
		double diff = array[max] - array[min];
		return diff;
	}

	/**
	 *Description: This method finds all of the factors of the number
	 *@param num -> any integer
	 *@return array of all the factors of the num
	 */
	public static int[] factors(int num){
		int[] factors = new int[numOfFactors(num)];
		int index = 0;
		for (int i = num; i > 0; i --) {
			if(num % i == 0) {
				factors[index] = i;
				index ++;
			}
		}return factors;
	}
}