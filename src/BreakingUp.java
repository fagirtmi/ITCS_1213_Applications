import java.util.*;
public class BreakingUp {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String inputSentence;
		StringTokenizer stok; 
		int count;
		String salaryString;
		double salary;
		stok = null;
		System.out.println("Enter a line of text: ");
		inputSentence = new String(keyboard.nextLine());
		while(!(inputSentence.equals("quit"))){
			stok = new StringTokenizer(inputSentence);
			
			count = 1;
			
			System.out.println("This is how many tokens are in your input String: " + stok.countTokens());
			int loop = stok.countTokens();
			salaryString = stok.nextToken();
			salary = Double.parseDouble(salaryString);
			System.out.println(salary * 1.1);
			
			System.out.println("Enter another line of data or quit\n");
			inputSentence = keyboard.nextLine();
			
		}
		System.out.println("Goodbye \n");
		
	}
}
