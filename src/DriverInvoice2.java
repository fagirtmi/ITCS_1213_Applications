import java.util.*;
import java.io.*;

public class DriverInvoice2 {
	public static void main(String[] args)throws IOException
	{
		Customer c1, c2, c3;
		Invoice i1, i2, i3;
		
		// creates three Customer objects 
		c1 = new Customer(" Agirtmis "," Fatih ", " 8277804");
		c2 = new Customer(" Bryan " ," Chung ", " 4888909");
		c3 = new Customer(" Alex ", " Smith ", "778909" );
		
		// creates three Invoice objects
		i1 = new Invoice(" 12323A"," repair leaking faucet ",23.56,false,c1); 
		i2 = new Invoice(" 14532E", " install garbage disposal ", 398.4,true,c2); 
		i3 = new Invoice(" 34234", "snake tub amount 89.8 is paid ",89.9,false,c3 );
		
		System.out.println(i1 + "\n");
		System.out.println(i2 + "\n");
		System.out.println(i3 + "\n");
	}
}
