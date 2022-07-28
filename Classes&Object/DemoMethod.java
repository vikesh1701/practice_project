// program 8

class Demo
{ 
  int sum(int value[])
  {
   int sum=0;
   for(int i:value)
   {
     sum=sum+i;
   }
  return sum;
  }
  int[] getvalues()
  {
    int arr[]={11,21,23,54,45,65};
	return arr;
	//return new int[]{22,33,44,55,66};
  }
}
  class DemoMethod
  {
    public static void main(String args[])
	{
	  Demo d=new Demo();
	  int arr[]={22,33,44,55,66};
	  int result=d.sum(arr);
	  System.out.println("result is :"+result);
	  System.out.println("--------------------");
	  
	  result =d.sum(new int[]{22,33,44,55,66,77});
	  System.out.println(result);
	  
	  System.out.println("--------------------");
	  int num[]= d.getvalues();
	  for(int i:num)
	  {
	   System.out.println(i);
	   result =d.sum(num);
	}
	  System.out.println(result);
	
	}
  }