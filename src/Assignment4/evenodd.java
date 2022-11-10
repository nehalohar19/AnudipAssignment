package Assignment4;

import java.util.ArrayList;
import java.util.List;

public class evenodd
{

	public static void main(String[] args) 
	{
         List<Integer> number = new ArrayList<Integer>();
         number.add(10);
         number.add(27);
         number.add(30);
         number.add(39);
         number.add(50);

         number.forEach((n)->
         {
        	 if (n%2==0)
        	 {
        		 System.out.println("Number is even "+n);
        	 }
        	 else
        	 {
        		 System.out.println("Number is odd "+n);
        	 }
         });
	}

}
