package amazonpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazonhomepage {
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox") WebElement search_field;
	@FindBy(xpath="//a[text()='Very Merry Deals']") WebElement verymerybutton;
	
	public void merybuttonclick() {
		verymerybutton.click();
	}
	public void sendkeyssearchbar() {
		search_field.click();
		search_field.sendKeys("computer");
	}
	public Amazonhomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
