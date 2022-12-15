package Assignment8;

public class CircleArea {
	double radius ,area;
	
	

	public CircleArea(int radius) {
		super();
		this.radius = radius;
	}
	
	public void Area()
	{
		area =  Math.PI*radius*radius;
		System.out.println("        "+area+"  "+radius);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleArea circle1 = new CircleArea(4);
		System.out.println("Circle1 Area"+"             "+"Radius is : ");
		circle1.Area();
		CircleArea circle2 = new CircleArea(20);
		System.out.println("Circle2  Area"+"             "+"Radius is : ");
		circle2.Area();
	}

}