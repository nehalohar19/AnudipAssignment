package Assignment7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



class StudentInfo //   student class declare
{
	private int id;
	private String name;
	private int age;
	private int Maths_marks;
	
	
	// use Getter setter Method
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getMaths_marks() 
	{
		return Maths_marks;
	}
	public void setMaths_marks(int maths_marks) 
	{
		Maths_marks = maths_marks;
	}
	public StudentInfo (int id, String name, int age, int maths_marks)  // parameterized constructor
	{
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		Maths_marks = maths_marks;
	}
	public StudentInfo () // constructor super class
	{
		
	}
	
	
}


public class MinMaxAPI 
{

	public static void main(String[] args) 
	{
		List<StudentInfo > stud = new ArrayList<>();  // array list
		stud.add(new StudentInfo(1,"Arti",22,80));
		stud.add(new StudentInfo(2,"Punam",21,70));
		stud.add(new StudentInfo(3,"Neha",22,80));
		stud.add(new StudentInfo(4,"Shital",21,86));
		stud.add(new StudentInfo(5,"Kamini",22,58));
		
		
		System.out.println("Maximum Marks :");// use max function
		StudentInfo  SMax = stud.stream().max((stud1,stud2)->stud1.getMaths_marks()>stud2.getMaths_marks()?1:-1).get();
		System.out.println(SMax.getId()+" "+SMax.getName()+" "+SMax.getMaths_marks());
		
		
		
		System.out.println("Minimum Marks :"); // use min function
		StudentInfo  SMin = stud.stream().min((stud1,stud2)->stud1.getMaths_marks()>stud2.getMaths_marks()?1:-1).get();
		System.out.println(SMin.getId()+" "+SMin.getName()+" "+SMin.getMaths_marks());

	}

}