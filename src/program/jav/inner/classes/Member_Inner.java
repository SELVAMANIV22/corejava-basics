package program.jav.inner.classes;

public class Member_Inner{  
	 
	private int data=30;  
	 
	class Inner{  
	  void msg(){System.out.println("data is "+data);}    // inner class accessing the outside private variable
	 }  
	
	
	
	public static void main(String args[]){  
	  
	  Member_Inner obj=new Member_Inner();     // creating object of Outer class
	  Member_Inner.Inner in=obj.new Inner();   // creating object of Inner class
	  in.msg();  
	 }  
	} 