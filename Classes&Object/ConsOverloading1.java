// program 18:this keywoed to call the constructor

class Calc
{
  Calc(double a,double b)
  {
  this(3.3);
  System.out.println("double,double called");
  }
  
  Calc(double a)
  {
  System.out.println("double called");
  }
  
  Calc(int a,int b)
  { 
  this(2.3,4.5);
  System.out.println("int ,int called");
  }
}
class ConsOverloading1
{
  public static void main(String args[])
  {
    Calc c=new Calc(22,33);

  }
}