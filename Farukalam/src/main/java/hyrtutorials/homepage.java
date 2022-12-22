package hyrtutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javascriptutilitespack.javascriptutilities;

public class homepage {
	 WebDriver driver;
@FindBy(xpath="//a[text()='Selenium Practice']") WebElement seleniumpbtton;
@FindBy(xpath="(//a[text()='Tutorials'])[2]") WebElement tutorialsbutton;
@FindBy(xpath="//a[text()='Calendars Practice']")WebElement calenderbutton;

public void calenderbuttonclick() {
	
	javascriptutilities.draW_border(driver, calenderbutton);
	calenderbutton.click();
}

public void tutorialsbuttonscroll() {
	javascriptutilities.scrollIntoView(driver, seleniumpbtton);
}
public void seleniumpbuttonflashing() {
	javascriptutilities.flashingblue(seleniumpbtton, driver);
	javascriptutilities.draW_border(driver, seleniumpbtton);
	Actions act=new Actions(driver);
	act.moveToElement(seleniumpbtton).build().perform();
	
}
public homepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

}
