class NestedIf
{
 public static void main(String args[])
{
   int a=(int)(Math.random()*100);
   int b=(int)(Math.random()*100);
   int c=(int)(Math.random()*100);
   System.out.println("a is :"+a);
   System.out.println("b is :"+b);
   System.out.println("c is :"+c);
   
 System.out.println("---------------------------------------------------------");

  if(a>b)
  { 
    if(a<c)
     System.out.println("a is  greater:"+a); 
    else  
	  System.out.println("c is greater :"+c);
   }

    else
	{
	  if(b>c)
        System.out.println("b is  greater:"+b); 
      else  
	  System.out.println("c is greater :"+c);
    }
   } 
}