
public class Invoice {
	String invoiceID;
	String description; 
	double amount;
	boolean isPaid;
	Customer cust = new Customer(String lastN);
	
	public Invoice(){
		invoiceID = null;
		description = null;
		amount = 0;
		isPaid = false;
		cust = null;
	}
	public Invoice(String inID, String des, double am, boolean isPD, Customer cs){
		invoiceID = inID;
		description = des;
		amount = am;
		isPaid = isPD;
		cust = cs;
	}
	
	public int compareTo(Invoice inInvoice){
		int result = 0;
		if(this.amount > inInvoice.amount){
			result = 1;
		}
		else if(this.amount < inInvoice.amount){
			result = -1;
		}
		else if(inInvoice.amount > this.amount){
			result = 1;
		}
		else if(inInvoice.amount < this.amount){
			result = -1;
		}
		
		return result;
	}
	
	public boolean equals(Invoice inInvoice){
		return invoiceID.equals(inInvoice.invoiceID);
	}
	
	public String toString()
	{
		String result;
		result = "Invoice Id " + invoiceID + " description " + description + " amount " + amount + " is Paid " + isPaid + " Customer " + cust;
		return result;
	}
	
}
