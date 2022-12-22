package classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javascriputilites.Javascriptutilities;

public class Clickwithjavascripts extends Utilities {

	public static void main(String[] args) throws InterruptedException {
		Ibrowser("chrome","https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(2000);
		WebElement click= driver.findElement(By.xpath("(//table[@id='contactList']/descendant::input)[4]"));
		WebElement click1= driver.findElement(By.xpath("(//table[@id='contactList']/descendant::input)[3]"));
		
		Javascriptutilities.jsclick(driver, click);
		Thread.sleep(2000);
		Javascriptutilities.jsclick(driver, click1);
		

	}

}
