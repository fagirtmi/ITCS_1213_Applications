import java.util.Scanner;
import java.util.*;
public class DriverFraction {
	
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction();
		
		System.out.println("Enter the numerator1 ");
		int numerator1 = userInput.nextInt();
		System.out.println("Enter the denominator1  ");
		int denominator1 = userInput.nextInt();
		
		f1 = new Fraction(numerator1, denominator1);
		System.out.println(f1);

		
	}
}
