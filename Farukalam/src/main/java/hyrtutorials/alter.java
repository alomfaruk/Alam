package hyrtutorials;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javascriptutilitespack.javascriptutilities;

public class alter {
	WebDriver driver;
	@FindBy(xpath="//a[text()='Alerts']")WebElement alterbutton;
	public void alterbuttonclick() {
		javascriptutilities.jsclick(driver, alterbutton);
		//List<WebElement> allbutton=driver.findElements(By.tagName("a"));
	//	int numberofbutton= allbutton.size();
		//for(int i=0;i<allbutton.size();i++) {
		//System.out.println("All button text"+allbutton.get(i).getText());
		//System.out.println("all link is="+allbutton.get(i).getAttribute("href"));
		}
	//}
	public alter (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
