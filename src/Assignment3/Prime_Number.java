package Assignment3;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=100,b=200;
			for(int i=a;i<=b;i++){
			    if(checkPrime(i)){
			        System.out.print(i+" " );
			    }
			}
		}
		public static boolean checkPrime(int num){
		    if(num<2){
		        return false;
		    }
		    else{
		        int x= num/2;
		        for(int i=2;i<x;i++){
		            if(num%i==0){
		                return false;
		            }
		        }
		    }
		    return true;
		

	}

}
