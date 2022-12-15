package Assignment7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class File_read 
{

	public static void main(String[] args) throws IOException
	{
		
		File obj1=new File("F:\\anp_cource\\Demo.txt");
		Scanner sc = new Scanner(obj1);
		int counter = 0;
		while(sc.hasNextLine()) 
		{
				
					String str1 = sc.nextLine();
					String[]arr = str1.split(" ");
					
					counter +=arr.length;
		}
				System.out.println("count words:");
				System.out.println(counter);
		FileInputStream obj = new FileInputStream("F:\\anp_cource\\Demo.txt");
		
		int i;
		String str = "";
		
		while((i=obj.read())!=-1)   // read data from text file
		{
			System.out.print((char)i);
		}
		
		obj.close();	
	}

}