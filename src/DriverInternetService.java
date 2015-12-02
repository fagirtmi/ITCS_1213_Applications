import java.util.*;
import java.text.DecimalFormat;
/*
 * This application runs the Internet Service class and calculates the 
 * final cost.
 * 
 * @author Fatih Agirtmis 
 * @version 9/22/2105
 */
public class DriverInternetService {
	
	public static void main(String args[]){
		// create scanner object
		Scanner userInput = new Scanner(System.in);
		DecimalFormat pattern = new DecimalFormat("00.00");
		double hours = 0;
		char choice = 0;
		//created a new service object that takes in hours
		InternetService service = new InternetService(hours);
		
		// while loop that will calculate the costs as many times 
		while(choice == 'y' || choice == 'Y'){
		System.out.println("Select one of the few packages listed below. \nPackage 1: \nPackage 2: \nPackage 3:");
		int ans = userInput.nextInt();
		
		// if operation that checks which choice the user selects
		if(ans == 1){
			System.out.println("You have selected Package 1. The rate for Package 1 is $9.95 where \n 10 hours are provided and additional hours "
					+ "are $2.00 per hour.");
		}
		else if(ans == 2){
			System.out.println("You have selected Package 2. The rate for Package 2 is $18.95 where \n 25 hours are provided and additional hours "
					+ "are $1.50 per hour");
		}
		else if(ans == 3){
			System.out.println("For Package 3, you will pay $23.50 per month, unlimited access is provided. ");	
		}
		else{
			System.out.print("Incorrect");
		}
		
		// Creates Space between
		System.out.println();
		
		System.out.println("Now enter the number hours you will be using. ");
		hours = userInput.nextDouble();
		
		double calculateCost = service.calculateCustomersBill(hours);
		System.out.println("Your total bill will be " + pattern.format("$" + calculateCost + "."));
		
		// asks if they would like to go again
		System.out.println("\n Would you like to go again(y/n)?");
		choice = userInput.next().charAt(0);
	}
		
}
}
