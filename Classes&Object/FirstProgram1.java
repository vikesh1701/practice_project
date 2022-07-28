class Demo
{
 int a=100;
 Demo()
 {
  int a=90;
  System.out.println("a is:"+a);
  System.out.println("this is:"+this);
 }
 void show()
 {
  System.out.println("now a is :"+a);
 }
}
class FirstProgram1
{ public static void main(String args [])
{
Demo d=new Demo();
d.show();

}
}
