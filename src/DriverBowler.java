import java.util.*;

/*
 * This application creates two bowler objects that put in values and 
 * get an output of average scores. 
 * 
 * @author Fatih Agirtmis 
 * @version 9/22/2105
 */
public class DriverBowler {

	public static void main(String args[]) {
		// Scanner object called keyboard
		Scanner keyboard = new Scanner(System.in);
		// The local variables for the class
		String bowlerOne;
		String bowlerTwo;

		int bowlerAge1;
		int bowlerAge2;

		int score1;
		int score2;
		int score3;

		int sc1;
		int sc2;
		int sc3;

		// Bowler 1
		System.out.print("Please enter your name. ");
		bowlerOne = keyboard.nextLine();

		System.out.println("Please enter your age. ");
		bowlerAge1 = keyboard.nextInt();

		System.out.println("Please enter your first Score. ");
		score1 = keyboard.nextInt();

		System.out.println("Please enter your second Score. ");
		score2 = keyboard.nextInt();

		System.out.println("Please enter your third Score. ");
		score3 = keyboard.nextInt();

		// Bowler one object with the parameters
		Bowler bowler1 = new Bowler();
		bowler1 = new Bowler(bowlerOne, bowlerAge1, score1, score2, score3);

		// calculates the average of bolwer 1
		int calcAverage1 = bowler1.calcAverage(score1, score2, score3);
		System.out.println(bowlerOne + " has a bowling average of " + calcAverage1);

		System.out.println();

		// Bowler 2
		System.out.println("Please enter your name. ");
		keyboard.nextLine();
		bowlerTwo = keyboard.nextLine();

		System.out.println("Please enter your age. ");
		bowlerAge2 = keyboard.nextInt();

		System.out.println("Please enter your first Score. ");
		sc1 = keyboard.nextInt();

		System.out.println("Please enter your second Score. ");
		sc2 = keyboard.nextInt();

		System.out.println("Please enter your third Score. ");
		sc3 = keyboard.nextInt();

		// creates a second bowler object
		Bowler bowler2 = new Bowler();
		// has four parameters that take in different values
		bowler2 = new Bowler(bowlerTwo, bowlerAge2, sc1, sc2, sc3);

		// calculates the average of bowler 2
		int calcAverage2 = bowler2.calcAverage(sc1, sc2, sc3);
		System.out.println(bowlerTwo + " has a bowling average of " + calcAverage2);

		// Allows the user to change the values of the scores
		System.out.println("Would you like to change the score?");
		char input = keyboard.next().charAt(0);

		// if the user wants to set the values to different values
		if (input == 'y' || input == 'Y') {
			System.out.println("Enter the new scores");

			int num1 = keyboard.nextInt();
			int num2 = keyboard.nextInt();
			int num3 = keyboard.nextInt();

			bowler1.setScore1(num1);
			bowler1.setScore2(num2);
			bowler1.setScore3(num3);

			System.out.println("Your new scores are " + num1 + " " + " " + num2 + " " + num3);
		} else {
			System.exit(0);
		}

		System.out.println();

		// shpws the output of which user has a higher value
		if (calcAverage1 > calcAverage2) {
			System.out.println(bowlerOne + " has a higher average then " + bowlerTwo + ". " + "Their averages are "
					+ calcAverage1 + " and " + calcAverage2);
		} else {
			System.out.println(bowlerTwo + " has a higher average then " + bowlerOne + ". " + "Their averages are "
					+ calcAverage2 + " and " + calcAverage1);
		}
	}
}
