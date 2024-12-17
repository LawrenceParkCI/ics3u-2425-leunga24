package unit3;
/**
Description:
Date: December 17, 2024
@author Adam Leung
 */
public class MethodChallenge1 {
	public static void main( String[] args )    {
		// Complete the function below. Don't forget to comment.
		double d1 = distance(-2,1 , 1,5);
		System.out.println(" (-2,1) to (1,5) => " + d1 );

		double d2 = distance(-2,-3 , -4,4);
		System.out.println(" (-2,-3) to (-4,4) => " + d2 );

		System.out.println(" (2,-3) to (-1,-2) => " + distance(2,-3,-1,-2) );

		System.out.println(" (4,5) to (4,5) => " + distance(4,5,4,5) );
	}

	/**
 (Description)
 @param x1 -> x1 is the first number in the first coordinate that is displayed. x is the first first value in coordinates and y is the second.
 @param y1 -> y1 is the second number in the first coordinate that is displayed. 
 @param x2 -> x2 is the first number in the second coordinate that is displayed.
 @param y2 -> y2 is the second number in the second coordinate that is displayed.
 @return return prints out the distance between both coordinates. It is the outcome of when the function is applied.
	 */
	public static double distance( int x1, int y1, int x2, int y2 )
	{
		// put your code up in here
		double function = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2-y1), 2)));
		return function;
	}
}