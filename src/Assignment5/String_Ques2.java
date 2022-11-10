package Assignment5;

public class String_Ques2 {
	public static void main(String []args){
	      String str = "HeLlo";
	      String r = "";
	      for (int i = 0; i < str.length(); i++) {
	         char c = str.charAt(i);
	         if (Character.isUpperCase(c)) {
	           r = r + Character.toLowerCase(c);
	         }
	         else
	         {
	        	 r = r + Character.toUpperCase(c);
	         }
	        
	      }
	      System.out.println("Converting case: "+r);
	   }
	}
