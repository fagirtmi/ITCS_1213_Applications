import java.util.Scanner;

public class DriverVehicleInformation {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		VehicleInformation info;
		char goAgain = 'y';
		
		while(goAgain == 'y'){
		// Info on the price and name of the car
		System.out.print("Please enter the name of you car.");
		String name = userInput.nextLine();

		System.out.println("Please enter the price of your car.");
		String price = userInput.nextLine();

		// Brings in the fields for the constructor
		System.out.println("Enter the Engine Size.");
		String engineSize = userInput.nextLine();

		System.out.println("Enter a liter Size of your car.");
		String literSize = userInput.nextLine();

		System.out.println("Enter the type of material. ");
		String material = userInput.nextLine();

		System.out.println("Please enter the Tire Size.");
		String tireSize = userInput.nextLine();

		System.out.println("Your drive Train?");
		String driveTrain = userInput.next();

		// Prints the information out via System
		info = new VehicleInformation(engineSize, literSize, material, tireSize, driveTrain);
		System.out.println("\nYour Car: " + name + "\nThe Price: " + price);
		System.out.println();
		System.out.println(info);

		// Calculates Horsepower of your car
		System.out.println("\nEnter the torque of your car. ");
		int torque = userInput.nextInt();

		System.out.println("Enter the RPM of your car. ");
		int rpm = userInput.nextInt();
		
		System.out.println("Your cars horsepower: " + info.horepowerFormula(torque, rpm));
		
		System.out.println("Would you like to go again y/n");
		goAgain = userInput.next().charAt(0);
		}
		System.out.println("Goodbye. ");
	}
}
