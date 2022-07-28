class Hello
{
public static void main(String args[])
{
 int a=(int)(Math.random()*20);
 int b=(int)(Math.random()*20);
 int c=(int)(Math.random()*20);
 System.out.println("a is :"+a);
 System.out.println("b is :"+b);
 System.out.println("c is :"+c);
 if (a>b)
  {if (a>c)
  System.out.println("a is greater");
  else
  System.out.println("c is greater");
  }
 else if(b>c)
 System.out.println("b is greater");
 else
 System.out.println("c is greater"); 
}
}