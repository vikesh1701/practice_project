class NestedFor2
{
public static void main(String args[])
{
 int rowcount=(int)(Math.random()*15);
 System.out.println("pattern height is:"+rowcount);
 for(int i=0;i<rowcount;i++)
 {
  for(int j=0;j<rowcount-i;j++)
 
  {
  System.out.print(" * ");
  }
 
 System.out.println();
 }
}
}