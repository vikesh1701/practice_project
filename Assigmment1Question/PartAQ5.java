//WAP to print maximum from three no.
class PartAQ5
{
  public static void main(String[]args)
  {
   int a=(int)(Math.random()*100);
   int b=(int)(Math.random()*100);
   int c=(int)(Math.random()*100);
  
  System.out.println(" number is a:"+a);
  System.out.println(" number is b:"+b);
  System.out.println(" number is c:"+c);


  if(a>b) 
      if(a>c)
	{
	System.out.println("greater number is a:"+a);
	}
  if(b>a)
     if(b>c)
  {
  System.out.println("greater number is b:"+b);
  }
  else
  {System.out.println("greater number is c:"+c);
   }
  }

}