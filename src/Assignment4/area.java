package Assignment4;

import java.util.Scanner;

class shap1 {

}

class circle extends shap1{
	void getArea(double a)
	{
		double A=Math.PI*a*a;
		System.out.println("Area of circle:"+A);
	}
}
class square extends shap1{
	void getArea(double a)
	{
		double A= a*a;
		System.out.println("Area Of Square:"+A);
	}
}
  public class area{
	 public static void main(String []args)
	 {
		 double x,y;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter radious:");
		 x=sc.nextDouble();
		 circle c=new circle();
		 c.getArea(x);
		 
		 System.out.println("Enter Sides:");
		 y=sc.nextDouble();
		 square s=new square();
		 s.getArea(y);
		 
	 }
 }