class DemoRandom
{
 public static void main(String [] args)
 { int a=(int)(Math.random()*100);
   int b=(int)(Math.random()*100);
   int c=(int)(Math.random()*100);


 System.out.println(a+","+b+","+c);
 int result=((a>b)?((a>c)?a:c):((b>c)?b:c));
 System.out.println("greatest number id:" +result);
 System.out.println(result);
 
 
 System.out.println(a);
 
 System.out.println(b);
 
 System.out.println(c);
 
 
 System.out.println(a+b+c);
 
 
 System.out.println(a+b+c);
 }
}