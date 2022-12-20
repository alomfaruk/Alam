package classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementInterection extends Utilities {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String ud= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",ud+"/driver/chromedriver");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement serach= driver.findElement(By.cssSelector("input[class='gLFyf']"));
		Thread.sleep(2000);
		serach.click();
		Thread.sleep(1000);
		serach.sendKeys("abc");
		/*
		 * Actions act=new Actions(driver); act.keyDown(Keys.ENTER).build().perform();
		 * act.keyUp(Keys.ENTER).build().perform();
		 */
		WebElement searchbutton=driver.findElement(By.xpath("abcd"));
		JavascriptExecutor javaexecutor=(JavascriptExecutor)driver;
		javaexecutor.executeScript("arguments[]0.click()",searchbutton );
		
		Thread.sleep(10000);
		driver.close();

	}

}
