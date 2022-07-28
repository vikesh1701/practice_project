public class Demo
{
  Demo()
  {System.out.println("this is :"+this);}
}
public class FirstProgram2
{
 public static void main(String args[])
 {
  Demo d=new Demo();
  System.out.println(d);
  System.out.println("-----------------------------___________------------------");
  
  Demo d1=new Demo();
  System.out.println(d1);
 
 
 }
}