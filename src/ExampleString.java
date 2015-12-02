import java.util.*;
public class ExampleString {
	public static void main(String args[]){
		Scanner userInput = new Scanner(System.in);
		
		String str; // Reference variable
		
		System.out.println("Enter a sentence please.");
		str = userInput.nextLine();
		
		// the length
		System.out.println(str.length() + " the length");
		// the first character
		System.out.println(str.charAt(0) + " the first letter");
		// prints the last character
		System.out.println(str.charAt(str.length() - 1) + " prints the last character.");
		// whether the string contains e (-1 if nothing is there)
		System.out.println(str.indexOf('e'));
		// whether the string contains ay 
		System.out.println(str.indexOf("ay"));
		// number times e appears in a sentence 
		int counter = 0;
		for(int i =0; i < str.length(); i++){
			if(str.charAt(i) == 'e'){
				counter++;
			}
		}
		System.out.println(counter);
		// last index of e
		System.out.println(str.lastIndexOf('e'));
		// second occurrence of e
		System.out.println(str.indexOf('e') + 1);
		// add the word you know
		System.out.println(str + " you know. ");
		// the upper case version 
		System.out.println();str.toUpperCase();
		// take substring of the first characters 
		System.out.println(str.substring(0, 5));
		// letter a replaced with x 
		System.out.println(str.replace('a', 'x'));
		
		
		
		
		
	}
}
