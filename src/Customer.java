
public class Customer {
	String lastName;
	String firstName;
	String id;
	
	// Default Constructor
	public Customer(){
		lastName = null;
		firstName = null;
		id = null;
	}
	
	//Overloaded Constructor
	public Customer(String lastN, String firstN, String ID){
		lastName = lastN; 
		firstName = firstN;
		id = ID;
	}
	
	// Copy Constructor
	public Customer(Customer c){
		this.lastName = c.lastName;
		this.firstName = c.firstName;
		this.id = c.id;
	}
}
