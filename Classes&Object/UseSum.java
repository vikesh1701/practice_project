// program 1

class Sum
{
 int a;
 int b;
}

class UseSum
{
 public static void main(String args[])
 {
  Sum s=new Sum();
  s.a=10;
  s.b=20;
  System.out.println(s.a+s.b);
  
  Sum s1=new Sum();
  s1.a=30;
  s1.b=40;
  System.out.println(s1.a+s1.b);

 }
}