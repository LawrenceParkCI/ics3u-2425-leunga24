package unit1;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Description: This program prints out a grocery receipt 
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
//Title and slogan
System.out.println("|| $$$ \\\\\\ ========== \"Mr.Leung's Grocery\" ========== /// $$$ ||");
System.out.printf("%50s", "The Freshest for Flaming Hot Prices!");
System.out.println("\n________________________________________________________________");
// Receives Product #1 input
System.out.println();
System.out.print("What would you like to buy?:");
Item = UPC.next();

System.out.print("How much does it cost?:");
Cost = UPC.nextDouble();

System.out.print("How many are you buying?:");
Quantity = UPC.nextInt();

System.out.println("Exceptional!");
//Receives Product #2 input
System.out.println();
System.out.print("What else would you like to buy?:");
Item2 = UPC.next();

System.out.print("How much does it cost?:");
Cost2 = UPC.nextDouble();

System.out.print("How many are you buying?:");
Quantity2 = UPC.nextInt();

System.out.println("Extravagant!");
//Print the Receipt
System.out.println();
System.out.println("This is your recipt:");
System.out.println();
System.out.println("|| $$$ \\\\\\ ========== \"Mr.Leung's Grocery\" ========== /// $$$ ||");
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
LocalDateTime now = LocalDateTime.now();  
System.out.println(dtf.format(now));
DecimalFormat money = new DecimalFormat("$#.00");
double Total1, Total2, FinalTotal, Tax, Sub, nearestFive;
final double TAX_RATE = 0.13;
Total1 = Quantity * Cost;
Total2 = Quantity2 * Cost2;
Sub = Total1 + Total2;
Tax = (Total1 + Total2) * TAX_RATE;
FinalTotal = (Total1 + Total2) + Tax;
int approx;
approx = (int) (Math.round(FinalTotal));
nearestFive = Math.round(FinalTotal/0.05)*0.05;

System.out.println();
System.out.printf("\n%-15s%-2s%-13s%3s%-14s%3s%12s", "Item", "|", "Cost", "| ", "Quantity", "| ", "Total Cost");
System.out.printf("\n_______________|_______________|________________|__________________");
System.out.printf("\n%-14s%2s%14s%3s%-14s%3s%10s", Item, "|", money.format(Cost), "| ", Quantity, "| ", money.format(Total1));
System.out.printf("\n%-14s%2s%14s%3s%-14s%3s%10s", Item2, "|", money.format(Cost2), "| ", Quantity2, "| ", money.format(Total2));
System.out.printf("\n_______________|_______________|________________|__________________");
System.out.printf("\n%49s%11s", "Subtotal:", money.format(Sub));
System.out.printf("\n%49s%11s","Tax:", money.format(Tax));
System.out.printf("\n%49s%11s","Total:", money.format(FinalTotal));
System.out.println();
System.out.println("Rounded to the nearest dollar, this is $" + approx);
System.out.println("Rounded to the nearest 5 cents, this is " + money.format(nearestFive));
System.out.println();
System.out.println("Thank you for shopping at Mr.Leung's Grocery!");
System.out.println("We hope to see you again soon!");
System.out.println("Have a nice day!");
UPC.close();
}
	}


