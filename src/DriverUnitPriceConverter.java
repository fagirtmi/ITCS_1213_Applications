import java.util.*;
import java.text.DecimalFormat;
/*
 * This program allows the user Input the price of an 
 * item and the weight and outputs the price per ounce and price per pound. 
 * 
 * @author Fatih Agirtmis 
 * @version 9/23/2015
 */
public class DriverUnitPriceConverter {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in); // Scanner Object
		DecimalFormat pattern = new DecimalFormat("0.00");
		UnitPriceConverter convert = new UnitPriceConverter(); // a reference
																// variable

		// Local variables
		double priceOfItem;
		double weightOfItem;
		double pricePerOunce;
		double pricePerPound;
		char goAgain = 'y';

		while (goAgain == 'y' || goAgain == 'Y') {
			// Default constructor for convert object
			System.out.println(
					"Hello and welcome to the application that converts the weight of an " + " object to its price.");

			// Incoming values from the user
			System.out.println("\nEnter the price of the item. ");
			priceOfItem = userInput.nextDouble();
			System.out.println("Enter weight of the item in pounds. ");
			weightOfItem = userInput.nextDouble();
			// Attaches those values to the parameters in the overloaded
			// constructor method
			convert.setPriceOfItem(priceOfItem);
			convert.setWeightInPounds(weightOfItem);
			
			System.out.println("The price of the item will be " + "$" + pattern.format(convert.getPricePerOunce()) + " per Ounce.");
			System.out.println("The price of the item will be " + "$" + pattern.format(convert.getPricePerPound()) + " per Pound.");
			System.out.println();

			System.out.println("Enter y to go again: ");
			goAgain = userInput.next().charAt(0);
		}
		System.out.println("Goodbye. Thank you! ");
	}
}