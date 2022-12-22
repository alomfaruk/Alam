package amazonpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javascriputilites.Javascriptutilities;

public class todaysdeal {
WebDriver driver;
@FindBy(xpath="(//div[@id='nav-subnav']/descendant::span)[1]") WebElement todaysdealbutton;
@FindBy(xpath="//a[@id='nav-logo-sprites']") WebElement amazonredirect;

public void amazonredirectclcik() {
	amazonredirect.click();
}

public void todaydealsclick() {
	todaysdealbutton.click();
     Javascriptutilities.draW_border(driver, todaysdealbutton);
}
public todaysdeal(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements( driver,this);
}

}
