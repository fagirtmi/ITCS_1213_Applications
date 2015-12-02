

/*
 * This program allows the user Input the price of an 
 * item and the weight and outputs the price per ounce and price per pound. 
 * 
 * @author Fatih Agirtmis 
 * @version 9/23/2015
 */
public class UnitPriceConverter {
	// Fields
	private double priceOfItem;
	private double weightInPounds;
	private double pricePerPound;
	private double pricePerOunce;

	protected static final double OUNCES_PER_POUND = 16.0;

	public UnitPriceConverter() {
		priceOfItem = 0;
		weightInPounds = 0;
		pricePerPound = 0;
		pricePerOunce = 0;
	}

	// Overloaded Constructor method that takes in the price of the item and
	// weight in pounds
	public UnitPriceConverter(double prOfItem, double weInPounds) {
		// Local variables that attach themselves to to incoming values
		priceOfItem = prOfItem;
		weightInPounds = weInPounds;

		// Calculation for the price per ounce and price per pound
		pricePerOunce = ((priceOfItem / weightInPounds) / OUNCES_PER_POUND);
		pricePerPound = priceOfItem / weightInPounds;

	}

	/**
	 * @param priceOfItem
	 *            the priceOfItem to set
	 */
	public void setPriceOfItem(double priceOfItem) {
		this.priceOfItem = priceOfItem;
		pricePerOunce = ((priceOfItem / weightInPounds) / OUNCES_PER_POUND);
		pricePerPound = priceOfItem / weightInPounds;
	}

	/**
	 * @param weightInPounds
	 *            the weightInPounds to set
	 */
	public void setWeightInPounds(double weightInPounds) {
		this.weightInPounds = weightInPounds;
		pricePerOunce = ((priceOfItem / weightInPounds) / OUNCES_PER_POUND);
		pricePerPound = priceOfItem / weightInPounds;
	}

	/**
	 * @return the priceOfItem
	 */
	public double getPriceOfItem() {
		return priceOfItem;
	}

	/**
	 * @return the weightInPounds
	 */
	public double getWeightInPounds() {
		return weightInPounds;
	}

	/**
	 * @return the pricePerPound
	 */
	public double getPricePerPound() {
		return pricePerPound;
	}

	/**
	 * @return the pricePerOunce
	 */
	public double getPricePerOunce() {
		return pricePerOunce;
	}

}
