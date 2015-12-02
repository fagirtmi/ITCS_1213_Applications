import java.util.Scanner;

public class MeasurementConverterDriver {
	
	public static void main(String[] args){
	MeasurementConverter mc; // a reference variable
	//other local variables 
	double length;
	char goAgain;
	char scale;
	Scanner keyboard;
	
	//create the Scanner object
	keyboard = new Scanner(System.in);
	
	//create the measurement object using the default constructor 
	mc = new MeasurementConverter();
	
	goAgain = 'y';
	while(goAgain == 'y' || goAgain == 'Y')
	{
		System.out.print("\nChose one: \n f-feet \n m-meters \n i-inches\n c-centimeters: ");
		scale = keyboard.next().charAt(0);
		System.out.print("Enter a measure: ");
		length = keyboard.nextDouble();
		
		switch(scale)
		{
			case 'F':
			case 'f':
				mc.setFeet(length);
				break;
			case 'M':
			case 'm':
				mc.setMeters(length);
				break;
			case 'i':
				mc.setInches(length);
				break;
			case 'c':
				mc.setCM(length);
				break;
			default:
				System.out.println("Invalid menu choice. ");
		}// end switch
		
		System.out.println("The cm are: " + mc.getCM() );
		System.out.println("The feet are: " + mc.getFeet());
		System.out.println("The inches are: " + mc.getInches() );
		System.out.println("The meters are: " + mc.getMeters() );
		
		System.out.print("Enter y to go again: ");
		goAgain = keyboard.next( ).charAt(0);
	}// end while loop
	
	System.out.println("\nGood bye. Happy measuring! ");
}//end main 
}// end of class definition 