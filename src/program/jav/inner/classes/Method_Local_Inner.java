package program.jav.inner.classes;

class Outer { 
    
	void outerMethod() { 
        System.out.println("inside outerMethod"); 
        
        // Inner class is local to outerMethod() 
        class Inner { 
            void innerMethod() { 
                System.out.println("inside innerMethod"); 
            } 
        } 
        Inner y = new Inner(); 
        y.innerMethod();   // calling inner class method
    } 
} 

public class Method_Local_Inner { 
    public static void main(String[] args) { 
        Outer x = new Outer(); 
        x.outerMethod();   // calling uter class method
    } 
} 
