
public class TemperatureConverter {
	private double celcius;
	private double fahrenheit;

	//no argument or default constructor 
	//notice the constructor has the same as the class name and has no return type,
	//not even void
	
	public TemperatureConverter(){
		celcius = fahrenheit = 0;
	}
	
	//this constructor expects two values 
	public TemperatureConverter(double temperature, char type)
	{
		if(type == 'F')
		{
			fahrenheit = temperature; 
			celcius = 5.0/9 * (temperature - 32);
		}
		else 
		{
			celcius = temperature;
			fahrenheit = 9.0/5 * temperature + 32;
		}
	}
	//this method allows the user to change the temperature 
	//to new values 
	public void setTemperature(double temperature, char type)
	{
		if(type == 'F')
		{
			fahrenheit = temperature; 
			celcius = 5.0/9 * (temperature - 32);
		}
		else
		{
			celcius = temperature;
			fahrenheit = 9.0/5 * temperature + 32;
		}
	}
	public double getTemperature(char type)
	{
		return (type == 'C' ? celcius: fahrenheit );
	}
}
// end of class definition file 