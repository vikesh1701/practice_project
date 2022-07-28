class DemoPattern3
{
 public static void main(String args[])
 {
 int z=0;
   int n=6;
 for(int i=1;i<=n;i++)
 {
 for(int j=1;j<=n-i;j++)
 {
 System.out.print(j+z);
 }
  z++;
 System.out.println();
 }
 
 }}