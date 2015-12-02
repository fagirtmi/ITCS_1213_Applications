import java.util.*;
import java.io.*;

public class ReadFile {
	public void main(String[] args ) throws IOException
	{
		String fileName;
		Scanner keyboard = new Scanner(System.in);
		Scanner dataFile;
		
		System.out.print("Enter the name and location of the data file: ");
		fileName = keyboard.nextLine();
		dataFile = new Scanner(new File (fileName));
		
		while(dataFile.hasNext())
		{
			dataFile.nextLine();
			System.out.println(fileName);
		}
		dataFile.close();
		
	}
}
