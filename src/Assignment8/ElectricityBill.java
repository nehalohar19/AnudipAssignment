package Assignment8;

import java.util.*;
public class ElectricityBill {
	static int unit;
	static double Charges = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the units : ");
		unit = s.nextInt();
		if(unit < 100)
		{ 
			//Charges = unit * 1.20;
			Charges = 1.20;
			System.out.println("Charges :"+Charges+"per units");
		}
		else if(100 <= unit && unit<= 300)
		{
			//Charges = unit * 2.0;
			Charges = 2.0;
			System.out.println("Charges :"+Charges+"per units");
		}
		else
		{
			//Charges = unit * 3.0;
			Charges = 3.0;
			System.out.println("Charges :"+Charges+"per units");
		}
	}
}