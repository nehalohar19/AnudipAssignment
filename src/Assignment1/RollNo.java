package Assignment1;

import java.util.Scanner;

public class RollNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter roll number");
		Scanner  sc = new Scanner(System.in);
		int a=sc.nextInt();
		if(a%4==1)
		{
			System.out.println("sapphire");
		}
		else if(a%4==2)
		{
			System.out.println("pearl");
			
		}
		else if(a%4==3)
		{
			System.out.println("ruby");
			
		}
		else if(a%4==4)
		{
			System.out.println("emreald");
		}

	}

}
