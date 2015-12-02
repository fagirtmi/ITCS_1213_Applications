
public class MeasurementConverter {
	private final double CM_PER_INCH = 2.54;
	private final double IN_PER_FOOT = 12.0;
	private final double CM_PER_METER = 100.0;
	
	private double cm; 
	private double feet;
	private double inches;
	private double meters;
	
	public MeasurementConverter(){
		cm = feet = inches = meters = 0;
	}
	
	public MeasurementConverter(double measure, char type){
		switch(type)
		{
		case 'c':
		case 'C':
				cm = measure;
				feet = (measure/CM_PER_INCH) / 12;
				inches = measure/CM_PER_INCH;
				meters = measure/CM_PER_METER;
				break;
		
		case 'f':
		case 'F':
				feet = measure;
				cm = feet * IN_PER_FOOT;
				inches = feet * IN_PER_FOOT;
				meters = cm/CM_PER_METER;
				break;
		
		case 'i':
		case 'I':
				inches = measure;
				cm = inches * CM_PER_INCH;
				feet = inches/IN_PER_FOOT;
				meters = cm/CM_PER_METER;
				break;
		
		case 'm':
		case 'M':
				meters = measure;
				cm = meters * CM_PER_METER;
				inches = cm/CM_PER_INCH;
				feet = inches/IN_PER_FOOT;
				break;
			default: cm = inches = feet = meters = 0;		
		}//end of switch
	}//end of constructor 
	
	public void setFeet(double measure){
		feet = measure;
		cm = feet * IN_PER_FOOT * CM_PER_INCH;
		inches = feet * IN_PER_FOOT;
		meters = cm/CM_PER_METER;
	}
	
	public void setCM(double measure){
		cm = measure;
		feet = (measure/CM_PER_INCH)/ 12;
		inches = measure/CM_PER_INCH;
		meters = cm/CM_PER_METER;
	}
	
	public void setInches(double measure){
		inches = measure;
		cm = inches * CM_PER_INCH;
		feet = inches/IN_PER_FOOT;
		meters = cm/CM_PER_METER;
	}
	
	public void setMeters(double measure){
		meters = measure;
		cm = meters * CM_PER_METER;
		inches = cm/CM_PER_INCH;
		feet = inches/IN_PER_FOOT;
	}
	
	public double getCM()
	{
		return cm;
	}
	
	public double getFeet()
	{
		return feet;
	}
	
	public double getInches(){
		return inches;
	}
	
	public double getMeters()
	{
		return meters;
	}
}
