package Assignment5;

public class String_Ques2 {
	public static void main(String []args){
	      char c = 0;
	      String str = "HeLlo";
	      System.out.println("String in lowercase: "+str);
	      int len = str.length();
	      StringBuffer strBuffer = new StringBuffer(len);
	      for (int i = 0; i < len; i++) {
	         c = str.charAt(i);
	         if (Character.isTitleCase(c)) {
	            c = Character.toLowerCase(c);
	         }
	         if (Character.isUpperCase(c)) {
	            c = Character.toLowerCase(c);
	         }
	         if (Character.isLowerCase(c)) {
	            c = Character.toUpperCase(c);
	         }
	         strBuffer.append(c);
	      }
	      System.out.println("Converting case: "+strBuffer.toString());
	   }
	}
