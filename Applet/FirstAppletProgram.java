import java.applet.Applet;
// <appletcode>: "FirstAppletProgram" width=500 heigth=300 </applet>
public class FirstAppletProgram extends Applet

{
  @Override
  public void init()
   {
    System.out.println("Applet create");
   }
  @Override
  public void start()
   {
    System.out.println("Applet start");
   }
  @Override
  public void stop()
   {
    System.out.println("Applet stop");
   }
   @Override
  public void destroy()
   {
    System.out.println("Applet destroy");
   }
}