package amazonpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verymerypage {
	WebDriver driver;
	
	@FindBy(xpath="(//div[@id='nav-subnav']/descendant::span)[2]") WebElement coupns;
	
	public void coupnsclick() {
		coupns.click();
	}
	public  Verymerypage (WebDriver driver) { 
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
