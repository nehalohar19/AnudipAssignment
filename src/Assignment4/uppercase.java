package Assignment4;

import java.util.stream.IntStream;

interface Adder{
	public int add(int a,int b);
}

public class uppercase{
	public static void main(String[] args) 
	{
		Adder a=(x,y)->
		{
			return x+y;
		};
		System.out.println("Addition is: "+a.add(40,10));
		String st = "hello";
		  IntStream.range(0, st.length()).mapToObj(i -> i == 0 ? Character.toUpperCase(st.charAt(i)) : st.charAt(i))
		           .forEach(System.out::print);
		
	}
}