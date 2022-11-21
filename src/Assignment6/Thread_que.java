package Assignment6;

public class Thread_que extends Thread
{  
	public void run()
	{
		//declare array
		int arr[]= {10,15,20,25,30};
		int square=1;
		for(int i=0;i<arr.length;i++)
		{
			square=arr[i]*arr[i];//find square
			System.out.println("Square "+arr[i]+" "+square);//print square
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Thread_que obj=new Thread_que();//creating object
   float avg=0;
   int sum=0;
   obj.start();//calling method
   for(int i=1;i<=50;i++)
   {
	   System.out.println(i);//print elements
	   sum+=i;//find sum
   }
   System.out.println("Sum:-"+sum);
   avg=sum/50;
   System.out.println("Average:-"+avg);//print average
	}
}