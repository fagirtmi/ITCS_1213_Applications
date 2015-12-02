/*
 *Class Definition file for the Bowler Object 
 * 
 * @author Fatih Agirtmis 
 * @version 9/22/2105
 */
public class Bowler {

	// the fields for the object
	private String bowler;
	private int bowlerAge;
	private int score1;
	private int score2;
	private int score3;

	/**
	 * Constructor for the object that sets all values to zero and null
	 */
	public Bowler() {
		bowler = null;
		bowlerAge = 0;
		score1 = 0;
		score2 = 0;
		score3 = 0;
	}

	/**
	 * Overloaded constructor method
	 */
	public Bowler(String bowl, int bowlAge, int sc1, int sc2, int sc3) {
		bowler = bowl;
		bowlAge = bowlAge;
		score1 = sc1;
		score2 = sc2;
		score3 = sc3;
	}

	/**
	 * @return the calcAverage of the three bowler scores
	 */
	public int calcAverage(int sc1, int sc2, int sc3) {
		int bowlerAverage;
		score1 = sc1;
		score2 = sc2;
		score3 = sc3;

		return (score1 + score2 + score3) / 3;

	}

	/**
	 * @return the bowler
	 */
	public String getBowler() {
		return bowler;
	}

	/**
	 * @return the score1
	 */
	public int getScore1() {
		return score1;
	}

	/**
	 * @return the score2
	 */
	public int getScore2() {
		return score2;
	}

	/**
	 * @return the score3
	 */
	public int getScore3() {
		return score3;
	}

	/**
	 * @param score1
	 *            the score1 to set
	 */
	public void setScore1(int score1) {
		this.score1 = score1;

		if (this.score1 > 0 && this.score1 < 300) {
			this.score1 = score1;
		} else {
			System.out.print("Score not within range");
		}

	}

	/**
	 * @param score2
	 *            the score2 to set
	 */
	public void setScore2(int score2) {
		this.score2 = score2;

		if (this.score2 > 0 && this.score2 < 300) {
			this.score2 = score2;
		} else {
			System.out.print("Score not within range");
		}

	}

	/**
	 * @param score3
	 *            the score3 to set
	 */
	public void setScore3(int score3) {
		this.score3 = score3;

		if (this.score3 > 0 && this.score3 < 300) {
			this.score3 = score3;
		} else {
			System.out.print("Score not within range");
		}
	}

}
