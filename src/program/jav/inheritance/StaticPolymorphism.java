package program.jav.inheritance;

class DisplayOverloading
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    
    public void disp(char c, long num)  
    {
         System.out.println(c + " "+num);
    }
    
    public double disp(int c)
    {
       System.out.println(c);
       return 0;
    } 
}

/*2 types of polymorphism:  Compile-time (static polymorphism) - mehtod overloading
run-time (dynamic polymorphism) -- method overriding*/
public class StaticPolymorphism
{
   public static void main(String args[])
   {
       DisplayOverloading obj = new DisplayOverloading();
       System.out.println(" a value is "+ 'a');
       
       obj.disp('a');
       obj.disp('a',10); //?
       obj.disp(5);
       
   }
}