package classroom;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Amazon extends Utilities {
static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
Ibrowser("chrome","https://www.amazon.com");
WebElement acclist=driver.findElement(By.cssSelector("span[class='nav-line-2 ']"));
Actions act=new Actions(driver);
act.moveToElement(acclist).build().perform();
	Thread.sleep(2000);

	driver.close();
}

}
