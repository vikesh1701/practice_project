interface MyInter
{
  int num=100;
    void show();
    void showMe();
  default void call()
  {
   System.out.println("call method  called");
  }
  static void callMe()
  {
    System.out.println(" CallMe called");
  }
}
class Demo implements MyInter
{
   @Override
   public void show()
	 {
	   System.out.println("show method called");
	 }
	@Override
    public void showMe()
	{
	  System.out.println("showMe method called ");
	}
}
class Main 
{
  public static void main(String args[])
  {
    Demo d=new Demo();
	d.show();
	d.showMe();
	d.call();
	MyInter.callMe();
	System.out.println(MyInter.num);
     
   }
}