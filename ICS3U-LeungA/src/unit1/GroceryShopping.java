package unit1;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Description: This program 
 * Date: October 18, 2024
 * @author Adam Leung 
 */
public class GroceryShopping {
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {

Scanner UPC = new Scanner(System.in);
double Cost;
int Quantity;
String Item;
double Cost2;
int Quantity2;
String Item2;
//Title
System.out.println("|| $$$ \\\\\\ ========== \"Mr.Leung's Grocery\" ========== /// $$$ ||");
System.out.println("_____________________________________________________________________");
// Receives Product #1 input
System.out.print("What would you like to buy?:");
Item = UPC.next();

System.out.print("How much does it cost?:");
Cost = UPC.nextDouble();

System.out.print("How many are you buying?:");
Quantity = UPC.nextInt();

//Receives Product #2 input

System.out.print("What would you like to buy?:");
Item2 = UPC.next();

System.out.print("How much does it cost?:");
Cost2 = UPC.nextDouble();

System.out.print("How many are you buying?:");
Quantity2 = UPC.nextInt();

//Print the Receipt
System.out.println();
System.out.println("This is your recipt:");
System.out.println();
System.out.println("|| $$$ \\\\\\ ========== \"Mr.Leung's Grocery\" ========== /// $$$ ||");
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
LocalDateTime now = LocalDateTime.now();  
System.out.println(dtf.format(now));
DecimalFormat money = new DecimalFormat("$#.00");
double Total1, Total2;
Total1 = Quantity * Cost;
Total2 = Quantity2 * Cost2;
System.out.println();
System.out.printf("\n%7s%7s%9s%7s%9s%7s%14s", "Item", "|", "Cost", "|", "Quantity", "|", "Total Cost");
System.out.printf("\n__________________________________________________________________");
System.out.printf("\n%7s%7s%9s%7s%9s%7s%14s", Item, "|", money.format(Cost), "|", Quantity, "|", money.format(Total1));
System.out.printf("\n%7s%7s%9s%7s%9s%7s%14s", Item2, "|", money.format(Cost2), "|", Quantity2, "|", money.format(Total2));
System.out.printf("\n___________________________________________________________________");
UPC.close();
}
	}


