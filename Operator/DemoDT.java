class DemoDT
{
  public static void main(String[]args)
  {
   byte a=100;
   int c=a;      //destination=(destinatio type)source        but int data type is bigger than byte data type
   
   System.out.println("value of a is: "+ a);
  
   System.out.println("value of c is: "+ c);
  
  
  
   int i =1000;
   byte b=(byte)i;   //destination=(destinatio type)source
   
   System.out.println("value of i is: "+ i);
   
   System.out.println("value of b is: "+ b);
   
   
   
   
   double d=1000;
   long l=(long)d; //destination=(destinatio type)source
   
   System.out.println("value of d:"+d);
   
   System.out.println("value of l:"+l);
   
   
   
   double p=12.11;
   long num =(long)p;    //destination=(destinatio type)source
   System.out.println("value of p:"+p);
   
   
   System.out.println("value of num:"+num);
   
   float j=12.1111f;
   long g=(long)j;
   
   System.out.println("value of j:"+j);
   System.out.println("value of g:"+g);
   
   
   
   long number=123;
   float v= (float)number;    //destination=(destinatio type)source   
   System.out.println("value of number:"+number);
   System.out.println("value of v:"+v);
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  }
}