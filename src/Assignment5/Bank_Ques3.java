package Assignment5;
import java.util.Scanner;
public class Bank_Ques3 {
	public static void withdraw(int balance, int wbalance)
	{
		System.out.println("Balance After withdraw :"+(balance - wbalance)); 
	}
	public static void deposit(int balance, int depbalance)
	{
		System.out.println("Balance After withdraw :"+(balance + depbalance)); 
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		String name = s.next();
		System.out.println("Enter Account Number :");
		int AccNumber = s.nextInt();
		System.out.println("Enter Account Balance :");
		int balance = s.nextInt();
	
	System.out.println("Account Holder Name :"+name);
	System.out.println("Account Number :"+AccNumber);
	System.out.println(name+" Your Main Balance is :"+balance);
	
	System.out.println("Enter Your Choice :");
	int ch = s.nextInt();
	
	switch(ch) 
	{
	case 1 : System.out.println("Enter Balance to withdraw :");
			int wbalance = s.nextInt();
			withdraw(balance, wbalance);
			break;
	case 2 : System.out.println("Enter Balance to deposit :");
			int depbalance = s.nextInt();
			deposit(balance, depbalance);
			break;
	default :  System.out.println("Invalid input");
	
	}
	
	}
}