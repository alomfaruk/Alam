package amazonpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coupnspage {
WebDriver driver;

@FindBy(xpath="(//div[@id='nav-subnav']/descendant::span)[4]") WebElement outletbutton;

public void outletbuttonclick() {
	outletbutton.click();
}
public Coupnspage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

}
