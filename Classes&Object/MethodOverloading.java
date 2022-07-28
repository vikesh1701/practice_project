// program 10:all method having same name but different parameters

class Calc
{
  void sum(double a,double b)
  {System.out.println("double,double called");}
  
  void sum(double a,double b,double c)
  {System.out.println("double,double,double called");}
  
  void sum(int a,int b)
  {System.out.println("int,int called");}
  
  void sum(float a,double b)
  {System.out.println("float,double called");}
  
  void sum(double a,float b)
  {System.out.println("double,float called");}

}
class MethodOverloading
{ 
public static void main(String args[])
{
   Calc c=new Calc();
   c.sum(11.0,20.9);
   c.sum(30.9,4.9,50.9);
   c.sum(10,20);
   c.sum(10.0f,10.9);
   c.sum(19.0,39.0f);

}
}