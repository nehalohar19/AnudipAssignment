package Assignment8;

import java.util.*;
public class NumberOfPassangers {
	static int n, sum, ar[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		n = s.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter the number of Passangers : ");
		for(int i = 0; i < n; i++)
		{	
			ar[i] = s.nextInt();
			if(ar[i] < 0)
			{
				System.out.print("Invalid Input = "+ar[i]);
			}
			
			
		}
		System.out.print("The number of Passangers are : ");

		for(int i = 0; i < n; i++)
		{
			System.out.print(ar[i]+"  ");
		}
		System.out.println();
		for(int i = 0; i < n; i++)
		{
			sum += ar[i];
		}
		System.out.print("The sum of number of passangers : ");
		System.out.print(sum);

	}

}