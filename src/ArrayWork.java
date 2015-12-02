import java.util.Arrays;

public class ArrayWork {
	public static void main(String[] args){
		int [] digits = new int[10];
		int i;
		// Prints 1 - 10
		for ( i = 0; i<digits.length; i++) {
		    digits[i] = i + 1;
		    System.out.print(digits[i]);
		}
		
		System.out.println("\n"); // Creates a space 
		
		// Reverse 1 - 10
		for(i = digits.length - 1; i >= 0; i--){
			System.out.print(digits[i]);
		}
		
		System.out.println("\n");// Creates new line
		
		for(i = 0; i < digits.length; i += 2){
			System.out.print(digits[i]);
		}
		
		System.out.println("\n");
			
		for ( i = 0; i < digits.length -1 ; i++ ){
			int [] newDigits = {6,7,8,9,0};
			digits[4] = newDigits[0];
			digits[5] = newDigits[1];
			digits[6] = newDigits[2];
			digits[7] = newDigits[3];
			digits[8] = newDigits[4];
			
			System.out.print(digits[i]);
		}
		
		System.out.println("\n");
		
		for ( i = 0; i < digits.length -1 ; i++ ){
			int [] newDigits = {4,5,6,7,8,9,0};
			digits[2] = newDigits[0];
			digits[3] = newDigits[1];
			digits[4] = newDigits[2];
			digits[5] = newDigits[3];
			digits[6] = newDigits[4];
			digits[7] = newDigits[5];
			
			System.out.print(digits[i]);
		}
		
	}
}
