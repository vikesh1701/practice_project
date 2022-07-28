class calc
{
 void sum(double a,int b)
 {System.out.println("double,int called");}

 void sum(int a,double b)
 {System.out.println("int,double called");}

 }
class MethodOverloading1
{
 public static void main(String args[])
 {
  calc c=new calc();
  // c.sum(10,20);
   c.sum(10.0,20);
   c.sum(30,40.0);
   }
}