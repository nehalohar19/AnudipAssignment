package Assignment3;

import java.util.Scanner;


class Shape
{
	    //static final double PI = Math.PI;
}

class circle extends Shape
{
	    void areaOfCircle(double a)
	    {
	        double A = Math.PI * a * a;
	        System.out.println("Area of the Circle: " + A);
	    }
	
}

class square extends Shape
{
	void areaOfSquare(double a)
    {
        double A = a * a;
        System.out.println("Area of the Square: " + A);
    }
}

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double x, y;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter radius :: ");
	      x = sc.nextDouble();
	      circle c1= new circle();
	      c1.areaOfCircle(x);
	      
	      System.out.println("Enter side :: ");
	      y = sc.nextDouble();
	      square s1= new square();
		  s1.areaOfSquare(y);
	    

	}

}
