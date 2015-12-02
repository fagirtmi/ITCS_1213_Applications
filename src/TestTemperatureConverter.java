import java.util.Scanner;

public class TestTemperatureConverter {
	// execution starts in the main()
	public static void main(String [] args){
	// create a reference variable variable, this is not a field because it
	// is declared inside of a method 
	TemperatureConverter tc;
	Scanner input;
	double temperature;
	char scale;
	int goAgain;
	String name;
	
	input = new Scanner(System.in);
	System.out.print("Enter your name: ");
	name = new String(input.next());
	System.out.println("Hi " + name);
	goAgain = 1;
	tc = new TemperatureConverter(); // call the default constructor 
	}
}
