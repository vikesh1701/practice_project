 //program 7
 
 class Demo
 {
  String fullname(String first,String last)
  {
    return (first+" "+last);
  }
  boolean equal(int a, int b)
  {
    return (a==b);
  }
 }
 class UseDemo
 {
   public static void main(String args[])
   {
     Demo d=new Demo();
	 String a=d.fullname("VIKESH","GUPTA");
	System.out.println("full name is :"+a); 
     
	 boolean b=d.equal(10,10);
	 System.out.println("result is:"+b);
   }
 }
 