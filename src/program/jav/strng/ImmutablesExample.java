package program.jav.strng;

public class ImmutablesExample{  
	 public static void main(String args[]){  
		 
	   String s = "Sachin";  // String Literal---> objects are created in string pool
	   String p = "Sachin";
	   
	   if(s.equals(p))
	   {
		   System.out.println("true....");
	   }
	   else{
		   System.out.println("false....");
	   }
	   
	   s.concat(" Tendulkar");       //concat() method appends the string at the end  
	   s=s.concat(" Tendulkar");
	   
	   System.out.println("value of string added "+ s);       
	   
	   if(s.equals(p))
	   {
		   System.out.println("true....");
	   }
	   else{
		   System.out.println("false....");
	   }
	   
	   String s4 = "Hello";     // --> string pool object creation
	   String s5 = "Hello";
	   
	   // objects are created inside the heap
	   String s1 = new String("Hello");
	   String s3 = new String("Hello");
	   String s2 = new String("hello");
	   String t = s1;
	   
	   if(s4.equals(s1))
	   {
		   System.out.println("true?????");
	   }
	   else{
		   System.out.println("false????");
	   }
	   
	   if(s4==s1)
	   {
		   System.out.println("true?????");
	   }
	   else{
		   System.out.println("false????");
	   }
	   
	 }  
 }
