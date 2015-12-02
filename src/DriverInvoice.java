import java.util.Scanner;
import java.util.*;
import java.io.*;

public class DriverInvoice {
	
	public static void main(String[] args)throws IOException
	{
		Scanner in = new Scanner(System.in);
		String invoiceID;
		String description; 
		String line; // one line of data from the input file
		double amount;
		boolean isPaid;
		Customer cust = new Customer();
		
		StringTokenizer stok;
		int x = 0;
		// Ten invoices objects 
		Invoice[] invoices = new Invoice[10];
	    in = new Scanner(new File("bin/invoicedata.txt"));
		while(in.hasNext()){
			line = in.nextLine();
			stok = new StringTokenizer(line,",");
			invoiceID = stok.nextToken();
			description = stok.nextToken();
			amount = Double.parseDouble(stok.nextToken());
			isPaid = Boolean.parseBoolean(stok.nextToken());
			invoices[x] = new Invoice(invoiceID, description, amount, isPaid, cust);
			x++;
		}
		in.close();
		for(int i = 0; i < invoices.length; i++)
		{
			System.out.println(invoices[i]);
		}
		
		// Checks is the first invoice is greater than the last invoice
		if(invoices[0].compareTo(invoices[9]) > 0){
			System.out.println();
			System.out.println(invoices[0] + " the first invoice has a higher amount due than " + invoices[9]);
		}
		else{
			System.out.println();
			System.out.println(invoices[9] + " the last invoice has a higher amount due than " + invoices[0]);
		}
		
		// Checks if the second and fifth invoice objects are equal
			System.out.println();
			System.out.println("Invoice 2 and Invoice 5 are equal. " + invoices[1].equals(invoices[4]));
	}
}
