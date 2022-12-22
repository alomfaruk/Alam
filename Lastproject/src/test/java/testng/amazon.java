package testng;

import org.testng.annotations.Test;

import amazonpom.Amazonhomepage;
import amazonpom.Coupnspage;
import amazonpom.Verymerypage;
import amazonpom.todaysdeal;
import utilitiespak.utilites;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class amazon extends utilites {
  @Test(priority=1)
  public void f() throws InterruptedException {
	  WebElement sellerbt=driver.findElement(By.linkText("Best Sellers"));
	  sellerbt.click();
	  
	  Amazonhomepage sb=new Amazonhomepage(driver);
	  sb.sendkeyssearchbar();
	  sb.merybuttonclick();
	  Verymerypage vmp=new Verymerypage(driver);
	  vmp.coupnsclick();
	  Coupnspage outob=new Coupnspage(driver);
	  outob.outletbuttonclick();
	Thread.sleep(2000);
	  
  }
  @Test(priority=2)
  public void test2() {
	  todaysdeal tdo=new todaysdeal(driver);
	
	  tdo.amazonredirectclcik();
	  Amazonhomepage sb=new Amazonhomepage(driver);
	  sb.sendkeyssearchbar();
	  sb.merybuttonclick();
	  Verymerypage vmp=new Verymerypage(driver);
	  vmp.coupnsclick();
	

	  
  }


}
