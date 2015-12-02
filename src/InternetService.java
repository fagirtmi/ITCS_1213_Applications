/*
 * Class Definition file for Driver Internet Service 
 * 
 * @author Fatih Agirtmis 
 * @version 9/22/2105
 */
public class InternetService {

	private final double ratePerMonth1 = 9.995;
	private final double ratePerMonth2 = 18.95;
	private final double ratePerMonth3 = 23.50;
	
	double package1 = 0;
	double package2 = 0;
	double package3 = 0;
	
	private double hours = 0;
	
	/*
	 * The constructor takes in the number of hours used and set to 
	 * @param double hr1 - the number of hours taken in from the user
	 */
	public InternetService(double hr1){
		hours = hr1;
	
	}

	/**
	 * @return the hours
	 */
	public double getHours() {
		return hours;
	}


	/**
	 * @param hours the hours to set
	 */
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public double calculateCustomersBill(double hr){
		hours = hr;
		
		//the case for <= 10
		if(hours <= 10){
			package1 = ratePerMonth1;
			return package1;
		}
		else if(hours > 10 && hours < 24 ){
			hours = (hours -10) * 2;
			package1 = ratePerMonth1 + hours;
			return package1;
		}
		
		else if(hours == 25){
			package2 = ratePerMonth2;
			return package2;
		}
		else if(hours > 25 && hours < 150 ){
			package3 = (hours - 25) * 1.50;
			return package3;
		}
		else{
			return 0;
		}
	}

	
	
}
