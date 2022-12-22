package hyrtutorials;

import org.testng.annotations.Test;

import hyrtutorials.calender;
import hyrtutorials.homepage;
import utilitiespack.utilities2;

public class task1 extends utilities2 {
  @Test(priority=1)
  public void f() throws InterruptedException {
homepage slpbo=new homepage(driver);
slpbo.seleniumpbuttonflashing();
slpbo.tutorialsbuttonscroll();
slpbo.calenderbuttonclick();
calender calbo=new calender(driver);
calbo.firstdate();
  }
  @Test(priority=2,dependsOnMethods = "f")
  public void test2() throws InterruptedException {
	  calender calbo=new calender(driver);
	  calbo.seconddate();
	  calbo.thirddateall();
	  calbo.fourthdate();
	  String currenturl= driver.getCurrentUrl();
	  System.out.println("the current url is="+currenturl);
	  String title= driver.getWindowHandle();
	  System.out.println("the page title is ="+title);
  }
}
