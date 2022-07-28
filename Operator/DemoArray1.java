class DemoArray1
{
 public static void main(String args[])
 {
  //String num[]=new String[10];
  //float num[]=new float[10];
  //boolean num[]=new boolean[10];
  // char num[]=new char[10];
  int num[]=new int[10]; 
  int len =num.length;
  System.out.println("array length is :"+len);
  
  for(int i=0;i<len;i++)
  {
   num[i]=(int)(Math.random()*100);
  System.out.println("num["+i+"] is:"+num[i]);
  
  }
 }
}