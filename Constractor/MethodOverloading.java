class calc
{
 void sum(int a,int b)
 {System.out.println("int,int called");}

 void sum(int a,int b,int c)
 {System.out.println("int,int,int called");}

 void sum(double a,double b)
 {System.out.println("double,double called");}

 void sum(double a,double b,double c)
 {System.out.println("double,double,double called");}
}
class MethodOverloading
{
 public static void main(String args[])
 {
  calc c=new calc();
   c.sum(10,20);
   c.sum(30,40,50);
   c.sum(10.0,20.0);
   c.sum(30.0,40.0,50.0);

 }
}





