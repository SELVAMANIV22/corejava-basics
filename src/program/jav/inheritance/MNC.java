package program.jav.inheritance;

abstract class MOC
{
    MOC()
    {
        System.out.println("sysytem. in");
    }
abstract void leaves ();
abstract void salary ();
void bonus()
{
    System.out.println("bonus is :");
}
}
abstract class Infosys extends MOC
{
    void leaves()
    {
        System.out.println("leaves taken :");
    }
}
class hello1 extends Infosys
    {
    
    void salary() {
        System.out.println("salry credited is : ");
        }
    void Newemp()
    {
        System.out.println("new enployee is :");
    }
}
public class MNC {
    
    public static void main(String[] args) 
    {
        MOC k = new hello1(); 
        k.bonus();
        k.salary();
        k.leaves();   
        
        hello1 v = (hello1)k; // typecasting 
        v.Newemp();
    }
}
