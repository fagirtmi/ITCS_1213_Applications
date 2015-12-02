/**
 * This class holds data and methods to 
 * perform currency rate conversions 
 * 
 * @author Fatih Agirtmis
 * @version 9/16/2015
 */
public class CurrencyConverter {
	
	//The first three fields are constant used to specify the exchange rates 
	//The keyword final is used to declare constants in Java. 
	private final double POUND_EXCHANGE_RANGE = 0.6064;
	private final double YEN_EXCHANGE_RATE = 102.32;
	private final double EURO_EXCHANGE_RATE = 0.73110;
	
	// These fields will be initialized in the constructor then will be changed by the set method()
	private double dollars;
	private double yen;
	private double euro;
	private double pounds;
	
	public CurrencyConverter()
	{
		dollars = yen = euro = pounds = 0.0;
	}
	
	//This is the constructor method. It takes in two values, a double and a character 
	public CurrencyConverter(double amount, char type)
	{
		setAmount(amount, type);
	}
	
	//This is a setMethod. A set method changes the values of the fields. 
	public void setAmount(double amount, char type)
	{
		switch(type)
		{
		case 'D':
		case 'd':
			dollars = amount;
			yen = amount * YEN_EXCHANGE_RATE;
			euro = amount * EURO_EXCHANGE_RATE;
			pounds = amount * POUND_EXCHANGE_RANGE;
			break;
			
		case 'E':
		case 'e':
			euro = amount;
			dollars = amount /EURO_EXCHANGE_RATE;
			yen = dollars * YEN_EXCHANGE_RATE;
			pounds = dollars * POUND_EXCHANGE_RANGE;
			break;
			
		case 'Y':
		case 'y':
			yen = amount; 
			dollars = amount /YEN_EXCHANGE_RATE;
			euro = dollars * EURO_EXCHANGE_RATE;
			pounds = dollars * POUND_EXCHANGE_RANGE;
			break;
		
		case 'P':
		case 'p':
			pounds = amount;
			dollars = amount / POUND_EXCHANGE_RANGE;
			yen = dollars * YEN_EXCHANGE_RATE;
			euro = dollars * EURO_EXCHANGE_RATE;
			break;
		} // end of switch 
	}// end of set() method
	
	// This is a get method. A get() method returns the value of a field. 
	public double getAmount(char type)
	{
		double amountToReturn;
		switch(type)
		{
		case 'D':
		case 'd':
				amountToReturn = dollars;
				break;
				
		case 'E':
		case 'e':
				amountToReturn = euro;
				break;
		
		case 'Y':
		case 'y':
			    amountToReturn = yen;
			    break;
			
		case 'P':
		case 'p':
				amountToReturn = pounds;
				break;
		default: amountToReturn = -99999;
		}//end of switch
		return amountToReturn;
	} //end of get() method
	
	public double getDollars()
	{
		return dollars;
	}
	
	public double getYen()
	{
		return yen;
	}
	
	public double getEuro()
	{
		return euro;
	}
	
	public double getPounds()
	{
		return pounds;
	}
	
	public String toString()
	{
		return "Dollars: " + dollars + "\nYen: " + yen + "\nEuros: " + euro +
				"\nPounds: " + pounds;
	}
}// end of class definition 
