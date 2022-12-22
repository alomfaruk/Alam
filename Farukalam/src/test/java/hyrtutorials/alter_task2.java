package hyrtutorials;

import org.testng.annotations.Test;

import utilitiespack.utilities2;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class alter_task2 extends utilities2{
	WebDriver driver;
  @Test
  public void f() {
	  homepage hob=new homepage(driver);
	  hob.seleniumpbuttonflashing();
  }
 
}
