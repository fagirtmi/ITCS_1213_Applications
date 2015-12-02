
public class Fraction {
	private int numerator;
	private int denominator;

	
	public Fraction(){
		numerator = 1;
		denominator = 1;
	}
	
	public Fraction(int num, int den){
		numerator = num;
		denominator = den;
	}
	
	private void simplify(){
		int x = 0;
		boolean y = false;
		
		while(!y){
			if(denominator % x == 0  && numerator % x == 0){
				numerator /= x;
				denominator /=x;
				y = true;
			}
			else{
				x--;
			}
		}
	
	}
	public int add(int amount){
		
		return ((numerator + denominator) + amount);
	}
	
	public String toString(){
		return "Value: " + numerator + "/"+ denominator;
	}
	
	/**
	 * @return the numerator
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * @param numerator the numerator to set
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	/**
	 * @return the denominator
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * @param denominator the denominator to set
	 */
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
}
