class Demo
{
 Demo()
 {System.out.println("constructor called");}

 void Demo()
 {System.out.println("constuctor methode called");}

}
class DemoCons
{
 public static void main(String args[])
 {
 Demo d=new Demo();
 d.Demo();
 new Demo();
 

}
}