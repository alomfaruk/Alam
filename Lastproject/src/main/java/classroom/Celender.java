package classroom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javascriputilites.Javascriptutilities;

public class Celender extends Utilities {

	public static void main(String[] args) throws InterruptedException, IOException {
		Ibrowser("chrome","https://www.amazon.com/");
		
		WebElement gift=driver.findElement(By.xpath("//h2[text()='Gifts for everyone, at every price']"));
		Thread.sleep(4000);
		//Javascriptutilities.flashing(gift, driver);
		//Javascriptutilities.draW_border(driver, gift);
		//screenshorts();
		Javascriptutilities.generatealert(driver,"this page button having problem");
		
		
		Thread.sleep(6000);
		//driver.close();
		

	}

}
