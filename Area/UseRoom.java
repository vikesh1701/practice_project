class Room
{
int a;
int b;
}

class UseRoom
{
public static void main(String args[])
{
  Room r=new Room();
  r.a=200;
  r.b=300;
  System.out.println(r);
  System.out.println(r.a);
  System.out.println(r.b);
  
System.out.println("---------------------------------");

  Room r1=new Room();
  System.out.println(r1);
  r1.a=20;
  r1.b=30;
  System.out.println(r1.a);
  System.out.println(r1.b);
}
}