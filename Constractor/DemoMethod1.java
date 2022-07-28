class calc 
{
 boolean equal(int a,int b)
 {
  return (a==b); 
 }
 String FullName(String first,String last)
 {
 return (first+last);
 }
}
class DemoMethod1
{
 public static void main(String args[])
{
 calc c=new calc();

 System.out.println("reult is:"+( c.equal(20,20)));
 // String s=c.FullName(Vikesh,Gupta);
  System.out.println("welcom:"+c.FullName("Vikesh  ", " kumar Gupta"));
}
}