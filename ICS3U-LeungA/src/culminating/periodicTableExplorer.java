package culminating;
import hsa_new.Console;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
Description: This program explores the periodic table
Date: January 14, 2025
@author Adam Leung
 */
public class periodicTableExplorer {
	// Creates the console with 80 rows, 160 columns, and font size 18
	static Console c = new Console(500, 500, 18, "Periodic Table Explorer");
	public static void main(String[] args) {
		while (true) {
			//Show the main menu
			menu();
			if (!askToContinue()) {
				//Display the exit message
				c.println("Thank you for using the Periodic Table Explorer. I hope it helped you learn!"); 
				//Exits the program
				c.close();
			}
		}
	}
	//Displays the menu and does user input
	/**
	 * Description: This method is the menu and prompts the user to pick either an element, group, or period
	 */
	public static void menu() {
		c.clear();
		//welcomes user and gives user 3 options
		c.println("Welcome to the Periodic Table Explorer!");
		c.println("\n1. Explore an Element");
		c.println("2. Explore a Group");
		c.println("3. Explore a Period");
		c.print("\nEnter your choice (1-3): ");
		c.print("");	
		BufferedImage table = null;
		//This gets user's choice
		int choice = c.readInt();
		switch (choice) {
		//This explores the given element
		case 1:  
			c.print("Enter the element symbol or name: ");
			try {
				table = ImageIO.read(new File("src/photos/Periodic_Table (1).png"));
			} catch (IOException e) {
				c.println("There was an error loading the image.");
				e.printStackTrace(); //prints the error and line of code
			}
			c.drawImage (table, 820, 0, 700, 500, null);
			String element = c.readLine();
			c.print("\n");
			//calls the elements method
			elements(element);
			break;
			//This explores the given group
		case 2:  
			c.print("Enter the group number: ");
			try {
				table = ImageIO.read(new File("src/photos/Periodic_Table (1).png"));
			} catch (IOException e) {
				c.println("There was an error loading the image.");
				e.printStackTrace(); //prints the error and line of code
			}
			c.drawImage (table, 820, 0, 700, 500, null);
			int group = c.readInt();
			c.print("\n");
			groups(group);
			break;
			//This explores the given period
		case 3:  
			c.print("Enter the period number: ");
			try {
				table = ImageIO.read(new File("src/photos/Periodic_Table (1).png"));
			} catch (IOException e) {
				c.println("There was an error loading the image.");
				e.printStackTrace(); //prints the error and line of code
			}
			c.drawImage (table, 820, 0, 700, 500, null);
			int period = c.readInt();
			c.print("\n");
			periods(period);
			break;
			//This will tell the user that it is't an option
		default:  
			c.println("That is not an option.");
		}}
	/**
	 * Description: This method displays information about each element
	 * @param element -> the symbol or name of the element
	 */
	public static void elements(String element) {
		//covers up the image
		c.setColor(Color.WHITE);
		c.fillRect(820, 0, 700, 500);
		//displays all the relevant information for the given element
		if (element.equalsIgnoreCase("H") || element.equalsIgnoreCase("Hydrogen")){
			c.println("Element: Hydrogen (H)");
			c.println("Atomic Number: 1");
			c.println("Atomic Mass: 1.008");
			c.println("State: Gas");
			c.println("Valence Electrons: 1");
			c.println("Group: 1, Period: 1");
		} else if (element.equalsIgnoreCase("He") || element.equalsIgnoreCase("Helium")){
			c.println("Element: Helium (He)");
			c.println("Atomic Number: 2");
			c.println("Atomic Mass: 4.0026");
			c.println("State: Gas");
			c.println("Valence Electrons: 2");
			c.println("Group: 18, Period: 1");
		}else if (element.equalsIgnoreCase("Li") || element.equalsIgnoreCase("Lithium")){
			c.println("Element: Lithium (Li)");
			c.println("Atomic Number: 3");
			c.println("Atomic Mass: 6.94");
			c.println("State: Solid");
			c.println("Valence Electrons: 1");
			c.println("Group: 1, Period: 2");
		} else if (element.equalsIgnoreCase("Be") || element.equalsIgnoreCase("Beryllium")){
			c.println("Element: Beryllium (Be)");
			c.println("Atomic Number: 4");
			c.println("Atomic Mass: 9.0122");
			c.println("State: Solid");
			c.println("Valence Electrons: 2");
			c.println("Group: 2, Period: 2");
		} else if (element.equalsIgnoreCase("B") || element.equalsIgnoreCase("Boron")){
			c.println("Element: Boron (B)");
			c.println("Atomic Number: 5");
			c.println("Atomic Mass: 10.81");
			c.println("State: Solid");
			c.println("Valence Electrons: 3");
			c.println("Group: 13, Period: 2");
		} else if (element.equalsIgnoreCase("C") || element.equalsIgnoreCase("Carbon")){
			c.println("Element: Carbon (C)");
			c.println("Atomic Number: 6");
			c.println("Atomic Mass: 12.011");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 14, Period: 2");
		} else if (element.equalsIgnoreCase("N") || element.equalsIgnoreCase("Nitrogen")){
			c.println("Element: Nitrogen (N)");
			c.println("Atomic Number: 7");
			c.println("Atomic Mass: 14.007");
			c.println("State: Gas");
			c.println("Valence Electrons: 5");
			c.println("Group: 15, Period: 2");
		} else if (element.equalsIgnoreCase("O") || element.equalsIgnoreCase("Oxygen")){
			c.println("Element: Oxygen (O)");
			c.println("Atomic Number: 8");
			c.println("Atomic Mass: 15.999");
			c.println("State: Gas");
			c.println("Valence Electrons: 6");
			c.println("Group: 16, Period: 2");
		} else if (element.equalsIgnoreCase("F") || element.equalsIgnoreCase("Fluorine")){
			c.println("Element: Fluorine (F)");
			c.println("Atomic Number: 9");
			c.println("Atomic Mass: 18.998");
			c.println("State: Gas");
			c.println("Valence Electrons: 7");
			c.println("Group: 17, Period: 2");
		} else if (element.equalsIgnoreCase("Ne") || element.equalsIgnoreCase("Neon")){
			c.println("Element: Neon (Ne)");
			c.println("Atomic Number: 10");
			c.println("Atomic Mass: 20.180");
			c.println("State: Gas");
			c.println("Valence Electrons: 8");
			c.println("Group: 18, Period: 2");
		} else if (element.equalsIgnoreCase("Na") || element.equalsIgnoreCase("Sodium")){
			c.println("Element: Sodium (Na)");
			c.println("Atomic Number: 11");
			c.println("Atomic Mass: 22.990");
			c.println("State: Solid");
			c.println("Valence Electrons: 1");
			c.println("Group: 1, Period: 3");
		} else if (element.equalsIgnoreCase("Mg") || element.equalsIgnoreCase("Magnesium")){
			c.println("Element: Magnesium (Mg)");
			c.println("Atomic Number: 12");
			c.println("Atomic Mass: 24.305");
			c.println("State: Solid");
			c.println("Valence Electrons: 2");
			c.println("Group: 2, Period: 3");
		} else if (element.equalsIgnoreCase("Al") || element.equalsIgnoreCase("Aluminum")){
			c.println("Element: Aluminum (Al)");
			c.println("Atomic Number: 13");
			c.println("Atomic Mass: 26.982");
			c.println("State: Solid");
			c.println("Valence Electrons: 3");
			c.println("Group: 13, Period: 3");
		} else if (element.equalsIgnoreCase("Si") || element.equalsIgnoreCase("Silicon")){
			c.println("Element: Silicon (Si)");
			c.println("Atomic Number: 14");
			c.println("Atomic Mass: 28.085");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 14, Period: 3");
		} else if (element.equalsIgnoreCase("P") || element.equalsIgnoreCase("Phosphorus")){
			c.println("Element: Phosphorus (P)");
			c.println("Atomic Number: 15");
			c.println("Atomic Mass: 30.974");
			c.println("State: Solid");
			c.println("Valence Electrons: 5");
			c.println("Group: 15, Period: 3");
		} else if (element.equalsIgnoreCase("S") || element.equalsIgnoreCase("Sulfur")){
			c.println("Element: Sulfur (S)");
			c.println("Atomic Number: 16");
			c.println("Atomic Mass: 32.06");
			c.println("State: Solid");
			c.println("Valence Electrons: 6");
			c.println("Group: 16, Period: 3");
		} else if (element.equalsIgnoreCase("Cl") || element.equalsIgnoreCase("Chlorine")){
			c.println("Element: Chlorine (Cl)");
			c.println("Atomic Number: 17");
			c.println("Atomic Mass: 35.45");
			c.println("State: Gas");
			c.println("Valence Electrons: 7");
			c.println("Group: 17, Period: 3");
		} else if (element.equalsIgnoreCase("Ar") || element.equalsIgnoreCase("Argon")){
			c.println("Element: Argon (Ar)");
			c.println("Atomic Number: 18");
			c.println("Atomic Mass: 39.948");
			c.println("State: Gas");
			c.println("Valence Electrons: 8");
			c.println("Group: 18, Period: 3");
		} else if (element.equalsIgnoreCase("K") || element.equalsIgnoreCase("Potassium")){
			c.println("Element: Potassium (K)");
			c.println("Atomic Number: 19");
			c.println("Atomic Mass: 39.098");
			c.println("State: Solid");
			c.println("Valence Electrons: 1");
			c.println("Group: 1, Period: 4");
		} else if (element.equalsIgnoreCase("Ca") || element.equalsIgnoreCase("Calcium")){
			c.println("Element: Calcium (Ca)");
			c.println("Atomic Number: 20");
			c.println("Atomic Mass: 40.078");
			c.println("State: Solid");
			c.println("Valence Electrons: 2");
			c.println("Group: 2, Period: 4");
		} else if (element.equalsIgnoreCase("Sc") || element.equalsIgnoreCase("Scandium")){
			c.println("Element: Scandium (Sc)");
			c.println("Atomic Number: 21");
			c.println("Atomic Mass: 44.956");
			c.println("State: Solid");
			c.println("Valence Electrons: 3");
			c.println("Group: 3, Period: 4");
		} else if (element.equalsIgnoreCase("Ti") || element.equalsIgnoreCase("Titanium")){
			c.println("Element: Titanium (Ti)");
			c.println("Atomic Number: 22");
			c.println("Atomic Mass: 47.867");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 4, Period: 4");
		} else if (element.equalsIgnoreCase("V") || element.equalsIgnoreCase("Vanadium")){
			c.println("Element: Vanadium (V)");
			c.println("Atomic Number: 23");
			c.println("Atomic Mass: 50.942");
			c.println("State: Solid");
			c.println("Valence Electrons: 5");
			c.println("Group: 5, Period: 4");
		} else if (element.equalsIgnoreCase("Cr") || element.equalsIgnoreCase("Chromium")){
			c.println("Element: Chromium (Cr)");
			c.println("Atomic Number: 24");
			c.println("Atomic Mass: 52.0");
			c.println("State: Solid");
			c.println("Valence Electrons: 6");
			c.println("Group: 6, Period: 4");
		} else if (element.equalsIgnoreCase("Mn") || element.equalsIgnoreCase("Manganese")){
			c.println("Element: Manganese (Mn)");
			c.println("Atomic Number: 25");
			c.println("Atomic Mass: 54.938");
			c.println("State: Solid");
			c.println("Valence Electrons: 7");
			c.println("Group: 7, Period: 4");
		} else if (element.equalsIgnoreCase("Fe") || element.equalsIgnoreCase("Iron")){
			c.println("Element: Iron (Fe)");
			c.println("Atomic Number: 26");
			c.println("Atomic Mass: 55.845");
			c.println("State: Solid");
			c.println("Valence Electrons: 8");
			c.println("Group: 8, Period: 4");
		} else if (element.equalsIgnoreCase("Co") || element.equalsIgnoreCase("Cobalt")){
			c.println("Element: Cobalt (Co)");
			c.println("Atomic Number: 27");
			c.println("Atomic Mass: 58.933");
			c.println("State: Solid");
			c.println("Valence Electrons: 9");
			c.println("Group: 9, Period: 4");
		} else if (element.equalsIgnoreCase("Ni") || element.equalsIgnoreCase("Nickel")){
			c.println("Element: Nickel (Ni)");
			c.println("Atomic Number: 28");
			c.println("Atomic Mass: 58.693");
			c.println("State: Solid");
			c.println("Valence Electrons: 10");
			c.println("Group: 10, Period: 4");
		} else if (element.equalsIgnoreCase("Cu") || element.equalsIgnoreCase("Copper")){
			c.println("Element: Copper (Cu)");
			c.println("Atomic Number: 29");
			c.println("Atomic Mass: 63.546");
			c.println("State: Solid");
			c.println("Valence Electrons: 11");
			c.println("Group: 11, Period: 4");
		} else if (element.equalsIgnoreCase("Zn") || element.equalsIgnoreCase("Zinc")){
			c.println("Element: Zinc (Zn)");
			c.println("Atomic Number: 30");
			c.println("Atomic Mass: 65.38");
			c.println("State: Solid");
			c.println("Valence Electrons: 12");
			c.println("Group: 12, Period: 4");
		} else if (element.equalsIgnoreCase("Ga") || element.equalsIgnoreCase("Gallium")){
			c.println("Element: Gallium (Ga)");
			c.println("Atomic Number: 31");
			c.println("Atomic Mass: 69.723");
			c.println("State: Solid");
			c.println("Valence Electrons: 3");
			c.println("Group: 13, Period: 4");
		} else if (element.equalsIgnoreCase("Ge") || element.equalsIgnoreCase("Germanium")){
			c.println("Element: Germanium (Ge)");
			c.println("Atomic Number: 32");
			c.println("Atomic Mass: 72.63");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 14, Period: 4");
		} else if (element.equalsIgnoreCase("As") || element.equalsIgnoreCase("Arsenic")){
			c.println("Element: Arsenic (As)");
			c.println("Atomic Number: 33");
			c.println("Atomic Mass: 74.922");
			c.println("State: Solid");
			c.println("Valence Electrons: 5");
			c.println("Group: 15, Period: 4");
		} else if (element.equalsIgnoreCase("Se") || element.equalsIgnoreCase("Selenium")){
			c.println("Element: Selenium (Se)");
			c.println("Atomic Number: 34");
			c.println("Atomic Mass: 78.971");
			c.println("State: Solid");
			c.println("Valence Electrons: 6");
			c.println("Group: 16, Period: 4");
		} else if (element.equalsIgnoreCase("Br") || element.equalsIgnoreCase("Bromine")){
			c.println("Element: Bromine (Br)");
			c.println("Atomic Number: 35");
			c.println("Atomic Mass: 79.904");
			c.println("State: Liquid");
			c.println("Valence Electrons: 7");
			c.println("Group: 17, Period: 4");
		} else if (element.equalsIgnoreCase("Kr") || element.equalsIgnoreCase("Krypton")){
			c.println("Element: Krypton (Kr)");
			c.println("Atomic Number: 36");
			c.println("Atomic Mass: 83.798");
			c.println("State: Gas");
			c.println("Valence Electrons: 8");
			c.println("Group: 18, Period: 4");
		}    else if (element.equalsIgnoreCase("Rb") || element.equalsIgnoreCase("Rubidium")){
			c.println("Element: Rubidium (Rb)");
			c.println("Atomic Number: 37");
			c.println("Atomic Mass: 85.468");
			c.println("State: Solid");
			c.println("Valence Electrons: 1");
			c.println("Group: 1, Period: 5");
		} else if (element.equalsIgnoreCase("Sr") || element.equalsIgnoreCase("Strontium")){
			c.println("Element: Strontium (Sr)");
			c.println("Atomic Number: 38");
			c.println("Atomic Mass: 87.62");
			c.println("State: Solid");
			c.println("Valence Electrons: 2");
			c.println("Group: 2, Period: 5");
		} else if (element.equalsIgnoreCase("Y") || element.equalsIgnoreCase("Yttrium")){
			c.println("Element: Yttrium (Y)");
			c.println("Atomic Number: 39");
			c.println("Atomic Mass: 88.906");
			c.println("State: Solid");
			c.println("Valence Electrons: 3");
			c.println("Group: 3, Period: 5");
		}else if (element.equalsIgnoreCase("Zr") || element.equalsIgnoreCase("Zirconium")){
			c.println("Element: Zirconium (Zr)");
			c.println("Atomic Number: 40");
			c.println("Atomic Mass: 91.224");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 4, Period: 5");
		} else if (element.equalsIgnoreCase("Nb") || element.equalsIgnoreCase("Niobium")){
			c.println("Element: Niobium (Nb)");
			c.println("Atomic Number: 41");
			c.println("Atomic Mass: 92.906");
			c.println("State: Solid");
			c.println("Valence Electrons: 5");
			c.println("Group: 5, Period: 5");
		} else if (element.equalsIgnoreCase("Mo") || element.equalsIgnoreCase("Molybdenum")){
			c.println("Element: Molybdenum (Mo)");
			c.println("Atomic Number: 42");
			c.println("Atomic Mass: 95.95");
			c.println("State: Solid");
			c.println("Valence Electrons: 6");
			c.println("Group: 6, Period: 5");
		} else if (element.equalsIgnoreCase("Tc") || element.equalsIgnoreCase("Technetium")){
			c.println("Element: Technetium (Tc)");
			c.println("Atomic Number: 43");
			c.println("Atomic Mass: 98");
			c.println("State: Solid");
			c.println("Valence Electrons: 7");
			c.println("Group: 7, Period: 5");
		} else if (element.equalsIgnoreCase("Ru") || element.equalsIgnoreCase("Ruthenium")){
			c.println("Element: Ruthenium (Ru)");
			c.println("Atomic Number: 44");
			c.println("Atomic Mass: 101.07");
			c.println("State: Solid");
			c.println("Valence Electrons: 8");
			c.println("Group: 8, Period: 5");
		} else if (element.equalsIgnoreCase("Rh") || element.equalsIgnoreCase("Rhodium")){
			c.println("Element: Rhodium (Rh)");
			c.println("Atomic Number: 45");
			c.println("Atomic Mass: 102.91");
			c.println("State: Solid");
			c.println("Valence Electrons: 9");
			c.println("Group: 9, Period: 5");
		} else if (element.equalsIgnoreCase("Pd") || element.equalsIgnoreCase("Palladium")){
			c.println("Element: Palladium (Pd)");
			c.println("Atomic Number: 46");
			c.println("Atomic Mass: 106.42");
			c.println("State: Solid");
			c.println("Valence Electrons: 10");
			c.println("Group: 10, Period: 5");
		} else if (element.equalsIgnoreCase("Ag") || element.equalsIgnoreCase("Silver")){
			c.println("Element: Silver (Ag)");
			c.println("Atomic Number: 47");
			c.println("Atomic Mass: 107.87");
			c.println("State: Solid");
			c.println("Valence Electrons: 11");
			c.println("Group: 11, Period: 5");
		} else if (element.equalsIgnoreCase("Cd") || element.equalsIgnoreCase("Cadmium")){
			c.println("Element: Cadmium (Cd)");
			c.println("Atomic Number: 48");
			c.println("Atomic Mass: 112.41");
			c.println("State: Solid");
			c.println("Valence Electrons: 12");
			c.println("Group: 12, Period: 5");
		} else if (element.equalsIgnoreCase("In") || element.equalsIgnoreCase("Indium")){
			c.println("Element: Indium (In)");
			c.println("Atomic Number: 49");
			c.println("Atomic Mass: 114.82");
			c.println("State: Solid");
			c.println("Valence Electrons: 3");
			c.println("Group: 13, Period: 5");
		} else if (element.equalsIgnoreCase("Sn") || element.equalsIgnoreCase("Tin")){
			c.println("Element: Tin (Sn)");
			c.println("Atomic Number: 50");
			c.println("Atomic Mass: 118.71");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 14, Period: 5");
		} else if (element.equalsIgnoreCase("Sb") || element.equalsIgnoreCase("Antimony")){
			c.println("Element: Antimony (Sb)");
			c.println("Atomic Number: 51");
			c.println("Atomic Mass: 121.76");
			c.println("State: Solid");
			c.println("Valence Electrons: 5");
			c.println("Group: 15, Period: 5");
		} else if (element.equalsIgnoreCase("I") || element.equalsIgnoreCase("Iodine")){
			c.println("Element: Iodine (I)");
			c.println("Atomic Number: 53");
			c.println("Atomic Mass: 126.90");
			c.println("State: Solid");
			c.println("Valence Electrons: 7");
			c.println("Group: 17, Period: 5");
		} else if (element.equalsIgnoreCase("Xe") || element.equalsIgnoreCase("Xenon")){
			c.println("Element: Xenon (Xe)");
			c.println("Atomic Number: 54");
			c.println("Atomic Mass: 131.29");
			c.println("State: Gas");
			c.println("Valence Electrons: 8");
			c.println("Group: 18, Period: 5");
		} else if (element.equalsIgnoreCase("Cs") || element.equalsIgnoreCase("Cesium")){
			c.println("Element: Cesium (Cs)");
			c.println("Atomic Number: 55");
			c.println("Atomic Mass: 132.91");
			c.println("State: Solid");
			c.println("Valence Electrons: 1");
			c.println("Group: 1, Period: 6");
		} else if (element.equalsIgnoreCase("Ba") || element.equalsIgnoreCase("Barium")){
			c.println("Element: Barium (Ba)");
			c.println("Atomic Number: 56");
			c.println("Atomic Mass: 137.33");
			c.println("State: Solid");
			c.println("Valence Electrons: 2");
			c.println("Group: 2, Period: 6");
		} else if (element.equalsIgnoreCase("La") || element.equalsIgnoreCase("Lanthanum")){
			c.println("Element: Lanthanum (La)");
			c.println("Atomic Number: 57");
			c.println("Atomic Mass: 138.91");
			c.println("State: Solid");
			c.println("Valence Electrons: 3");
			c.println("Group: 3, Period: 6");
		} else if (element.equalsIgnoreCase("Ce") || element.equalsIgnoreCase("Cerium")){
			c.println("Element: Cerium (Ce)");
			c.println("Atomic Number: 58");
			c.println("Atomic Mass: 140.12");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 3, Period: 6");
		} else if (element.equalsIgnoreCase("Pr") || element.equalsIgnoreCase("Praseodymium")){
			c.println("Element: Praseodymium (Pr)");
			c.println("Atomic Number: 59");
			c.println("Atomic Mass: 140.91");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 3, Period: 6");
		} else if (element.equalsIgnoreCase("Nd") || element.equalsIgnoreCase("Neodymium")){
			c.println("Element: Neodymium (Nd)");
			c.println("Atomic Number: 60");
			c.println("Atomic Mass: 144.24");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 3, Period: 6");
		} else if (element.equalsIgnoreCase("Pm") || element.equalsIgnoreCase("Promethium")){
			c.println("Element: Promethium (Pm)");
			c.println("Atomic Number: 61");
			c.println("Atomic Mass: 145");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 3, Period: 6");
		} else if (element.equalsIgnoreCase("Sm") || element.equalsIgnoreCase("Samarium")){
			c.println("Element: Samarium (Sm)");
			c.println("Atomic Number: 62");
			c.println("Atomic Mass: 150.36");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 3, Period: 6");
		} else if (element.equalsIgnoreCase("Eu") || element.equalsIgnoreCase("Europium")){
			c.println("Element: Europium (Eu)");
			c.println("Atomic Number: 63");
			c.println("Atomic Mass: 151.98");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 3, Period: 6");
		} else if (element.equalsIgnoreCase("Gd") || element.equalsIgnoreCase("Gadolinium")){
			c.println("Element: Gadolinium (Gd)");
			c.println("Atomic Number: 64");
			c.println("Atomic Mass: 157.25");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 3, Period: 6");
		} else if (element.equalsIgnoreCase("Tb") || element.equalsIgnoreCase("Terbium")){
			c.println("Element: Terbium (Tb)");
			c.println("Atomic Number: 65");
			c.println("Atomic Mass: 158.93");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 3, Period: 6");
		} else if (element.equalsIgnoreCase("Dy") || element.equalsIgnoreCase("Dysprosium")){
			c.println("Element: Dysprosium (Dy)");
			c.println("Atomic Number: 66");
			c.println("Atomic Mass: 162.50");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 3, Period: 6");
		} else if (element.equalsIgnoreCase("Ho") || element.equalsIgnoreCase("Holmium")){
			c.println("Element: Holmium (Ho)");
			c.println("Atomic Number: 67");
			c.println("Atomic Mass: 164.93");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 3, Period: 6");
		} else if (element.equalsIgnoreCase("Er") || element.equalsIgnoreCase("Erbium")){
			c.println("Element: Erbium (Er)");
			c.println("Atomic Number: 68");
			c.println("Atomic Mass: 167.26");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 3, Period: 6");
		} else if (element.equalsIgnoreCase("Tm") || element.equalsIgnoreCase("Thulium")){
			c.println("Element: Thulium (Tm)");
			c.println("Atomic Number: 69");
			c.println("Atomic Mass: 168.93");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 3, Period: 6");
		} else if (element.equalsIgnoreCase("Yb") || element.equalsIgnoreCase("Ytterbium")){
			c.println("Element: Ytterbium (Yb)");
			c.println("Atomic Number: 70");
			c.println("Atomic Mass: 173.04");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 3, Period: 6");
		} else if (element.equalsIgnoreCase("Lu") || element.equalsIgnoreCase("Lutetium")){
			c.println("Element: Lutetium (Lu)");
			c.println("Atomic Number: 71");
			c.println("Atomic Mass: 175.00");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 3, Period: 6");
		} else if (element.equalsIgnoreCase("Hf") || element.equalsIgnoreCase("Hafnium")){
			c.println("Element: Hafnium (Hf)");
			c.println("Atomic Number: 72");
			c.println("Atomic Mass: 178.49");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 4, Period: 6");
		}else if (element.equalsIgnoreCase("Ta") || element.equalsIgnoreCase("Tantalum")){
			c.println("Element: Tantalum (Ta)");
			c.println("Atomic Number: 73");
			c.println("Atomic Mass: 180.95");
			c.println("State: Solid");
			c.println("Valence Electrons: 5");
			c.println("Group: 5, Period: 6");
		} else if (element.equalsIgnoreCase("W") || element.equalsIgnoreCase("Tungsten")){
			c.println("Element: Tungsten (W)");
			c.println("Atomic Number: 74");
			c.println("Atomic Mass: 183.84");
			c.println("State: Solid");
			c.println("Valence Electrons: 6");
			c.println("Group: 6, Period: 6");
		} else if (element.equalsIgnoreCase("Re") || element.equalsIgnoreCase("Rhenium")){
			c.println("Element: Rhenium (Re)");
			c.println("Atomic Number: 75");
			c.println("Atomic Mass: 186.21");
			c.println("State: Solid");
			c.println("Valence Electrons: 7");
			c.println("Group: 7, Period: 6");
		} else if (element.equalsIgnoreCase("Os") || element.equalsIgnoreCase("Osmium")){
			c.println("Element: Osmium (Os)");
			c.println("Atomic Number: 76");
			c.println("Atomic Mass: 190.23");
			c.println("State: Solid");
			c.println("Valence Electrons: 8");
			c.println("Group: 8, Period: 6");
		} else if (element.equalsIgnoreCase("Ir") || element.equalsIgnoreCase("Iridium")){
			c.println("Element: Iridium (Ir)");
			c.println("Atomic Number: 77");
			c.println("Atomic Mass: 192.22");
			c.println("State: Solid");
			c.println("Valence Electrons: 9");
			c.println("Group: 9, Period: 6");
		} else if (element.equalsIgnoreCase("Pt") || element.equalsIgnoreCase("Platinum")){
			c.println("Element: Platinum (Pt)");
			c.println("Atomic Number: 78");
			c.println("Atomic Mass: 195.08");
			c.println("State: Solid");
			c.println("Valence Electrons: 10");
			c.println("Group: 10, Period: 6");
		} else if (element.equalsIgnoreCase("Au") || element.equalsIgnoreCase("Gold")){
			c.println("Element: Gold (Au)");
			c.println("Atomic Number: 79");
			c.println("Atomic Mass: 196.97");
			c.println("State: Solid");
			c.println("Valence Electrons: 11");
			c.println("Group: 11, Period: 6");
		} else if (element.equalsIgnoreCase("Hg") || element.equalsIgnoreCase("Mercury")){
			c.println("Element: Mercury (Hg)");
			c.println("Atomic Number: 80");
			c.println("Atomic Mass: 200.59");
			c.println("State: Liquid");
			c.println("Valence Electrons: 12");
			c.println("Group: 12, Period: 6");
		} else if (element.equalsIgnoreCase("Tl") || element.equalsIgnoreCase("Thallium")){
			c.println("Element: Thallium (Tl)");
			c.println("Atomic Number: 81");
			c.println("Atomic Mass: 204.38");
			c.println("State: Solid");
			c.println("Valence Electrons: 3");
			c.println("Group: 13, Period: 6");
		} else if (element.equalsIgnoreCase("Pb") || element.equalsIgnoreCase("Lead")){
			c.println("Element: Lead (Pb)");
			c.println("Atomic Number: 82");
			c.println("Atomic Mass: 207.2");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 14, Period: 6");
		} else if (element.equalsIgnoreCase("Bi") || element.equalsIgnoreCase("Bismuth")){
			c.println("Element: Bismuth (Bi)");
			c.println("Atomic Number: 83");
			c.println("Atomic Mass: 208.98");
			c.println("State: Solid");
			c.println("Valence Electrons: 5");
			c.println("Group: 15, Period: 6");
		} else if (element.equalsIgnoreCase("Po") || element.equalsIgnoreCase("Polonium")){
			c.println("Element: Polonium (Po)");
			c.println("Atomic Number: 84");
			c.println("Atomic Mass: 209");
			c.println("State: Solid");
			c.println("Valence Electrons: 6");
			c.println("Group: 16, Period: 6");
		} else if (element.equalsIgnoreCase("At") || element.equalsIgnoreCase("Astatine")){
			c.println("Element: Astatine (At)");
			c.println("Atomic Number: 85");
			c.println("Atomic Mass: 210");
			c.println("State: Solid");
			c.println("Valence Electrons: 7");
			c.println("Group: 17, Period: 6");
		} else if (element.equalsIgnoreCase("Rn") || element.equalsIgnoreCase("Radon")){
			c.println("Element: Radon (Rn)");
			c.println("Atomic Number: 86");
			c.println("Atomic Mass: 222");
			c.println("State: Gas");
			c.println("Valence Electrons: 8");
			c.println("Group: 18, Period: 6");
		} else if (element.equalsIgnoreCase("Fr") || element.equalsIgnoreCase("Francium")){
			c.println("Element: Francium (Fr)");
			c.println("Atomic Number: 87");
			c.println("Atomic Mass: 223");
			c.println("State: Solid");
			c.println("Valence Electrons: 1");
			c.println("Group: 1, Period: 7");
		} else if (element.equalsIgnoreCase("Ra") || element.equalsIgnoreCase("Radium")){
			c.println("Element: Radium (Ra)");
			c.println("Atomic Number: 88");
			c.println("Atomic Mass: 226");
			c.println("State: Solid");
			c.println("Valence Electrons: 2");
			c.println("Group: 2, Period: 7");
		} else if (element.equalsIgnoreCase("Ac") || element.equalsIgnoreCase("Actinium")){
			c.println("Element: Actinium (Ac)");
			c.println("Atomic Number: 89");
			c.println("Atomic Mass: 227");
			c.println("State: Solid");
			c.println("Valence Electrons: 3");
			c.println("Group: 3, Period: 7");
		} else if (element.equalsIgnoreCase("Th") || element.equalsIgnoreCase("Thorium")){
			c.println("Element: Thorium (Th)");
			c.println("Atomic Number: 90");
			c.println("Atomic Mass: 232.04");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 3, Period: 7");
		} else if (element.equalsIgnoreCase("Pa") || element.equalsIgnoreCase("Protactinium")){
			c.println("Element: Protactinium (Pa)");
			c.println("Atomic Number: 91");
			c.println("Atomic Mass: 231.04");
			c.println("State: Solid");
			c.println("Valence Electrons: 5");
			c.println("Group: 3, Period: 7");
		} else if (element.equalsIgnoreCase("U") || element.equalsIgnoreCase("Uranium")){
			c.println("Element: Uranium (U)");
			c.println("Atomic Number: 92");
			c.println("Atomic Mass: 238.03");
			c.println("State: Solid");
			c.println("Valence Electrons: 6");
			c.println("Group: 3, Period: 7");
		} else if (element.equalsIgnoreCase("Np") || element.equalsIgnoreCase("Neptunium")){
			c.println("Element: Neptunium (Np)");
			c.println("Atomic Number: 93");
			c.println("Atomic Mass: 237");
			c.println("State: Solid");
			c.println("Valence Electrons: 7");
			c.println("Group: 3, Period: 7");
		} else if (element.equalsIgnoreCase("Pu") || element.equalsIgnoreCase("Plutonium")){
			c.println("Element: Plutonium (Pu)");
			c.println("Atomic Number: 94");
			c.println("Atomic Mass: 244");
			c.println("State: Solid");
			c.println("Valence Electrons: 8");
			c.println("Group: 3, Period: 7");
		} else if (element.equalsIgnoreCase("Am") || element.equalsIgnoreCase("Americium")){
			c.println("Element: Americium (Am)");
			c.println("Atomic Number: 95");
			c.println("Atomic Mass: 243");
			c.println("State: Solid");
			c.println("Valence Electrons: 9");
			c.println("Group: 3, Period: 7");
		} else if (element.equalsIgnoreCase("Cm") || element.equalsIgnoreCase("Curium")){
			c.println("Element: Curium (Cm)");
			c.println("Atomic Number: 96");
			c.println("Atomic Mass: 247");
			c.println("State: Solid");
			c.println("Valence Electrons: 10");
			c.println("Group: 3, Period: 7");
		} else if (element.equalsIgnoreCase("Bk") || element.equalsIgnoreCase("Berkelium")){
			c.println("Element: Berkelium (Bk)");
			c.println("Atomic Number: 97");
			c.println("Atomic Mass: 247");
			c.println("State: Solid");
			c.println("Valence Electrons: 11");
			c.println("Group: 3, Period: 7");
		} else if (element.equalsIgnoreCase("Cf") || element.equalsIgnoreCase("Californium")){
			c.println("Element: Californium (Cf)");
			c.println("Atomic Number: 98");
			c.println("Atomic Mass: 251");
			c.println("State: Solid");
			c.println("Valence Electrons: 12");
			c.println("Group: 3, Period: 7");
		} else if (element.equalsIgnoreCase("Es") || element.equalsIgnoreCase("Einsteinium")) {
			c.println("Element: Einsteinium (Es)");
			c.println("Atomic Number: 99");
			c.println("Atomic Mass: 252");
			c.println("State: Solid");
			c.println("Valence Electrons: 13");
			c.println("Group: 3, Period: 7");
		} else if (element.equalsIgnoreCase("Fm") || element.equalsIgnoreCase("Fermium")){
			c.println("Element: Fermium (Fm)");
			c.println("Atomic Number: 100");
			c.println("Atomic Mass: 257");
			c.println("State: Solid");
			c.println("Valence Electrons: 14");
			c.println("Group: 3, Period: 7");
		} else if (element.equalsIgnoreCase("Md") || element.equalsIgnoreCase("Mendelevium")){
			c.println("Element: Mendelevium (Md)");
			c.println("Atomic Number: 101");
			c.println("Atomic Mass: 258");
			c.println("State: Solid");
			c.println("Valence Electrons: 15");
			c.println("Group: 3, Period: 7");
		} else if (element.equalsIgnoreCase("No") || element.equalsIgnoreCase("Nobelium")){
			c.println("Element: Nobelium (No)");
			c.println("Atomic Number: 102");
			c.println("Atomic Mass: 259");
			c.println("State: Solid");
			c.println("Valence Electrons: 16");
			c.println("Group: 3, Period: 7");
		} else if (element.equalsIgnoreCase("Lr") || element.equalsIgnoreCase("Lawrencium")){
			c.println("Element: Lawrencium (Lr)");
			c.println("Atomic Number: 103");
			c.println("Atomic Mass: 262");
			c.println("State: Solid");
			c.println("Valence Electrons: 17");
			c.println("Group: 3, Period: 7");
		}else if (element.equalsIgnoreCase("Rf") || element.equalsIgnoreCase("Rutherfordium")){
			c.println("Element: Rutherfordium (Rf)");
			c.println("Atomic Number: 104");
			c.println("Atomic Mass: 267");
			c.println("State: Solid");
			c.println("Valence Electrons: 4");
			c.println("Group: 4, Period: 7");
		} else if (element.equalsIgnoreCase("Db") || element.equalsIgnoreCase("Dubnium")){
			c.println("Element: Dubnium (Db)");
			c.println("Atomic Number: 105");
			c.println("Atomic Mass: 270");
			c.println("State: Solid");
			c.println("Valence Electrons: 5");
			c.println("Group: 5, Period: 7");
		} else if (element.equalsIgnoreCase("Sg") || element.equalsIgnoreCase("Seaborgium")){
			c.println("Element: Seaborgium (Sg)");
			c.println("Atomic Number: 106");
			c.println("Atomic Mass: 271");
			c.println("State: Solid");
			c.println("Valence Electrons: 6");
			c.println("Group: 6, Period: 7");
		} else if (element.equalsIgnoreCase("Bh") || element.equalsIgnoreCase("Bohrium")){
			c.println("Element: Bohrium (Bh)");
			c.println("Atomic Number: 107");
			c.println("Atomic Mass: 270");
			c.println("State: Solid");
			c.println("Valence Electrons: 7");
			c.println("Group: 7, Period: 7");
		} else if (element.equalsIgnoreCase("Hs") || element.equalsIgnoreCase("Hassium")){
			c.println("Element: Hassium (Hs)");
			c.println("Atomic Number: 108");
			c.println("Atomic Mass: 277");
			c.println("State: Solid");
			c.println("Valence Electrons: 8");
			c.println("Group: 8, Period: 7");
		} else if (element.equalsIgnoreCase("Mt") || element.equalsIgnoreCase("Meitnerium")){
			c.println("Element: Meitnerium (Mt)");
			c.println("Atomic Number: 109");
			c.println("Atomic Mass: 278");
			c.println("State: Solid");
			c.println("Valence Electrons: 9");
			c.println("Group: 9, Period: 7");
		} else if (element.equalsIgnoreCase("Ds") || element.equalsIgnoreCase("Darmstadtium")){
			c.println("Element: Darmstadtium (Ds)");
			c.println("Atomic Number: 110");
			c.println("Atomic Mass: 281");
			c.println("State: Solid");
			c.println("Valence Electrons: 10");
			c.println("Group: 10, Period: 7");
		} else if (element.equalsIgnoreCase("Rg") || element.equalsIgnoreCase("Roentgenium")){
			c.println("Element: Roentgenium (Rg)");
			c.println("Atomic Number: 111");
			c.println("Atomic Mass: 280");
			c.println("State: Solid");
			c.println("Valence Electrons: 11");
			c.println("Group: 11, Period: 7");
		} else if (element.equalsIgnoreCase("Cn") || element.equalsIgnoreCase("Copernicium")){
			c.println("Element: Copernicium (Cn)");
			c.println("Atomic Number: 112");
			c.println("Atomic Mass: 285");
			c.println("State: Solid");
			c.println("Valence Electrons: 12");
			c.println("Group: 12, Period: 7");
		} else if (element.equalsIgnoreCase("Nh") || element.equalsIgnoreCase("Nihonium")){
			c.println("Element: Nihonium (Nh)");
			c.println("Atomic Number: 113");
			c.println("Atomic Mass: 284");
			c.println("State: Solid");
			c.println("Valence Electrons: 13");
			c.println("Group: 13, Period: 7");
		} else if (element.equalsIgnoreCase("Fl") || element.equalsIgnoreCase("Flerovium")){
			c.println("Element: Flerovium (Fl)");
			c.println("Atomic Number: 114");
			c.println("Atomic Mass: 289");
			c.println("State: Solid");
			c.println("Valence Electrons: 14");
			c.println("Group: 14, Period: 7");
		} else if (element.equalsIgnoreCase("Mc") || element.equalsIgnoreCase("Moscovium")){
			c.println("Element: Moscovium (Mc)");
			c.println("Atomic Number: 115");
			c.println("Atomic Mass: 288");
			c.println("State: Solid");
			c.println("Valence Electrons: 15");
			c.println("Group: 15, Period: 7");
		} else if (element.equalsIgnoreCase("Lv") || element.equalsIgnoreCase("Livermorium")){
			c.println("Element: Livermorium (Lv)");
			c.println("Atomic Number: 116");
			c.println("Atomic Mass: 293");
			c.println("State: Solid");
			c.println("Valence Electrons: 16");
			c.println("Group: 16, Period: 7");
		} else if (element.equalsIgnoreCase("Ts") || element.equalsIgnoreCase("Tennessine")){
			c.println("Element: Tennessine (Ts)");
			c.println("Atomic Number: 117");
			c.println("Atomic Mass: 294");
			c.println("State: Solid");
			c.println("Valence Electrons: 17");
			c.println("Group: 17, Period: 7");
		} else if (element.equalsIgnoreCase("Og") || element.equalsIgnoreCase("Oganesson")){
			c.println("Element: Oganesson (Og)");
			c.println("Atomic Number: 118");
			c.println("Atomic Mass: 294");
			c.println("State: Solid");
			c.println("Valence Electrons: 18");
			c.println("Group: 18, Period: 7");
		}else {
			c.println("There are currently only 118 elements on the periodic table. This one does not exist.");
		}
	}
	//The descriptions for each group in an array
	static String[] groupNames = {
			" (Alkali Metals)", " (Alkaline Earth Metals)", " (Transition Metals)", " (Transition Metals)", 
			" (Transition Metals)", " (Transition Metals)", " (Transition Metals)", 
			" (Transition Metals)", " (Transition Metals)", " (Transition Metals)", 
			" (Coinage Metals)", " (Transition Metals)", " (Boron Group)", " (Carbon Group)", " (Nitrogen Group)", 
			" (Chalcogens)", " (Halogens)", " (Noble Gases)"
	};
	//makes it easier to display all elements for each group using [][] (a list in a list)
	static String[][] groupElements = {//Group 1
			{"Hydrogen (H)", "Lithium (Li)", "Sodium (Na)", "Potassium (K)", "\nRubidium (Rb)", "Cesium (Cs)", "Francium (Fr)"}, 
			//Group 2
			{"Beryllium (Be)", "Magnesium (Mg)", "Calcium (Ca)", "Strontium (Sr)", "\nBarium (Ba)", "Radium (Ra)"}, 
			//Group 3
			{"Scandium (Sc)", "Yttrium (Y)", "Lanthanum (La)", "Actinium (Ac)"}, 
			//Group 4
			{"Titanium (Ti)", "Zirconium (Zr)", "Hafnium (Hf)", "Rutherfordium (Rf)"}, 
			//Group 5
			{"Vanadium (V)", "Niobium (Nb)", "Tantalum (Ta)", "Dubnium (Db)"}, 
			//Group 6
			{"Chromium (Cr)", "Molybdenum (Mo)", "Tungsten (W)", "Seaborgium (Sg)"}, 
			//Group 7
			{"Manganese (Mn)", "Technetium (Tc)", "Rhenium (Re)", "Bohrium (Bh)"}, 
			//Group 8
			{"Iron (Fe)", "Ruthenium (Ru)", "Osmium (Os)", "Hassium (Hs)"}, 
			//Group 9
			{"Cobalt (Co)", "Rhodium (Rh)", "Iridium (Ir)", "Meitnerium (Mt)"}, 
			//Group 10
			{"Nickel (Ni)", "Palladium (Pd)", "Platinum (Pt)", "Darmstadtium (Ds)"}, 
			//Group 11
			{"Copper (Cu)", "Silver (Ag)", "Gold (Au)", "Roentgenium (Rg)"}, 
			//Group 12
			{"Zinc (Zn)", "Cadmium (Cd)", "Mercury (Hg)", "Copernicium (Cn)"}, 
			//Group 13
			{"Boron (B)", "Aluminum (Al)", "Gallium (Ga)", "Indium (In)", "Thallium (Tl)", "\nNihonium (Nh)"}, 
			//Group 14
			{"Carbon (C)", "Silicon (Si)", "Germanium (Ge)", "Tin (Sn)", "Lead (Pb)", "\nFlerovium (Fl)"}, 
			//Group 15
			{"Nitrogen (N)", "Phosphorus (P)", "Arsenic (As)", "Antimony (Sb)", "Bismuth (Bi)", "\nMoscovium (Mc)"}, 
			//Group 16
			{"Oxygen (O)", "Sulfur (S)", "Selenium (Se)", "Tellurium (Te)", "Polonium (Po)", "\nLivermorium (Lv)"}, 
			//Group 17
			{"Fluorine (F)", "Chlorine (Cl)", "Bromine (Br)", "Iodine (I)", "Astatine (At)", "\nTennessine (Ts)"}, 
			//Group 18
			{"Helium (He)", "Neon (Ne)", "Argon (Ar)", "Krypton (Kr)", "Xenon (Xe)", "Radon (Rn)", "\nOganesson (Og)"}};
	static String[] groupDescriptions = {
			"Highly reactive metals, especially with water. Most reactive family on the periodic table.", 
			"Reactive metals, but less so than alkali metals.", 
			"These metals are less reactive and have high melting points.", 
			"Known for their strength and resistance to corrosion.", 
			"These metals are used in alloys and have high melting points.", 
			"These metals are known for their hardness and resistance to wear.", 
			"Known for catalytic properties and involvement in redox reactions.", 
			"These metals are often used in industry and manufacturing.", 
			"Known for their use in industrial catalysts and high-performance materials.", 
			"These metals are highly valued in the jewelry industry and are good conductors of electricity.", 
			"These metals are known for their electrical conductivity and use in coins and decoration.", 
			"Known for their use in batteries, coatings, and as catalysts.", 
			"These elements have a mix of metallic and non-metallic properties.", 
			"These elements are essential for life and are found in both organic and inorganic forms.", 
			"These elements are important for biological processes and occur in many compounds.", 
			"These elements are vital for life and are often involved in chemical reactions with metals.", 
			"Highly reactive nonmetals, often forming salts when combined with metals.", 
	"Colourless, odorless, and inert gases, they are chemically stable due to their full electron shells."};
	static String[] groupElectrons = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "3", "4", "5", "6", "7", "8"};
	//The data for each period in an array
	static String[] periodNames = {"1", "2", "3", "4", "5", "6", "7"};
	//makes it easier by using [][] as it makes it like 2 lists (a list in a list)
	static String[][] periodElements = {
			//Period 1
			{"Hydrogen (H)", "Helium (He)"}, 
			//Period 2
			{"Lithium (Li)", "Beryllium (Be)", "Boron (B)", "Carbon (C)", "Nitrogen (N)", "Oxygen (O)", "Fluorine (F)", "\nNeon (Ne)"}, 
			//Period 3
			{"Sodium (Na)", "Magnesium (Mg)", "Aluminium (Al)", "Silicon (Si)", "Phosphorus (P)", "Sulfur (S)", "\nChlorine (Cl)", "Argon (Ar)"}, 
			//Period 4
			{"Potassium (K)", "Calcium (Ca)", "Scandium (Sc)", "Titanium (Ti)", "Vanadium (V)", "Chromium (Cr)", "\nManganese (Mn)", "Iron (Fe)", "Cobalt (Co)", "Nickel (Ni)", "Copper (Cu)", "Zinc (Zn)", "Gallium (Ga)", "\nGermanium (Ge)", "Arsenic (As)", "Selenium (Se)", "Bromine (Br)", "Krypton (Kr)"}, 
			//Period 5
			{"Rubidium (Rb)", "Strontium (Sr)", "Yttrium (Y)", "Zirconium (Zr)", "Niobium (Nb)", "Molybdenum (Mo)", "\nTechnetium (Tc)", "Ruthenium (Ru)", "Rhodium (Rh)", "Palladium (Pd)", "Silver (Ag)", "Cadmium (Cd)", "\nIndium (In)", "Tin (Sn)", "Antimony (Sb)", "Tellurium (Te)", "Iodine (I)", "Xenon (Xe)"}, 
			//Period 6    
			{"Cesium (Cs)", "Barium (Ba)", "Lanthanum (La)", "Cerium (Ce)", "Praseodymium (Pr)", "Neodymium (Nd)", "\nPromethium (Pm)", "Samarium (Sm)", "Europium (Eu)", "Gadolinium (Gd)", "Terbium (Tb)", "Dysprosium (Dy)", "Holmium (Ho)", "\nErbium (Er)", "Thulium (Tm)", "Ytterbium (Yb)", "Lutetium (Lu)", "Hafnium (Hf)", "Tantalum (Ta)", "Tungsten (W)", "\nRhenium (Re)", "Osmium (Os)", "Iridium (Ir)", "Platinum (Pt)", "Gold (Au)", "Mercury (Hg)", "Thallium (Tl)", "\nLead (Pb)", "Bismuth (Bi)", "Polonium (Po)", "Astatine (At)", "Radon (Rn)"}, 
			//Period 7
			{"Francium (Fr)", "Radium (Ra)", "Actinium (Ac)", "Thorium (Th)", "Protactinium (Pa)", "Uranium (U)", "\nNeptunium (Np)", "Plutonium (Pu)", "Americium (Am)", "Curium (Cm)", "Berkelium (Bk)", "Californium (Cf)", "Einsteinium (Es)", "\nFermium (Fm)", "Mendelevium (Md)", "Nobelium (No)", "Lawrencium (Lr)", "Rutherfordium (Rf)", "Dubnium (Db)", "Seaborgium (Sg)", "\nBohrium (Bh)", "Hassium (Hs)", "Meitnerium (Mt)", "Darmstadtium (Ds)", "Roentgenium (Rg)", "Copernicium (Cn)", "Nihonium (Nh)", "\nFlerovium (Fl)", "Moscovium (Mc)", "Livermorium (Lv)", "Tennessine (Ts)", "Oganesson (Og)"},};
	/**
	 * Description: This method displays information about a group of elements
	 * @param group -> a number between 1 and 18 (group numbers)
	 */
	public static void groups(int group) {
		//covers up the image
		c.setColor(Color.WHITE);
		c.fillRect(820, 0, 700, 500);
		if (group >= 1 && group <= 18) {
			//displays all the relevant information on the given group
			c.println("Group: " + group + groupNames[group - 1]);
			c.println("Valence Electrons: " + groupElectrons[group - 1]);
			c.println("Elements: " + String.join(", ", groupElements[group - 1]));
			c.println("Description: " + groupDescriptions[group - 1]);
		} else {
			c.println("That group number does not exist on the periodic table. There are only 18 groups on the periodic table.");
		}
	}
	/**
	 * Description: This method displays information about a period of elements
	 * @param period -> a number between 1 and 7 (period numbers)
	 */
	public static void periods(int period) {
		//covers up the image
		c.setColor(Color.WHITE);
		c.fillRect(820, 0, 700, 500);
		if (period >= 1 && period <= 7) {
			//displays all the relevant information on the given period
			c.println("Period: " + period);
			c.println("Elements: " + String.join(", ", periodElements[period - 1]));
			c.println("Electron Shells: " + period);
		} else {
			c.println("This period does not exist on the periodic table. There are only 7 periods on the periodic table.");
		}
	}
	/**
	 * Description: This method asks the user if they want to continue using the program
	 */
	public static boolean askToContinue() {
		c.print("\nWould you like to explore more? (yes/no): ");
		String response = c.readLine();
		//returns yes
		return response.equalsIgnoreCase("yes");
	}
}
